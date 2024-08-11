package com.employee.employee.model;

import java.util.Objects;

public class Employee {
    private int id;  // Добавляем поле id
    private String firstName;
    private String lastName;
    private int departmentId;
    private int salary;

    // Обновляем конструктор, чтобы включить id
    public Employee(int id, String firstName, String lastName, int departmentId, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentId = departmentId;
        this.salary = salary;
    }


    // Добавляем getter для id
    public int getId() {
        return id;
    }

    // Можно добавить и setter для id, если нужно менять id после создания объекта
    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    // Метод getName для возврата полного имени
    public String getName() {
        return firstName + " " + lastName; // Возвращаем firstName + пробел + lastName
    }
    public String getLastName() {
        return lastName;
    }
    // Метод setName для установки имени и фамилии
    public void setName(String name) {
        // Разделяем строку на имя и фамилию по пробелу
        String[] parts = name.split(" ");
        if (parts.length == 2) {  // Если имя и фамилия указаны правильно
            this.firstName = parts[0];
            this.lastName = parts[1];
        } else {
            throw new IllegalArgumentException("Имя должно быть в формате 'Имя Фамилия'");
        }
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartment(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&  // Добавляем сравнение по id
                departmentId == employee.departmentId &&
                salary == employee.salary &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, departmentId, salary);  // Включаем id в hashCode
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +  // Добавляем id в toString
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", departmentId=" + departmentId +
                ", salary=" + salary +
                '}';
    }
}