package com.dev24.spring_demo.repository;

import com.dev24.spring_demo.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByName(String Name);

    List<Employee> findByNameAndLastName(String name, String lastName);

    @Query("SELECT e FROM Employee e WHERE e.name = :name")
    List<Employee> findByNameQuery(@Param("name") String name);

    @Query(value = "SELECT * FROM employee  e WHERE e.name = :name", nativeQuery = true)
    List<Employee> findByNameQueryNative(@Param("name") String name);
}