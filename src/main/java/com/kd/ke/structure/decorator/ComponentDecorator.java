package com.kd.ke.structure.decorator;

/**
 * @ClassName: ComponentDecorator
 * @Description: 抽象构件装饰类
 * @author: max
 * @date 2021/9/19下午4:20
 */
public class ComponentDecorator extends Component{
    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
