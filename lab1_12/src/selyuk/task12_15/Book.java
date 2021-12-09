package selyuk.task12_15;

public class Book implements Comparable<Book>{

    protected String title;
    protected String author;
    protected int price;
    protected static int edition;
    private int isbn;

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book() {}


    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    @Override
    public Object clone() {
        Book book = new Book();
        book.title = title;
        book.author = author;
        book.price = price;
        return book;
    }

    @Override
    public int hashCode() {
        int hash = title == null ? 0 : title.hashCode();
        hash += author == null ? 0 : author.hashCode();
        hash += price;
        hash += edition;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        return this.hashCode() == book.hashCode();
    }

    @Override
    public String toString() {
        return "\n[" + title + "," + author + "," + price + "," + edition + "]";
    }

    @Override
    public int compareTo(Book book) {
        if(isbn == book.isbn) {
            return 0;
        }
        return isbn > book.isbn ? 1 : -1;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }
}
