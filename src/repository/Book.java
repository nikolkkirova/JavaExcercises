package repository;

public class Book extends Document{
    private final String isbn;
    private Author author;

    public Book(String isbn, Author author) {
        this.isbn = isbn;
        this.author = author;
    }

    public Book(String name, double fileSize, FormatType formatType, String isbn, Author author) {
        super(name, fileSize, formatType);
        this.isbn = isbn;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", author=" + author +
                "} " + super.toString();
    }
}
