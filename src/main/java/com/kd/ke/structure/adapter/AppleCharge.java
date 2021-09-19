package com.kd.ke.structure.adapter;

/**
 * @ClassName: AppleCharge
 * @Description: 苹果设备充电器，Adaptee源角色，需要适配的接口
 * @author: max
 * @date 2021/9/19下午12:58
 */
public class AppleCharge implements ICharge{
    @Override
    public void charge() {
        System.out.println("Apple device charging");
    }
}
