package com.kd.ke.action.iterator;

/**
 * @program: max-design-pattern
 * @description: 充当迭代器角色
 * @author: muyuan_ke
 * @create: 2021-09-20 11:13
 */
public interface Iterator {
    boolean hasNext();

    Object next();
}
