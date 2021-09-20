package com.kd.ke.action.Strategy;

/**
 * @program: max-design-pattern
 * @description: 发送邮件消息策略类
 * @author: muyuan_ke
 * @create: 2021-09-20 15:35
 */
public class EmailMessageStrategy implements MessageStrategy{
    @Override
    public void sendMessage() {
        System.out.println("send email message");
    }
}
