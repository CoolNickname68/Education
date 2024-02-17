public class LibraryAppMain {
    public static void main(String[] args) {
        // Создаем объекты авторов
        Author author1 = new Author("Иван", "Иванов");
        Author author2 = new Author("Петр", "Петров");

        // Создаем объекты книг
        LibraryAppFunctionality book1 = new LibraryAppFunctionality("Название книги 1", author1, 2000);
        LibraryAppFunctionality book2 = new LibraryAppFunctionality("Название книги 2", author2, 2010);

        // Выводим информацию о книгах
        System.out.println(book1);
        System.out.println(book2);

        // Изменяем год публикации одной из книг
        book1.setPublicationYear(2005);

        // Выводим информацию о книгах после изменения года публикации
        System.out.println("\nИнформация о книгах после изменения года публикации:");
        System.out.println(book1);
        System.out.println(book2);

        // Проверяем методы equals и hashCode
        LibraryAppFunctionality book3 = new LibraryAppFunctionality("Название книги 1", author1, 2000);
        System.out.println("\nПроверка метода equals:");
        System.out.println("book1.equals(book3): " + book1.equals(book3));

        System.out.println("\nПроверка метода hashCode:");
        System.out.println("book1.hashCode(): " + book1.hashCode());
        System.out.println("book3.hashCode(): " + book3.hashCode());
    }
}
