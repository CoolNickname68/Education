public class Main {
    private static Employee[] employees = new Employee[10];

    
    public static void main(String[] args) {
        // Добавим несколько сотрудников для примера
        employees[0] = new Employee("Иванов Иван", 1, 1000);
        employees[1] = new Employee("Петров Петр", 2, 1500);
        employees[2] = new Employee("Сидоров Сидор", 3, 1200);

        System.out.println("Список всех сотрудников:");
        printAllEmployees();

        System.out.println("Сумма затрат на ЗП в месяц: " + calculateTotalSalary());

        System.out.println("Сотрудник с минимальной ЗП: " + findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной ЗП: " + findEmployeeWithMaxSalary());

        System.out.println("Среднее значение зарплат: " + calculateAverageSalary());
    }

    public static void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static double calculateTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee minSalaryEmployee = null;
        double minSalary = Double.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee maxSalaryEmployee = null;
        double maxSalary = Double.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public static double calculateAverageSalary() {
        int count = 0;
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
                count++;
            }
        }
        return totalSalary / count;
    }
}





