package com.kd.ke.structure.decorator;

/**
 * @ClassName: ScrollBarDecorator
 * @Description: 装饰类，为构件添加滑动条
 * @author: max
 * @date 2021/9/19下午4:24
 */
public class ScrollBarDecorator extends  ComponentDecorator{
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setScrollBar();
        super.display();

    }

    public void setScrollBar(){
        System.out.println("add scroll bar for the component");
    }
}
