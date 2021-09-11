package com.kd.ke.create.simplefactory;

/**
 * @ClassName: Line
 * @Description: TODO
 * @author: max
 * @date 2021/9/11下午1:44
 */
public class Line implements Shape{
    public Line() {
        System.out.println("Line construct");
    }

    @Override
    public void display() {
        System.out.println("Line display");
    }
}
