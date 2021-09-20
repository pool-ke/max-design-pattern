package com.kd.ke.action.iterator;

/**
 * @program: max-design-pattern
 * @description: Book信息
 * @author: muyuan_ke
 * @create: 2021-09-20 11:10
 */
public class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
