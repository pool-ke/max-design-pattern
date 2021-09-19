package com.kd.ke.structure.decorator;

/**
 * @ClassName: Window
 * @Description: 具体构件
 * @author: max
 * @date 2021/9/19下午4:18
 */
public class Window extends Component{
    @Override
    public void display() {
        System.out.println("现实窗体构件");
    }
}
