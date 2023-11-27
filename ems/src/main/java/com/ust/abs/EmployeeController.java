package com.ust.abs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")

public class EmployeeController {
    @Autowired
    private EmployeeService ems;

    @GetMapping
    public List<Employee> addNewEmployeesC(){return ems.getAllEmployeeDetails();}
    @GetMapping("/{id}")
    public Optional<Employee> addNewEmployeesByIdC(@PathVariable Long id){return ems.getEmployeeDetailsById(id);}
    @PostMapping
    public Employee addNewEmployees(@RequestBody Employee employee){return ems.addNewEmployee(employee);}
    @DeleteMapping("/{id}")
    public void deleteEmployees(@PathVariable Long id){ems.deleteEmployee(id);}
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id,@RequestBody Employee employee){return ems.updateEmployee(id,employee);}
}
