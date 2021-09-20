package com.kd.ke.action.template;

/**
 * @program: max-design-pattern
 * @description: XML文件具体实现类
 * @author: muyuan_ke
 * @create: 2021-09-20 14:27
 */
public class XmlDisplay extends AbstractDisplay{
    @Override
    public void open() {
        System.out.println("open xml path file");
    }

    @Override
    public void print() {
        System.out.println("print xml file content");
    }

    /**
     * 重写钩子方法，不需要打印
     * @return
     */
    @Override
    public boolean needPrint() {
        return false;
    }

    @Override
    public void close() {
        System.out.println("close xml path file");
    }
}
