package com.kd.ke.action.iterator;

/**
 * @program: max-design-pattern
 * @description: 书架，充当书本集合
 * @author: muyuan_ke
 * @create: 2021-09-20 11:17
 */
public class BookShelf implements Aggregate{
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize){
        books = new Book[maxsize];
    }

    public Book getBookByIndex(int index){
        return books[index];
    }

    public void appendBook(Book book){
        books[last++] = book;
    }

    public int getLength(){
        return last;
    }
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
