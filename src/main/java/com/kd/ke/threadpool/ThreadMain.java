package com.kd.ke.threadpool;

/**
 * @program: max-design-pattern
 * @description: //线程池输出1、2、3
 * @author: muyuan_ke
 * @create: 2021-11-24 20:30
 */
public class ThreadMain {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0;i<3;i++){
             Thread thread = new Thread(new WorkThread(i));
             thread.start();
        }
        Thread.sleep(10000);
    }
}
