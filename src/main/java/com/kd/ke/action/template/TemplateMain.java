package com.kd.ke.action.template;

/**
 * @program: max-design-pattern
 * @description: 模板设计模式运行类
 * @author: muyuan_ke
 * @create: 2021-09-20 14:39
 */
public class TemplateMain {

    public static void main(String[] args) {
        AbstractDisplay classPathDisplay = new ClassPathDisplay();
        classPathDisplay.display();

        AbstractDisplay xmlDisplay = new XmlDisplay();
        xmlDisplay.display();
    }
}
