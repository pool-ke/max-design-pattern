package com.kd.ke.action.Strategy;

/**
 * @program: max-design-pattern
 * @description: 策略模式运行类
 * @author: muyuan_ke
 * @create: 2021-09-20 15:46
 */
public class StrategyMain {

    public static void main(String[] args) {
        MessageContext messageContext = new MessageContext(new EmailMessageStrategy());
        messageContext.sendMessage();

        messageContext.setMessageStrategy(new SmsMessageStrategy());
        messageContext.sendMessage();

    }
}
