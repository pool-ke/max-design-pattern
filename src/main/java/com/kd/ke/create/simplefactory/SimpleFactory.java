package com.kd.ke.create.simplefactory;

/**
 * @ClassName: SimpleFactory
 * @Description: 简单工厂实现类
 * @author: max
 * @date 2021/9/11下午1:49
 */
public class SimpleFactory {

    public Shape getShape(String type){
        if (type == ShapeEnum.Line.getName()){
            return new Line();
        }else if (type == ShapeEnum.Circle.getName()){
            return new Circle();
        }else {
            return null;
        }
    }
}
