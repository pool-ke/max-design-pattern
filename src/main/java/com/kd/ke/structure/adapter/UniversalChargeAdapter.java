package com.kd.ke.structure.adapter;

/**
 * @ClassName: UniversalChargeAdapter
 * @Description: 万能充电器，支持给苹果设备和安卓设备充电
 * @author: max
 * @date 2021/9/19下午1:18
 */
public class UniversalChargeAdapter implements IChargeAdapter{
    private ICharge iCharge;

    public UniversalChargeAdapter(ICharge iCharge) {
        this.iCharge = iCharge;
    }

    @Override
    public void charge() {
        iCharge.charge();
    }
}
