package selyuk.task12_15;

public class ProgrammerBook extends Book{

    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash += language == null ? 0 : language.hashCode();
        hash += level;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        ProgrammerBook programmerBook = (ProgrammerBook) obj;
        return this.hashCode() == programmerBook.hashCode();
    }

    @Override
    public String toString() {
        return "\n[" + title + "," + author + "," + price + "," + edition + "," + language + "," + level + "]";
    }

}
