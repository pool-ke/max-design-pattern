package com.kd.ke.action.iterator;

/**
 * @program: max-design-pattern
 * @description: 迭代器运行类
 * @author: muyuan_ke
 * @create: 2021-09-20 11:25
 */
public class IteratorMain {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(10);
        bookShelf.appendBook(new Book("A-book"));
        bookShelf.appendBook(new Book("B-book"));
        bookShelf.appendBook(new Book("C-book"));
        bookShelf.appendBook(new Book("D-book"));
        bookShelf.appendBook(new Book("E-book"));
        Iterator iterator = bookShelf.iterator();
        while(iterator.hasNext()){
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }

}
