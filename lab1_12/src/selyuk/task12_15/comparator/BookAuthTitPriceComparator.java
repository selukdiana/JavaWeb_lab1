package selyuk.task12_15.comparator;

import selyuk.task12_15.Book;

public class BookAuthTitPriceComparator extends BookComparator{

    @Override
    public int compare(Book book1, Book book2) {
        int res = book1.getAuthor().compareTo(book2.getAuthor());
        if (res == 0) {
            res = book1.getTitle().compareTo(book2.getTitle());
            if (res == 0) {
                if(book1.getPrice() == book2.getPrice()) {
                    res = 0;
                } else {
                    res = book1.getPrice() < book2.getPrice() ? 1 : -1;
                }
            }
        }
        return res;
    }

}
