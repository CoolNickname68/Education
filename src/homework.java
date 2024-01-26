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


 
            clientOS = 1; // 0 — iOS, 1 — Android
            int clientDeviceYear = 2015;
    
            String message;
    
            if (clientOS == 0) {
                if (clientDeviceYear < 2015) {
                    message = "Установите облегченную версию приложения для iOS по ссылке";
                } else {
                    message = "Установите версию приложения для iOS по ссылке";
                }
            } else if (clientOS == 1) {
                if (clientDeviceYear < 2015) {
                    message = "Установите облегченную версию приложения для Android по ссылке";
                } else {
                    message = "Установите версию приложения для Android по ссылке";
                }
            } else {
                message = "Некорректная операционная система";
            }
    
            System.out.println(message);

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

        // задача 5
            int monthNumber = 12;
    
            // Проверка условия, при котором программа не будет выполняться
            if (monthNumber < 1 || monthNumber > 12) {
                System.out.println("Некорректный номер месяца. Программа завершена.");
            } else {
                // Определение сезона с использованием оператора switch
                String season;
                switch (monthNumber) {
                    case 1:
                    case 2:
                    case 12:
                        season = "зима";
                        break;
                    case 3:
                    case 4:
                    case 5:
                        season = "весна";
                        break;
                    case 6:
                    case 7:
                    case 8:
                        season = "лето";
                        break;
                    case 9:
                    case 10:
                    case 11:
                        season = "осень";
                        break;
                    default:
                        season = "невозможно определить";
                }
    
                // Вывод результата
                System.out.println("Месяц номер " + monthNumber + " принадлежит к сезону " + season + ".");
            }



        System.out.println("Потребуется дней: " + deliveryDays);
    }
}
