package com.employee.employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.employee.employee.exception.EmployeeAlreadyAddedException;
import com.employee.employee.exception.EmployeeNotFoundException;
import com.employee.employee.exception.EmployeeStorageIsFullException;

@Service
public class EmployeeService {
    private final List<Employee> employeeList = new ArrayList<>();
    private final Map<String, Integer> departmentIdMap = new HashMap<>();
    private static final int MAX_EMPLOYEES = 100; // Пример значения

    public Employee addEmployee(String firstName, String lastName, double salary, String department) {
        Employee employee = new Employee(firstName, lastName, salary, department);

        // Проверка наличия цифр в firstName или lastName
        if (containsDigit(firstName) || containsDigit(lastName)) {
            throw new IllegalArgumentException();
        }

        if (employeeList.contains(employee)) {
            throw new EmployeeAlreadyAddedException("Employee already exists.");
        }
        // Проверка на максимальное количество сотрудников
        if (employeeList.size() >= MAX_EMPLOYEES) {
            throw new EmployeeStorageIsFullException("Employee storage is full.");
        }

        int departmentId = getOrCreateDepartmentId(department);
        employee.setDepartmentId(departmentId);
        employeeList.add(employee);

        return employee; // Возвращает добавленного сотрудника
    }

    // Обработчик исключения для IllegalArgumentException
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }
    
    private boolean containsDigit(String s) {
        return s != null && s.matches(".*\\d.*");
    }
    

    private int getOrCreateDepartmentId(String department) {
        return departmentIdMap.computeIfAbsent(department, key -> departmentIdMap.size());
    }

    public Employee removeEmployee(String firstName, String lastName) {
        Employee employeeToRemove = findEmployee(firstName, lastName);
        if (employeeToRemove == null) {
            throw new EmployeeNotFoundException("Employee not found.");
        }
        employeeList.remove(employeeToRemove);
        return employeeToRemove;
    }

    public Employee findEmployee(String firstName, String lastName) {
        return employeeList.stream()
                .filter(employee -> employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName))
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found."));
    }

    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    public Employee getEmployeeWithMaxSalaryByDepartment(int departmentId) {
        return employeeList.stream()
                .filter(employee -> employee.getDepartmentId() == departmentId)
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElseThrow(() -> new RuntimeException("No employees found for department: " + departmentId));
    }

    public Employee getEmployeeWithMinSalaryByDepartment(int departmentId) {
        return employeeList.stream()
                .filter(employee -> employee.getDepartmentId() == departmentId)
                .min(Comparator.comparingDouble(Employee::getSalary))
                .orElseThrow(() -> new RuntimeException("No employees found for department: " + departmentId));
    }

    public List<Employee> getAllEmployeesByDepartment(int departmentId) {
        return employeeList.stream()
                .filter(employee -> employee.getDepartmentId() == departmentId)
                .collect(Collectors.toList());
    }

    public Map<String, List<Employee>> getAllEmployeesGroupedByDepartment() {
        return employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
    }
}
