package com.dev24.spring_demo.web.rest;

import com.dev24.spring_demo.domain.Employee;
import com.dev24.spring_demo.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeResource {
    private final EmployeeService employeeService;

    public EmployeeResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employees")
    public ResponseEntity create(@RequestBody Employee employee) {
        Employee employee1 = employeeService.save(employee);
        return ResponseEntity.ok(employee1);
    }

    //(@RequestBody Employee employee) - bu postmandan kelgan datani Employee classiga yuborib uni employee deb oladi
    //Employee employee1 = employeeService.save(employee) - employee da kelgan data EmployeeService ning save metodi orqali DataBase ga yozilib
    // Response bo'lib qaytadi
    @GetMapping("/employees")
    public ResponseEntity getAll() {
        List<Employee> employeeList = employeeService.findAll();
        return ResponseEntity.ok(employeeList);
    }

    @GetMapping("/employees/{name}")
    public ResponseEntity getAll(@PathVariable String name) {
        List<Employee> employeeList = employeeService.findByName(name);
        return ResponseEntity.ok(employeeList);
    }
    @GetMapping("/employees/search")
    public ResponseEntity getAllSearch(@RequestParam String name) {
        List<Employee> employeeList = employeeService.findAllByParam(name);
        return ResponseEntity.ok(employeeList);
    }
}