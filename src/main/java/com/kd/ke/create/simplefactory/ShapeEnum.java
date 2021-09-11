package com.kd.ke.create.simplefactory;

/**
 * @ClassName: ShapeEnum
 * @Description: 形状枚举类
 * @author: max
 * @date 2021/9/11下午2:01
 */
public enum ShapeEnum {
    Line("line"),
    Circle("circle");

    private String Name;

    ShapeEnum(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }
}
