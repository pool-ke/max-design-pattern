package com.kd.ke.structure.decorator;

/**
 * @ClassName: BlackBorderDecorator
 * @Description: TODO
 * @author: max
 * @date 2021/9/19下午4:27
 */
public class BlackBorderDecorator extends ComponentDecorator{
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setBlackBorder();
        super.display();
    }

    public void setBlackBorder(){
        System.out.println("add black border for the component");
    }
}
