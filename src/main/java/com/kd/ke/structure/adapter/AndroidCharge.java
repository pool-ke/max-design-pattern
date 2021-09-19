package com.kd.ke.structure.adapter;

/**
 * @ClassName: AndroidCharge
 * @Description: 安卓充电器
 * @author: max
 * @date 2021/9/19下午1:16
 */
public class AndroidCharge implements ICharge{
    @Override
    public void charge() {
        System.out.println("Android device charging");
    }
}
