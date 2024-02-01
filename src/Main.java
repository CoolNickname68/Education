import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // Задача 1
        int yearToCheck = 2021;
        checkLeapYear(yearToCheck);

        System.out.println(); // Пустая строка для разделения вывода задач

        // Задача 2
        int clientDeviceYear = 2015;
        int osType = 0; // 0 для iOS, 1 для Android
        installApp(clientDeviceYear, osType);

        System.out.println(); // Пустая строка для разделения вывода задач

        // Задача 3
        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryDays);
    }

    // Задача 1
    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    // Задача 2
    public static void installApp(int clientDeviceYear, int osType) {
        int currentYear = LocalDate.now().getYear();

        if (clientDeviceYear < currentYear) {
            if (clientDeviceYear < 2015) {
                if (osType == 0) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else if (osType == 1) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
            } else {
                System.out.println("Установите обычную версию приложения");
            }
        } else {
            System.out.println("Установите обычную версию приложения");
        }
    }

    // Задача 3
    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return 0; // Если расстояние больше 100 км, то доставка не предусмотрена
        }
    }
}






