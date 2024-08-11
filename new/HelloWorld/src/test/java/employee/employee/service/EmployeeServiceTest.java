package employee.employee.service;
import com.employee.employee.model.Employee;
import com.employee.employee.service.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeServiceTest {

    private EmployeeService employeeService;

    @BeforeEach
    void setUp() {
        employeeService = new EmployeeService();
    }

    @Test
    void addEmployee_ShouldAddEmployee_WhenEmployeeIsNew() {
        Employee employee = new Employee(1, "John", "Doe", 1, 5000);
        Employee result = employeeService.addEmployee(employee);

        assertEquals(employee, result);
        assertEquals(1, employeeService.getAllEmployees().size());
    }

    @Test
    void addEmployee_ShouldThrowException_WhenEmployeeAlreadyExists() {
        Employee employee = new Employee(1, "John", "Doe", 1, 5000);
        employeeService.addEmployee(employee);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            employeeService.addEmployee(employee);
        });

        String expectedMessage = "Сотрудник с ID 1 уже существует";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void getEmployeeById_ShouldReturnEmployee_WhenEmployeeExists() {
        Employee employee = new Employee(1, "John", "Doe", 1, 5000);
        employeeService.addEmployee(employee);

        Employee result = employeeService.getEmployeeById(1);
        assertEquals(employee, result);
    }

    @Test
    void getEmployeeById_ShouldThrowException_WhenEmployeeDoesNotExist() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            employeeService.getEmployeeById(999);
        });

        String expectedMessage = "Сотрудник с ID 999 не найден";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void updateEmployee_ShouldUpdateEmployee_WhenEmployeeExists() {
        Employee employee = new Employee(1, "John", "Doe", 1, 5000);
        employeeService.addEmployee(employee);

        Employee updatedEmployee = new Employee(1, "John", "Doe", 1, 5000);
        Employee result = employeeService.updateEmployee(1, updatedEmployee);

        assertEquals(updatedEmployee.getName(), result.getName());
        assertEquals(updatedEmployee.getSalary(), result.getSalary());
        assertEquals(updatedEmployee.getDepartmentId(), result.getDepartmentId());
    }

    @Test
    void deleteEmployee_ShouldRemoveEmployee_WhenEmployeeExists() {
        Employee employee = new Employee(1, "John", "Doe", 1, 5000);
        employeeService.addEmployee(employee);

        employeeService.deleteEmployee(1);

        assertEquals(0, employeeService.getAllEmployees().size());
    }

    @Test
    void deleteEmployee_ShouldThrowException_WhenEmployeeDoesNotExist() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            employeeService.deleteEmployee(999);
        });

        String expectedMessage = "Сотрудник с ID 999 не найден";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
