package com.kd.ke.create.simplefactory;

/**
 * @ClassName: Circle
 * @Description: 圆形实现类
 * @author: max
 * @date 2021/9/11下午1:42
 */
public class Circle implements Shape{
    public Circle() {
        System.out.println("Circle construct");
    }

    @Override
    public void display() {
        System.out.println("Circle display");
    }
}
