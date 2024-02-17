import java.util.Objects;

class LibraryAppFunctionality {
    private String title;
    private Author author;
    private int publicationYear;

    // Конструктор
    public LibraryAppFunctionality(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Геттеры и сеттеры
    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    // Переопределение метода toString для удобного вывода информации о книге
    @Override
    public String toString() {
        return "Книга: " + title + ", " + author + ", Год публикации: " + publicationYear;
    }

    // Метод equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryAppFunctionality book = (LibraryAppFunctionality) o;
        return publicationYear == book.publicationYear &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    // Метод hashCode
    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
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

    // Метод toString
    @Override
    public String toString() {
        return "Автор: " + getFullName();
    }

    // Метод equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) &&
                Objects.equals(lastName, author.lastName);
    }

    // Метод hashCode
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
