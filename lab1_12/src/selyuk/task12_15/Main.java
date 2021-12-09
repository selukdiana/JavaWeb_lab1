package selyuk.task12_15;

import selyuk.task12_15.comparator.BookAuthTitPriceComparator;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Book.setEdition(5);

        Book book = new Book("Clear code", "Zobert Martin", 25);
        Book book2 = new Book("Clear code", "Robert Martin", 12);
        Book book3 = new Book("Clear code", "Cobert Martin", 12);
        Book book4 = new Book("Alear code", "Robert Martin", 10);
        Book book5 = new Book("Alear code", "Robert Martin", 12);
        Book programmerBook = new ProgrammerBook("Clear code", "Robert Martin", 25, "English", 5);
        Book programmerBook1 = new ProgrammerBook("Clear code", "Robert Martin", 25, "English", 5);

        BookAuthTitPriceComparator batpcomp = new BookAuthTitPriceComparator();

        TreeSet<Book> bookSet = new TreeSet<>(batpcomp);
        bookSet.add(book);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        System.out.println(bookSet);
    }

}
