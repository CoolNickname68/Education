package com.employee.employee;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employee.exception.EmployeeAlreadyAddedException;
import com.employee.employee.exception.EmployeeNotFoundException;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public ResponseEntity<?> addEmployee(@RequestParam String firstName, @RequestParam String lastName,
                                         @RequestParam double salary, @RequestParam String department) {
        try {
            employeeService.addEmployee(firstName, lastName, salary, department);
            return ResponseEntity.ok("Employee added successfully");
        } catch (EmployeeAlreadyAddedException ex) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
        }
    }
    


    
    @GetMapping("/remove")
    public ResponseEntity<?> removeEmployee(@RequestParam String firstName, @RequestParam String lastName) {
        try {
            Employee removedEmployee = employeeService.removeEmployee(firstName, lastName);
            return ResponseEntity.ok(removedEmployee);
        } catch (EmployeeNotFoundException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
        }
    }
    
    
    @GetMapping("/find")
    public ResponseEntity<?> findEmployee(@RequestParam String firstName, @RequestParam String lastName) {
        try {
            Employee employee = employeeService.findEmployee(firstName, lastName);
            return ResponseEntity.ok(employee);
        } catch (EmployeeNotFoundException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
        }
    }
    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    } 
    @GetMapping("/all-grouped")
    public Map<String, List<Employee>> getAllEmployeesGroupedByDepartment() {
        return employeeService.getAllEmployeesGroupedByDepartment();
    }
    
}

