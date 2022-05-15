package com.dev24.spring_demo.web.rest;

import com.dev24.spring_demo.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentResource {

    @GetMapping("/students/getAll")
    public ResponseEntity getAll() {
        Student student1 = new Student(1L, "Aziz1", "Azizov1", "1-kurs");
        Student student2 = new Student(2L, "Aziz2", "Azizov2", "2-kurs");
        Student student3 = new Student(3L, "Aziz3", "Azizov3", "3-kurs");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        return ResponseEntity.ok(students);
    }

    @GetMapping("/students/{id}")
    public ResponseEntity getOne(@PathVariable Long id){
        Student student = new Student(id, "Saud", "Saidov", "5-cource");
        return ResponseEntity.ok(student);
    }

    @PostMapping("/students")
    public ResponseEntity create(@RequestBody Student student){
        return ResponseEntity.ok(student);
    }

    @PutMapping("/students/{id}")
    public ResponseEntity update(@PathVariable Long id,
                                 @RequestBody Student studentNew){
        Student student = new Student(1L, "Ahror", "Zoirov", "1-kurs");
        student.setName(studentNew.getName());
        student.setLastName(studentNew.getLastName());
        student.setCourse(studentNew.getCourse());
        return ResponseEntity.ok(student);
    }

    @GetMapping("/students")
    public ResponseEntity getOne(@RequestParam Long id,
                                 @RequestParam String name,
                                 @RequestParam String lastName,
                                 @RequestParam String course){
        Student student = new Student(id, name, lastName, course);
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        return ResponseEntity.ok("Data deleted");
    }
}
