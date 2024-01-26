public class homework {
    public static void main(String[] args) {
        // Задача 1
        int clientOS = 0; // 0 — iOS, 1 — Android

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача 2
        int clientDeviceYear = 2015;

        if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача 3
        int year = 2021;

        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Задача 4
        int deliveryDistance = 95;

        int deliveryDays;

        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (20 < deliveryDistance && deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (60 < deliveryDistance && deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = 0; // Свыше 100 км доставки нет
        }

        System.out.println("Потребуется дней: " + deliveryDays);
    }
}

