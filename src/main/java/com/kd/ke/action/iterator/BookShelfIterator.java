package com.kd.ke.action.iterator;

/**
 * @program: max-design-pattern
 * @description: 书架具体的迭代器角色
 * @author: muyuan_ke
 * @create: 2021-09-20 11:15
 */
public class BookShelfIterator  implements Iterator{
    private BookShelf bookShelf;

    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Object next() {
        return bookShelf.getBookByIndex(index++);
    }
}
