package employee.employee.service;
import com.employee.employee.model.Employee;
import com.employee.employee.service.DepartmentService;
import com.employee.employee.service.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class DepartmentServiceTest {

    @Mock
    private EmployeeService employeeService;

    @InjectMocks
    private DepartmentService departmentService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetEmployeesByDepartment() {
        Employee employee1 = new Employee(1, "John", "Doe", 1, 5000);
        Employee employee2 = new Employee(2, "Jane", "Smith", 1, 6000);

        when(employeeService.getAllEmployees()).thenReturn(Arrays.asList(employee1, employee2));

        List<Employee> result = departmentService.getEmployeesByDepartment(1);

        assertEquals(2, result.size());
        assertTrue(result.contains(employee1));
        assertTrue(result.contains(employee2));
    }

    @Test
    void testGetDepartmentSalarySum() {
        Employee employee1 = new Employee(1, "John", "Doe", 1, 5000);
        Employee employee2 = new Employee(2, "Jane", "Smith", 1, 6000);

        when(employeeService.getAllEmployees()).thenReturn(Arrays.asList(employee1, employee2));

        int sum = departmentService.getDepartmentSalarySum(1);

        assertEquals(11000, sum);
    }

    @Test
    void testGetMaxSalaryByDepartment() {
        Employee employee1 = new Employee(1, "John", "Doe", 1, 5000);
        Employee employee2 = new Employee(2, "Jane", "Smith", 1, 6000);

        when(employeeService.getAllEmployees()).thenReturn(Arrays.asList(employee1, employee2));

        int maxSalary = departmentService.getMaxSalaryByDepartment(1);

        assertEquals(6000, maxSalary);
    }

    @Test
    void testGetMinSalaryByDepartment() {
        Employee employee1 = new Employee(1, "John", "Doe", 1, 5000);
        Employee employee2 = new Employee(2, "Jane", "Smith", 1, 6000);

        when(employeeService.getAllEmployees()).thenReturn(Arrays.asList(employee1, employee2));

        int minSalary = departmentService.getMinSalaryByDepartment(1);

        assertEquals(5000, minSalary);
    }

    @Test
    void testGetAllEmployeesByDepartments() {
        Employee employee1 = new Employee(1, "John", "Doe", 1, 5000);
        Employee employee2 = new Employee(2, "Jane", "Smith", 2, 6000);

        when(employeeService.getAllEmployees()).thenReturn(Arrays.asList(employee1, employee2));

        Map<Integer, List<Employee>> result = departmentService.getAllEmployeesByDepartments();

        assertEquals(2, result.size());
        assertTrue(result.get(1).contains(employee1));
        assertTrue(result.get(2).contains(employee2));
    }

    @Test
    void testGetMaxSalaryByDepartment_ThrowsExceptionWhenNoEmployees() {
        when(employeeService.getAllEmployees()).thenReturn(Collections.emptyList());

        assertThrows(RuntimeException.class, () -> departmentService.getMaxSalaryByDepartment(1));
    }

    @Test
    void testGetMinSalaryByDepartment_ThrowsExceptionWhenNoEmployees() {
        when(employeeService.getAllEmployees()).thenReturn(Collections.emptyList());

        assertThrows(RuntimeException.class, () -> departmentService.getMinSalaryByDepartment(1));
    }
}
