
public class Main {


    public static void main(String[] args) {
        byte fish = 14;
        int dog = 35000;
        short bird = 400;
        long whale = 900000000000000000L;
        float cat = 32.34123F;
        double lion = 31.123548971;

        System.out.println("Fish: " + fish + ", Dog: " + dog + ", Bird: " + bird + ", Whale: " + whale + ", Cat: " + cat + ",Lion: " + lion);


        double doubleValue = 27.12;
        long longValue = 987678965549L;
        int intValue = 2786;
        short shortValue = 569;
        int negativeValue = -159;
        int anotherIntValue = 27897;
        byte byteValue = 67;

        System.out.println("Double Value: " + doubleValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Int Value: " + intValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Negative Value: " + negativeValue);
        System.out.println("Another Int Value: " + anotherIntValue);
        System.out.println("Byte Value: " + byteValue);


        int studentsInClass1 = 23;
        int studentsInClass2 = 27;
        int studentsInClass3 = 30;

        // Общее количество листов бумаги
        int totalSheets = 480;

        // Рассчитываем количество листов бумаги для каждого ученика в каждом классе
        int sheetsPerStudentInClass1 = totalSheets / studentsInClass1;
        int sheetsPerStudentInClass2 = totalSheets / studentsInClass2;
        int sheetsPerStudentInClass3 = totalSheets / studentsInClass3;

        // Выводим результат в консоль
        System.out.println("На каждого ученика в первом классе рассчитано " + sheetsPerStudentInClass1 + " листов бумаги");
        System.out.println("На каждого ученика во втором классе рассчитано " + sheetsPerStudentInClass2 + " листов бумаги");
        System.out.println("На каждого ученика в третьем классе рассчитано " + sheetsPerStudentInClass3 + " листов бумаги");

        // Производительность машины (бутылок за 2 минуты)
        int bottlesPer2Minutes = 16;

        // Рассчитываем производительность машины за разные промежутки времени
        int bottlesPer20Minutes = bottlesPer2Minutes * 10;
        int bottlesPerDay = bottlesPer2Minutes * (24 * 60 / 2);
        int bottlesPer3Days = bottlesPerDay * 3;
        int bottlesPerMonth = bottlesPerDay * 30;

        // Выводим результат в консоль
        System.out.println("За 20 минут машина произвела " + bottlesPer20Minutes + " штук бутылок");
        System.out.println("В сутки машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesPer3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesPerMonth + " штук бутылок");
        

        // Общее количество банок краски для ремонта
        int totalPaintCans = 120;

        // Количество банок краски для одного класса
        int whitePaintPerClass = 2;
        int brownPaintPerClass = 4;

        // Количество классов
        int numberOfClasses = totalPaintCans / (whitePaintPerClass + brownPaintPerClass);

        // Рассчитываем количество банок каждого цвета краски
        int whitePaintCans = numberOfClasses * whitePaintPerClass;
        int brownPaintCans = numberOfClasses * brownPaintPerClass;

        // Выводим результат в консоль
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " +
                whitePaintCans + " банок белой краски и " +
                brownPaintCans + " банок коричневой краски");
        

    
                int weightOfBanana = 80;
                int quantityOfBanana = 5;
                int weightOfMilk = 105; // 100 мл молока = 105 грамм
                int quantityOfMilk = 200 / weightOfMilk; // Общий объем молока в миллилитрах
                int weightOfIceCream = 100;
                int quantityOfIceCream = 2;
                int weightOfEgg = 70;
                int quantityOfEgg = 4;
        
                // Рассчитываем общий вес завтрака в граммах
                int totalWeightInGrams = (weightOfBanana * quantityOfBanana) +
                        (weightOfMilk * quantityOfMilk) +
                        (weightOfIceCream * quantityOfIceCream) +
                        (weightOfEgg * quantityOfEgg);
        
                // Рассчитываем общий вес завтрака в килограммах
                double totalWeightInKilograms = totalWeightInGrams / 1000.0;
        
                // Выводим результат в консоль
                System.out.println("Вес завтрака: " + totalWeightInGrams + " грамм");
                System.out.println("Вес завтрака: " + totalWeightInKilograms + " килограмм");


    


        // Вес, который нужно сбросить
        int weightToLose = 7;

        // Диапазон потери веса в граммах
        int minWeightLossPerDay = 250;
        int maxWeightLossPerDay = 500;

        // Рассчитываем количество дней для каждого варианта потери веса
        int daysToLoseMinWeight = weightToLose / minWeightLossPerDay;
        int daysToLoseMaxWeight = weightToLose / maxWeightLossPerDay;

        // Рассчитываем среднее количество дней
        int averageDaysToLoseWeight = (daysToLoseMinWeight + daysToLoseMaxWeight) / 2;

        // Выводим результат в консоль
        System.out.println("Дней для потери 7 кг при потере 250 грамм в день: " + daysToLoseMinWeight + " дней");
        System.out.println("Дней для потери 7 кг при потере 500 грамм в день: " + daysToLoseMaxWeight + " дней");
        System.out.println("Среднее количество дней для потери 7 кг: " + averageDaysToLoseWeight + " дней");



        // Зарплаты сотрудников до повышения
        double salaryMasha = 67760;
        double salaryDenis = 83690;
        double salaryKristina = 76230;

        // Коэффициент повышения
        double increasePercentage = 0.10;

        // Повышение зарплаты и расчет годового дохода
        double newSalaryMasha = salaryMasha * (1 + increasePercentage);
        double newSalaryDenis = salaryDenis * (1 + increasePercentage);
        double newSalaryKristina = salaryKristina * (1 + increasePercentage);

        double annualIncomeIncreaseMasha = (newSalaryMasha - salaryMasha) * 12;
        double annualIncomeIncreaseDenis = (newSalaryDenis - salaryDenis) * 12;
        double annualIncomeIncreaseKristina = (newSalaryKristina - salaryKristina) * 12;

        // Вывод результатов в консоль
        System.out.printf("Маша теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей.%n", newSalaryMasha, annualIncomeIncreaseMasha);
        System.out.printf("Денис теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей.%n", newSalaryDenis, annualIncomeIncreaseDenis);
        System.out.printf("Кристина теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей.%n", newSalaryKristina, annualIncomeIncreaseKristina);
    }
}