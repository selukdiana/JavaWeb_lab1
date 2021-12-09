package selyuk.task12_15.comparator;

import selyuk.task12_15.Book;

public class BookTitleComparator extends BookComparator{

    @Override
    public int compare(Book book1, Book book2) {
        return book1.getTitle().compareTo(book2.getTitle());
    }
}
