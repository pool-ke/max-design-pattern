package com.kd.ke.create.factorymethod;

/**
 * @ClassName: WaterFactory
 * @Description: TODO
 * @author: max
 * @date 2021/9/11下午2:37
 */
public class WaterFactory implements DrinkFactory{
    @Override
    public Drink createDrink() {
        return new Water();
    }
}
