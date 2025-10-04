package repository;

public class Novel extends Book{
    private String novelAbstract; // резюме на романа

    public Novel(String isbn, Author author) {
        super(isbn, author);
    }

    public Novel(String name, double fileSize, FormatType formatType, String isbn, Author author) {
        super(name, fileSize, formatType, isbn, author);
    }
}
