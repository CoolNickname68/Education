import java.util.Arrays;

public class homework5 {

    public static void main(String[] args) {
        // Задача 1
        task1();

        // Задача 2
        task2();

        // Задача 3
        task3();

        // Задача 4
        task4();
    }

    // Метод для генерации массива случайных чисел
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    // Задача 1
    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    // Задача 2
    public static void task2() {
        int[] arr = generateRandomArray();
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");
    }

    // Задача 3
    public static void task3() {
        int[] arr = generateRandomArray();
        int sum = Arrays.stream(arr).sum();
        double average = (double) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }

    // Задача 4
    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.print("Фамилии и имена сотрудников: ");
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}

