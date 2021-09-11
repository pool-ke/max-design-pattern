package com.kd.ke.create.abstractfactory;

/**
 * @ClassName: RedTrafficToolFactory
 * @Description: TODO
 * @author: max
 * @date 2021/9/11下午4:29
 */
public class RedTrafficToolFactory implements TrafficToolFactory{
    @Override
    public Car createCar() {
        return new RedCar();
    }

    @Override
    public Bike createBike() {
        return new RedBike();
    }
}
