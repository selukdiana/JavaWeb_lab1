package selyuk.task12_15.comparator;

import selyuk.task12_15.Book;

public class BookAuthTitComparator extends BookComparator{
    @Override
    public int compare(Book book1, Book book2) {
        int res = book1.getAuthor().compareTo(book2.getAuthor());
        if (res == 0) {
            return book1.getTitle().compareTo(book2.getTitle());
        }
        return res;
    }
}
