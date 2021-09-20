package com.kd.ke.action.template;

/**
 * @program: max-design-pattern
 * @description: 具体实现类
 * @author: muyuan_ke
 * @create: 2021-09-20 14:26
 */
public class ClassPathDisplay extends AbstractDisplay{

    @Override
    public void open() {
        System.out.println("open class path file");
    }

    @Override
    public void print() {
        System.out.println("print class path file content");
    }

    @Override
    public void close() {
        System.out.println("close class path file");
    }
}
