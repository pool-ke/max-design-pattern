package com.kd.ke.create.factorymethod;

/**
 * @ClassName: FactoryMethodMain
 * @Description: 工厂方法运行类
 * @author: max
 * @date 2021/9/11下午2:40
 */
public class FactoryMethodMain {
    public static void main(String[] args) {
        DrinkFactory drinkFactory = new WaterFactory();
        Drink water = drinkFactory.createDrink();
        water.display();

        DrinkFactory coffeeFactory = new CoffeeFactory();
        Drink coffee = coffeeFactory.createDrink();
        coffee.display();
    }
}
