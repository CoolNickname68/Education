class Main {
    public static void main(String[] args) {
        // Создание объектов авторов
        Author author1 = new Author("Иван", "Иванов");
        Author author2 = new Author("Петр", "Петров");

        // Создание объектов книг
        Book book1 = new Book("Название книги 1", author1, 2000);
        Book book2 = new Book("Название книги 2", author2, 2010);

        // Вывод информации о книгах до изменения года публикации
        System.out.println("Информация о книгах до изменения года публикации:");
        System.out.println(book1);
        System.out.println(book2);

        // Изменение года публикации одной из книг
        book1.setPublicationYear(2005);

        // Вывод информации о книгах после изменения года публикации
        System.out.println("\nИнформация о книгах после изменения года публикации:");
        System.out.println(book1);
        System.out.println(book2);
    }
}

class Book {
    private String title;
    private Author author;
    private int publicationYear;

    // Конструктор
    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Геттеры
    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    // Сеттер для поля "Год публикации"
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }


    @Override
    public String toString() {
        return "Книга: " + title + ", Автор: " + author.getFullName() + ", Год публикации: " + publicationYear;
    }
}

class Author {
    private String firstName;
    private String lastName;

    // Конструктор
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Геттеры
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Метод для получения полного имени автора
    public String getFullName() {
        return firstName + " " + lastName;
    }
}







