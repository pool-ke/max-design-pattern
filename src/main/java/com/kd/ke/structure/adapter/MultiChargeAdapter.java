package com.kd.ke.structure.adapter;

/**
 * @ClassName: MultiChargeAdapter
 * @Description: 多头充电器，适配苹果充电器，同时给其他设备充电
 * @author: max
 * @date 2021/9/19下午1:05
 */
public class MultiChargeAdapter extends AppleCharge implements IChargeAdapter{
    @Override
    public void charge() {
        super.charge();
        System.out.println("the MultiCharger is working");
    }
}
