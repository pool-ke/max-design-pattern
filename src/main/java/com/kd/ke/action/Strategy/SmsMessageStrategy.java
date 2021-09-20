package com.kd.ke.action.Strategy;

/**
 * @program: max-design-pattern
 * @description: 发送短信消息策略类
 * @author: muyuan_ke
 * @create: 2021-09-20 15:36
 */
public class SmsMessageStrategy implements MessageStrategy{
    @Override
    public void sendMessage() {
        System.out.println("send sms message");
    }
}
