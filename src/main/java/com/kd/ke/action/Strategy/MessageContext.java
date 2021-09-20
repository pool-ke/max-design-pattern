package com.kd.ke.action.Strategy;

/**
 * @program: max-design-pattern
 * @description: 消息发送策略上下文类
 * @author: muyuan_ke
 * @create: 2021-09-20 15:43
 */
public class MessageContext {
    private MessageStrategy messageStrategy;

    public MessageContext(MessageStrategy messageStrategy) {
        this.messageStrategy = messageStrategy;
    }

    public void setMessageStrategy(MessageStrategy messageStrategy) {
        this.messageStrategy = messageStrategy;
    }

    public void sendMessage(){
        this.messageStrategy.sendMessage();
    }
}
