public class homework2 {

    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Задача 2
        System.out.println("Задача 2:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Задача 3
        System.out.println("Задача 3:");
        for (int i = 0; i <= 17; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Задача 4
        System.out.println("Задача 4:");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Задача 5
        System.out.println("Задача 5:");
        for (int year = 1904; year <= 2096; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным");
            }
        }
        System.out.println("\n");

        // Задача 6
        System.out.println("Задача 6:");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Задача 7
        System.out.println("Задача 7:");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Задача 8
        System.out.println("Задача 8:");
        int monthlyDeposit = 29000;
        int totalSavings = 0;
        for (int month = 1; month <= 12; month++) {
            totalSavings += monthlyDeposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavings + " рублей");
        }
        System.out.println("\n");

        // Задача 9
        System.out.println("Задача 9:");
        double initialDeposit = 0;
        double interestRate = 0.12;
        double totalSavingsWithInterest = 0;
        for (int month = 1; month <= 12; month++) {
            initialDeposit += monthlyDeposit;
            totalSavingsWithInterest += initialDeposit * (1 + interestRate);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavingsWithInterest + " рублей");
        }
        System.out.println("\n");

        // Задача 10
        System.out.println("Задача 10:");
        int multiplier = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(multiplier + "*" + i + "=" + (multiplier * i));
        }
    }
}
