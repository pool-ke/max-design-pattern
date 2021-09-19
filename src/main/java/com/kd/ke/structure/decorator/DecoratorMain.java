package com.kd.ke.structure.decorator;

/**
 * @ClassName: DecoratorMain
 * @Description: 装饰模式运行类
 * @author: max
 * @date 2021/9/19下午4:30
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Component component1 = new Window();
        Component component2 = new TextBox();

        component1.display();
        ComponentDecorator scrollBarDecorator = new ScrollBarDecorator(component1);
        scrollBarDecorator.display();

        component2.display();
        BlackBorderDecorator blackBorderDecorator = new BlackBorderDecorator(component2);
        blackBorderDecorator.display();

    }

}
