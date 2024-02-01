
public class Main {

    public static void main(String[] args) {
        String fullName = task1("Ivanov",  "Ivan", "Ivanovich");
        String modFullName = task2(fullName);
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета - " + modFullName);
        fullName = task1("Иванов", "Семён", "Семёнович");
        fullName = task3(fullName);
    }

    public static String task1(String lastName, String firstName, String middleName) {
        String fullName;
        fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника -  " + fullName);
        return fullName;
    }
    public static String task2(String input){
        return input.toUpperCase();
    }
    public static String task3(String original){
        String modStr = original.replace('ё', 'е');
        System.out.println("Оригинальная строка - " + original + " " + "Модифицированна строка - " + modStr);
        return modStr;
    }
}




