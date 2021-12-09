package selyuk.task12_15.comparator;

import selyuk.task12_15.Book;

import java.util.Comparator;

abstract class BookComparator implements Comparator<Book> {

    abstract public int compare(Book book1, Book book2);

}
