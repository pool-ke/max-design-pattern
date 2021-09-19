package com.kd.ke.structure.decorator;

/**
 * @ClassName: TextBox
 * @Description: 文本框具体构件类
 * @author: max
 * @date 2021/9/19下午4:18
 */
public class TextBox extends Component{
    @Override
    public void display() {
        System.out.println("现实文本框构件");
    }
}
