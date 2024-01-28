public class homework3 {

    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1:");
        int monthlyDeposit1 = 15000;
        int totalSavings1 = 0;
        int months1 = 0;

        while (totalSavings1 < 2459000) {
            months1++;
            totalSavings1 += monthlyDeposit1;
            System.out.println("Месяц " + months1 + ", сумма накоплений равна " + totalSavings1 + " рублей");
        }
        System.out.println("\n");

        // Задача 2
        System.out.println("Задача 2:");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println("\n");

        // Задача 3
        System.out.println("Задача 3:");
        int population = 12000000;
        double birthRate = 0.017; // 17 человек на 1000
        double deathRate = 0.008; // 8 человек
        int years = 10;

        for (int year = 1; year <= years; year++) {
            int births = (int) (population * birthRate);
            int deaths = (int) (population * deathRate);
            population += births - deaths;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println("\n");

        // Задача 4
        System.out.println("Задача 4:");
        double initialDeposit2 = 15000;
        double interestRate2 = 0.07; // 7% ежемесячно
        double targetAmount = 12000000;
        double totalSavings2 = 0;
        int months2 = 0;

        while (totalSavings2 < targetAmount) {
            months2++;
            totalSavings2 += initialDeposit2;
            initialDeposit2 *= (1 + interestRate2);
            System.out.println("Месяц " + months2 + ", сумма накоплений равна " + totalSavings2);
        }
        System.out.println("\n");

        // Задача 5
        System.out.println("Задача 5:");
        double initialDeposit3 = 15000;
        double interestRate3 = 0.07; // 7% ежемесячно
        double totalSavings3 = 0;
        int months3 = 0;

        while (totalSavings3 < targetAmount) {
            months3++;
            totalSavings3 += initialDeposit3;
            initialDeposit3 *= (1 + interestRate3);
            if (months3 % 6 == 0) {
                System.out.println("Месяц " + months3 + ", сумма накоплений равна " + totalSavings3);
            }
        }
        System.out.println("\n");

        // Задача 6
        System.out.println("Задача 6:");
        double initialDeposit4 = 15000;
        double interestRate4 = 0.07; // 7% ежемесячно
        double totalSavings4 = 0;
        int months4 = 0;
        int years4 = 9;

        for (int year = 1; year <= years4 * 2; year++) {
            months4++;
            totalSavings4 += initialDeposit4;
            initialDeposit4 *= (1 + interestRate4);
            if (months4 % 6 == 0) {
                System.out.println("Полгода " + (months4 / 6) + ", сумма накоплений равна " + totalSavings4);
            }
        }
        System.out.println("\n");

        // Задача 7
        System.out.println("Задача 7:");
        int firstFriday = 6; // Пусть 6-е число месяца - первая пятница
        int daysInMonth = 31;

        for (int day = firstFriday; day <= daysInMonth; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }
        System.out.println("\n");

        // Задача 8
        System.out.println("Задача 8:");
        int cometPeriod = 79;
        int startYear = 200;
        int endYear = startYear + 100;

        for (int year = startYear; year <= endYear; year += cometPeriod) {
            System.out.println(year);
        }
    }
}
