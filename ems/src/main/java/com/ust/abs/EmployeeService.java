package com.ust.abs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository emp;

    public List<Employee> getAllEmployeeDetails() { return emp.findAll(); }
    public Optional<Employee> getEmployeeDetailsById(Long id){return  emp.findById(id);}
    public Employee addNewEmployee(Employee employee){return emp.save(employee);}
    public void deleteEmployee(Long id){emp.deleteById(id);}
    public Employee updateEmployee(Long id,Employee employee)
    {
        if(emp.existsById(id))
        {
            employee.setId(id);
            return emp.save(employee);
        }
        return null;
    }
}
