package com.employee.employee.service;

import com.employee.employee.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;




@Service
public class EmployeeService {

    private final List<Employee> employees = new ArrayList<>();

    // Метод для получения всех сотрудников
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees);
    }

    // Метод для получения сотрудника по ID
    public Employee getEmployeeById(int id) {
        return employees.stream()
                .filter(employee -> employee.getId() == id)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Сотрудник с ID " + id + " не найден"));
    }

    // Метод для добавления нового сотрудника
    public Employee addEmployee(Employee employee) {
        // Проверка, существует ли уже сотрудник с таким же ID
        Optional<Employee> existingEmployee = employees.stream()
                .filter(e -> e.getId() == employee.getId())
                .findFirst();

        if (existingEmployee.isPresent()) {
            throw new IllegalArgumentException("Сотрудник с ID " + employee.getId() + " уже существует");
        }

        employees.add(employee);
        return employee;
    }

    // Метод для удаления сотрудника по ID
    public void deleteEmployee(int id) {
        Employee employee = getEmployeeById(id);
        employees.remove(employee);
    }

    // Метод для обновления данных сотрудника
    public Employee updateEmployee(int id, Employee updatedEmployee) {
        Employee employee = getEmployeeById(id);
        employee.setName(updatedEmployee.getName());
        employee.setSalary(updatedEmployee.getSalary());
        employee.setDepartment(updatedEmployee.getDepartmentId());
        return employee;
    }
}