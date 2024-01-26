
public class Main {


    public static void main(String[] args) {
        Main mainInstance = new Main();
        Task1 task1Object = mainInstance.new Task1();
        task1Object.printAgeMessage();

        Task2 task1Object2 = mainInstance.new Task2();
        task1Object2.task();

        Task3 task1Object3 = mainInstance.new Task3();
        task1Object3.task1();


        Task4 task1Object4 = mainInstance.new Task4();
        task1Object4.task2();


        Task5 task1Object5 = mainInstance.new Task5();
        task1Object5.task3();

        Task6 task1Object6 = mainInstance.new Task6();
        task1Object6.task4();

        Task7 task1Object7 = mainInstance.new Task7();
        task1Object7.task5();
    }
    

    public class Task1{
        public void printAgeMessage() {
            int age = 18;
    
            if (age >= 18) {
                System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
            } else {
                System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
            }
        }
    }

    public class Task2 {
        public void task() {
            int temperature = 7;
    
            if (temperature < 5) {
                System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
            } else {
                System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
            }
        }
    }

    public class Task3 {
        public void task1() {
            int speed = 65;
    
            if (speed > 60) {
                System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
            } else {
                System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
            }
        }
    }

    public class Task4 {
        public void task2() {
            int age = 20;
    
            if (age >= 2 && age <= 6) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
            } else if (age >= 7 && age <= 17) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
            } else if (age >= 18 && age <= 24) {
                System.out.println("Если возраст человека равен " + age + ", то его место в университете");
            } else {
                System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
            }
        }
    }

    public class Task5 {
        public void task3() {
            int age = 10;
    
            if (age < 5) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
            } else if (age >= 5 && age < 14) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
            }
        }
    }

    public class Task6 {
        public void task4() {
            int totalPeople = 90;
            int seatedPlaces = 60;
    
            if (totalPeople < 102) {
                System.out.println("В вагоне есть место");
                if (totalPeople <= seatedPlaces) {
                    System.out.println("Место сидячее");
                } else {
                    System.out.println("Место стоячее");
                }
            } else {
                System.out.println("В вагоне уже полностью забито");
            }
        }
    }

    public class Task7 {
        public void task5() {
            int one = 15;
            int two = 8;
            int three = 20;
    
            if (one >= two && one >= three) {
                System.out.println("Наибольшее число: " + one);
            } else if (two >= one && two >= three) {
                System.out.println("Наибольшее число: " + two);
            } else {
                System.out.println("Наибольшее число: " + three);
            }
        }
    }



}




