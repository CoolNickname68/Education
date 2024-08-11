package com.employee.employee.controller;

import com.employee.employee.model.Employee;
import com.employee.employee.service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/{id}/employees")
    public List<Employee> getEmployeesByDepartment(@PathVariable int id) {
        return departmentService.getEmployeesByDepartment(id);
    }

    @GetMapping("/{id}/salary/sum")
    public int getDepartmentSalarySum(@PathVariable int id) {
        return departmentService.getDepartmentSalarySum(id);
    }

    @GetMapping("/{id}/salary/max")
    public int getMaxSalaryByDepartment(@PathVariable int id) {
        return departmentService.getMaxSalaryByDepartment(id);
    }

    @GetMapping("/{id}/salary/min")
    public int getMinSalaryByDepartment(@PathVariable int id) {
        return departmentService.getMinSalaryByDepartment(id);
    }

    @GetMapping("/employees")
    public Map<Integer, List<Employee>> getAllEmployeesByDepartments() {
        return departmentService.getAllEmployeesByDepartments();
    }
}
