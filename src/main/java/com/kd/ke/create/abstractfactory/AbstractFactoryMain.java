package com.kd.ke.create.abstractfactory;

/**
 * @ClassName: AbstractFactoryMain
 * @Description: 抽象工厂运行类
 * @author: max
 * @date 2021/9/11下午4:32
 */
public class AbstractFactoryMain {

    public static void main(String[] args) {
        TrafficToolFactory blueTrafficToolFactory = new BlueTrafficToolFactory();
        Bike bike = blueTrafficToolFactory.createBike();
        bike.take();
        Car car = blueTrafficToolFactory.createCar();
        car.drive();

        TrafficToolFactory redTrafficToolFactory = new RedTrafficToolFactory();
        Bike bike1 = redTrafficToolFactory.createBike();
        bike1.take();
        Car car1 = redTrafficToolFactory.createCar();
        car1.drive();

    }

}
