package com.kd.ke.action.template;

/**
 * @program: max-design-pattern
 * @description: 抽象类方法
 * @author: muyuan_ke
 * @create: 2021-09-20 14:17
 */
public abstract class AbstractDisplay {

    public abstract void open();

    public abstract void print();

    /**
     * 勾子方法，控制具体子类流程的流转
     * @return
     */
    public boolean needPrint(){
        return true;
    }

    public abstract void close();

    public void display(){
        open();
        if (needPrint()){
            for (int i =0;i<5;i++){
                print();
            }
        }
        close();
    }
}
