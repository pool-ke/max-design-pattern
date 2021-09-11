package com.kd.ke.create.abstractfactory;

/**
 * @ClassName: RedBike
 * @Description: TODO
 * @author: max
 * @date 2021/9/11下午4:27
 */
public class RedBike implements Bike{
    @Override
    public void take() {
        System.out.println("Red Bike take");
    }
}
