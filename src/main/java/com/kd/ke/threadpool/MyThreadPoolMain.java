package com.kd.ke.threadpool;

/**
 * @program: max-design-pattern
 * @description: //TODO
 * @author: muyuan_ke
 * @create: 2021-11-24 21:06
 */
public class MyThreadPoolMain {
    public static void main(String[] args) throws InterruptedException {
        MyThreadExecutorService myExecutorService = new MyThreadExecutorService(3, 6);
        //运行8次
        for (int i = 0; i < 8; i++) {
            myExecutorService.execute(() -> {
                System.out.println(Thread.currentThread().getName() + "task begin");
            });
        }
        myExecutorService.shutdown();
    }
}
