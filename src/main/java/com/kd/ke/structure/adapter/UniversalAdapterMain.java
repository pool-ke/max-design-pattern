package com.kd.ke.structure.adapter;

/**
 * @ClassName: UniversalAdapterMain
 * @Description: 万能充电器运行类,对象适配器
 * @author: max
 * @date 2021/9/19下午1:21
 */
public class UniversalAdapterMain {
    public static void main(String[] args) {
        UniversalChargeAdapter universalChargeAdapter = new UniversalChargeAdapter(new AppleCharge());
        universalChargeAdapter.charge();

        UniversalChargeAdapter universalChargeAdapter1 = new UniversalChargeAdapter(new AndroidCharge());
        universalChargeAdapter1.charge();


    }
}
