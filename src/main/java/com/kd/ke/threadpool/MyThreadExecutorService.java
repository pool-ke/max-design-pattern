package com.kd.ke.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @program: max-design-pattern
 * @description: //自撸线程池
 * @author: muyuan_ke
 * @create: 2021-11-24 20:38
 */
public class MyThreadExecutorService {

    //一直保持运行的线程
    private List<WorkThread> workThreads;

    private BlockingDeque<Runnable> taskQueue;

    private volatile boolean executorState = true;

    public MyThreadExecutorService(int workThreads,int taskRunables) {
        this.workThreads = new ArrayList<>();
        this.taskQueue = new LinkedBlockingDeque<>(taskRunables);

        for (int i =0;i<workThreads;i++){
            WorkThread workThread = new WorkThread();
            workThread.start();
            this.workThreads.add(workThread);
        }
    }

    class WorkThread extends Thread{
        @Override
        public void run() {
            while(executorState || taskQueue.size() != 0){
                Runnable task = taskQueue.poll();
                if (task != null){
                    task.run();
                }
            }
        }
    }

    public void execute (Runnable runnable){
        taskQueue.offer(runnable);
    }

    public void shutdown(){
        executorState = false;
    }
}
