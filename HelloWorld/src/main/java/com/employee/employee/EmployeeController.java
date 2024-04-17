package com.employee.employee;

import java.util.List;

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
    public ResponseEntity<?> addEmployee(@RequestParam String firstName, @RequestParam String lastName) {
        try {
            Employee employee = new Employee(firstName, lastName);
            employeeService.addEmployee(employee);
            return ResponseEntity.ok(employee);
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
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }    
    
}

