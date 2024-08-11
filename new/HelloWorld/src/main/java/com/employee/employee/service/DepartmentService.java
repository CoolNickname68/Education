package com.employee.employee.service;

import com.employee.employee.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class DepartmentService {
    private final EmployeeService employeeService;

    public DepartmentService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public List<Employee> getEmployeesByDepartment(int departmentId) {
        return employeeService.getAllEmployees().stream()
                .filter(employee -> employee.getDepartmentId() == departmentId)
                .collect(Collectors.toList());
    }

    public int getDepartmentSalarySum(int departmentId) {
        return getEmployeesByDepartment(departmentId).stream()
                .mapToInt(Employee::getSalary)
                .sum();
    }

    public int getMaxSalaryByDepartment(int departmentId) {
        return getEmployeesByDepartment(departmentId).stream()
                .mapToInt(Employee::getSalary)
                .max()
                .orElseThrow(() -> new RuntimeException("No employees in department " + departmentId));
    }

    public int getMinSalaryByDepartment(int departmentId) {
        return getEmployeesByDepartment(departmentId).stream()
                .mapToInt(Employee::getSalary)
                .min()
                .orElseThrow(() -> new RuntimeException("No employees in department " + departmentId));
    }

    public Map<Integer, List<Employee>> getAllEmployeesByDepartments() {
        return employeeService.getAllEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getDepartmentId));
    }
}
