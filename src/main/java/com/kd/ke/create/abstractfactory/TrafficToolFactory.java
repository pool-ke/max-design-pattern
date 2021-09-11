package com.kd.ke.create.abstractfactory;

/**
 * @ClassName: TrafficToolFactory
 * @Description: TODO
 * @author: max
 * @date 2021/9/11下午4:24
 */
public interface TrafficToolFactory {

    Car createCar();

    Bike createBike();
}
