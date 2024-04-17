// EmployeeService.java
package com.employee.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.employee.exception.EmployeeAlreadyAddedException;
import com.employee.employee.exception.EmployeeNotFoundException;
import com.employee.employee.exception.EmployeeStorageIsFullException;

@Service
public class EmployeeService {
    private final List<Employee> employeeList = new ArrayList<>();
    private static final int MAX_EMPLOYEES = 100; // Пример значения

    public void addEmployee(Employee employee) {
        if (employeeList.contains(employee)) {
            throw new EmployeeAlreadyAddedException("Employee already exists.");
        }
        // Проверка на максимальное количество сотрудников
        if (employeeList.size() >= MAX_EMPLOYEES) {
            throw new EmployeeStorageIsFullException("Employee storage is full.");
        }
        employeeList.add(employee);
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
        for (Employee employee : employeeList) {
            if (employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName)) {
                return employee;
            }
        }
        throw new EmployeeNotFoundException("Employee not found.");
    }

    public List<Employee> getAllEmployees() {
        return employeeList;
    }
}
