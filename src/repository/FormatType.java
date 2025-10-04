package repository;

public enum FormatType {
    // public static final
    TXT(15), PDF(10), JPG(50);
    private int maxSize;
    FormatType(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
}
