package com.kd.ke.create.simplefactory;

/**
 * @ClassName: SimpleFactoryMain
 * @Description: 简单工厂模式运行类
 * @author: max
 * @date 2021/9/11下午1:38
 */
public class SimpleFactoryMain {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Shape line = simpleFactory.getShape(ShapeEnum.Line.getName());
        line.display();

        Shape circle = simpleFactory.getShape(ShapeEnum.Circle.getName());
        circle.display();
    }
}
