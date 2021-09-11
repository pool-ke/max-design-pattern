package com.kd.ke.create.factorymethod;

/**
 * @ClassName: CoffeeFactory
 * @Description: TODO
 * @author: max
 * @date 2021/9/11下午2:38
 */
public class CoffeeFactory implements DrinkFactory{
    @Override
    public Drink createDrink() {
        return new Coffee();
    }
}
