package com.kd.ke.structure.adapter;

/**
 * @ClassName: AdapterMain
 * @Description: 类适配器运行类
 * @author: max
 * @date 2021/9/19下午1:11
 */
public class AdapterMain {
    public static void main(String[] args) {
        MultiChargeAdapter multiChargeAdapter = new MultiChargeAdapter();
        multiChargeAdapter.charge();
    }
}
