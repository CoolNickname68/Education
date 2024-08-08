package com.employee.employee;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    
    private final EmployeeService employeeService;

    public DepartmentController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/departments/max-salary")
    public ResponseEntity<Employee> getEmployeeWithMaxSalary(@RequestParam int departmentId) {
        Employee employee = employeeService.getEmployeeWithMaxSalaryByDepartment(departmentId);
        return ResponseEntity.ok(employee);
    }

    @GetMapping("/departments/min-salary")
    public ResponseEntity<Employee> getEmployeeWithMinSalary(@RequestParam int departmentId) {
        Employee employee = employeeService.getEmployeeWithMinSalaryByDepartment(departmentId);
        return ResponseEntity.ok(employee);
    }

    @GetMapping("/departments/all")
    public ResponseEntity<List<Employee>> getAllEmployeesByDepartment(@RequestParam(required = false) Integer departmentId) {
        if (departmentId != null) {
            List<Employee> employees = employeeService.getAllEmployeesByDepartment(departmentId);
            return ResponseEntity.ok(employees);
        } else {
            List<Employee> allEmployees = employeeService.getAllEmployees();
            return ResponseEntity.ok(allEmployees);
        }
    }

    @GetMapping("/departments/all-grouped")
    public ResponseEntity<Map<String, List<Employee>>> getAllEmployeesGroupedByDepartment() {
        Map<String, List<Employee>> employeesGroupedByDepartment = employeeService.getAllEmployeesGroupedByDepartment();
        return ResponseEntity.ok(employeesGroupedByDepartment);
    }
}
