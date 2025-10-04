package repository;

public class Document {
    private String name; // име на файла
    private double fileSize; // размер на файла
    private FormatType formatType;

    public Document() {
    }

    public Document(String name, double fileSize) {
        this.name = name;
        this.fileSize = fileSize;
    }

    public Document(String name, double fileSize, FormatType formatType) {
        this.name = name;
        this.fileSize = fileSize;
        this.formatType = formatType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public FormatType getFormatType() {
        return this.formatType;
    }

    @Override
    public String toString() {
        return "Document{" +
                "name='" + name + '\'' +
                ", fileSize=" + fileSize +
                ", formatType=" + formatType +
                '}';
    }


}
