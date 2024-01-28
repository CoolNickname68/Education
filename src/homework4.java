public class homework4 {

    public static void main(String[] args) {
        // Задача 1
        int[] intArray = new int[]{1, 2, 3};
        double[] doubleArray = {1.57, 7.654, 9.986};
        // Произвольный массив
        String[] arbitraryArray = {"apple", "orange", "banana"};

        // Задача 2
        System.out.println("Задача 2:");
        printArray(intArray);
        printArray(doubleArray);
        printArray(arbitraryArray);
        System.out.println();

        // Задача 3
        System.out.println("Задача 3:");
        printReverseArray(intArray);
        printReverseArray(doubleArray);
        printReverseArray(arbitraryArray);
        System.out.println();

        // Задача 4
        System.out.println("Задача 4:");
        makeOddEven(intArray);
        printArray(intArray);
    }

    // Метод для печати массива в одну строку через запятую
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    // Метод для печати массива в обратном порядке через запятую
    private static void printReverseArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static void printReverseArray(double[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static void printReverseArray(String[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    // Метод для преобразования нечетных чисел в четные
    private static void makeOddEven(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i]++;
            }
        }
    }
}