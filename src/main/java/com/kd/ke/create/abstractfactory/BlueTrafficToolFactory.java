package com.kd.ke.create.abstractfactory;

/**
 * @ClassName: BlueTrafficToolFactory
 * @Description: TODO
 * @author: max
 * @date 2021/9/11下午4:30
 */
public class BlueTrafficToolFactory implements TrafficToolFactory{
    @Override
    public Car createCar() {
        return new BlueCar();
    }

    @Override
    public Bike createBike() {
        return new BlueBike();
    }
}
