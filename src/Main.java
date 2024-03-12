// Класс Hogwarts, представляющий общие характеристики учеников
class Hogwarts {
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(int magicPower, int transgressionDistance) {
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public void describeStudent() {
        System.out.println("Сила магии: " + magicPower);
        System.out.println("Расстояние трансгрессии: " + transgressionDistance);
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }
}

// Факультет Гриффиндор
class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    // Метод для вывода описания студента
    public void describeStudent() {
        super.describeStudent();
        System.out.println("Благородство: " + nobility);
        System.out.println("Честь: " + honor);
        System.out.println("Храбрость: " + bravery);
    }

    // Метод сравнения учеников Гриффиндора по характеристикам
    public void compareGryffindorStudents(Gryffindor student1, Gryffindor student2) {
        // Вычисляем сумму характеристик каждого ученика
        int score1 = student1.nobility + student1.honor + student1.bravery;
        int score2 = student2.nobility + student2.honor + student2.bravery;

        // Выводим результат сравнения на экран
        System.out.println("4. Сравнение учеников Гриффиндора:");
        if (score1 > score2) {
            System.out.println("   Первый студент лучше второго в Гриффиндоре");
        } else if (score1 < score2) {
            System.out.println("   Второй студент лучше первого в Гриффиндоре");
        } else {
            System.out.println("   Оба студента в Гриффиндоре равны по своим качествам");
        }
    }
}

// Факультет Пуффендуй
class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(int magicPower, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    // Метод для вывода описания студента
    public void describeStudent() {
        super.describeStudent();
        System.out.println("Трудолюбие: " + diligence);
        System.out.println("Верность: " + loyalty);
        System.out.println("Честность: " + honesty);
    }

    // Метод сравнения учеников Пуффендуй по характеристикам
    public void compareHufflepuffStudents(Hufflepuff student1, Hufflepuff student2) {
        // Вычисляем сумму характеристик каждого ученика
        int score1 = student1.diligence + student1.loyalty + student1.honesty;
        int score2 = student2.diligence + student2.loyalty + student2.honesty;

        // Выводим результат сравнения на экран
        System.out.println("3. Сравнение учеников Пуффендуй:");
        if (score1 > score2) {
            System.out.println("   Первый студент лучше второго в Пуффендуй");
        } else if (score1 < score2) {
            System.out.println("   Второй студент лучше первого в Пуффендуй");
        } else {
            System.out.println("   Оба студента в Пуффендуй равны по своим качествам");
        }
    }
}

// Факультет Слизерин
class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;

    public Slytherin(int magicPower, int transgressionDistance, int cunning, int determination, int ambition) {
        super(magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
    }

    // Метод для вывода описания студента
    public void describeStudent() {
        super.describeStudent();
        System.out.println("Хитрость: " + cunning);
        System.out.println("Решительность: " + determination);
        System.out.println("Амбициозность: " + ambition);
    }

    // Метод сравнения учеников Слизерин по характеристикам
    public void compareSlytherinStudents(Slytherin student1, Slytherin student2) {
        // Вычисляем сумму характеристик каждого ученика
        int score1 = student1.cunning + student1.determination + student1.ambition;
        int score2 = student2.cunning + student2.determination + student2.ambition;

        // Выводим результат сравнения на экран
        System.out.println("2. Сравнение учеников Слизерин:");
        if (score1 > score2) {
            System.out.println("   Первый студент лучше второго в Слизерине");
        } else if (score1 < score2) {
            System.out.println("   Второй студент лучше первого в Слизерине");
        } else {
            System.out.println("   Оба студента в Слизерине равны по своим качествам");
        }
    }
}

// Факультет Когтевран
class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(int magicPower, int transgressionDistance, int intelligence, int wisdom, int wit) {
        super(magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    // Метод для вывода описания студента
    public void describeStudent() {
        super.describeStudent();
        System.out.println("Ум: " + intelligence);
        System.out.println("Мудрость: " + wisdom);
        System.out.println("Остроумие: " + wit);
        System.out.println("Творчество: " + creativity);
    }

    // Метод сравнения учеников Когтеврана по характеристикам
    public void compareRavenclawStudents(Ravenclaw student1, Ravenclaw student2) {
        // Вычисляем сумму характеристик каждого ученика
        int score1 = student1.intelligence + student1.wisdom + student1.wit;
        int score2 = student2.intelligence + student2.wisdom + student2.wit;

        // Выводим результат сравнения на экран
        System.out.println("1. Сравнение учеников Когтевран:");
        if (score1 > score2) {
            System.out.println("   Первый студент лучше второго в Когтевране");
        } else if (score1 < score2) {
            System.out.println("   Второй студент лучше первого в Когтевране");
        } else {
            System.out.println("   Оба студента в Когтевране равны по своим качествам");
        }
    }
}

// Основной класс для тестирования
public class Main {
    public static void main(String[] args) {
        // Создание объектов учеников каждого факультета
        Ravenclaw choChang = new Ravenclaw(85, 90, 95, 90, 80);
        Hufflepuff zachariasSmith = new Hufflepuff(75, 85, 90, 95, 85);
        Slytherin dracoMalfoy = new Slytherin(90, 95, 95, 90, 95);
        Gryffindor hermioneGranger = new Gryffindor(95, 85, 90, 95, 85);
        Gryffindor ronWeasley = new Gryffindor(85, 90, 80, 85, 90);
        Gryffindor harryPotter = new Gryffindor(90, 80, 85, 90, 95);

        // Вывод описания студентов
        System.out.println("Описание учеников:");
        choChang.describeStudent();
        zachariasSmith.describeStudent();
        dracoMalfoy.describeStudent();
        hermioneGranger.describeStudent();
        ronWeasley.describeStudent();
        harryPotter.describeStudent();

        // Сравнение учеников каждого факультета
        choChang.compareRavenclawStudents(choChang, choChang);
        zachariasSmith.compareHufflepuffStudents(zachariasSmith, zachariasSmith);
        dracoMalfoy.compareSlytherinStudents(dracoMalfoy, dracoMalfoy);
        hermioneGranger.compareGryffindorStudents(hermioneGranger, hermioneGranger);
        ronWeasley.compareGryffindorStudents(ronWeasley, ronWeasley);

        // Сравнение любых двух учеников по силе магии и расстоянию трансгрессии
        compareStudentsMagicPowerAndTransgression(harryPotter, dracoMalfoy);
    }

    // Метод для сравнения двух учеников по силе магии и расстоянию трансгрессии
    public static void compareStudentsMagicPowerAndTransgression(Hogwarts student1, Hogwarts student2) {
        System.out.println("Сравнение двух учеников по силе магии и расстоянию трансгрессии:");
        // Сравнение силы магии
        if (student1.getMagicPower() > student2.getMagicPower()) {
            System.out.println("Первый студент обладает бОльшей мощностью магии, чем второй");
        } else if (student1.getMagicPower() < student2.getMagicPower()) {
            System.out.println("Второй студент обладает бОльшей мощностью магии, чем первый");
        } else {
            System.out.println("У обоих студентов одинаковая сила магии");
        }

        // Сравнение расстояния трансгрессии
        if (student1.getTransgressionDistance() > student2.getTransgressionDistance()) {
            System.out.println("Первый студент может трансгрессировать на большее расстояние, чем второй");
        } else if (student1.getTransgressionDistance() < student2.getTransgressionDistance()) {
            System.out.println("Второй студент может трансгрессировать на большее расстояние, чем первый");
        } else {
            System.out.println("У обоих студентов одинаковое расстояние трансгрессии");
        }
    }
}
