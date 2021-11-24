package com.kd.ke.threadpool;

/**
 * @program: max-design-pattern
 * @description: //TODO
 * @author: muyuan_ke
 * @create: 2021-11-24 20:24
 */
public class WorkThread implements Runnable {
    private int state;

    public WorkThread(int state) {
        this.state = state;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"with the state:" + this.state);
    }
}
