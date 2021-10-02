package com.kd.ke.java8.funcInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @program: max-design-pattern
 * @description: 四大函数式接口使用
 * @author: muyuan_ke
 * @create: 2021-10-02 16:55
 */
public class FuncInterfaceMain {

    // 函数式接口中，lambda表达式看成实现接口的实例，lambda表达式：（）->{}
    public static void main(String[] args) {
        String result = testingFunction("ke", x -> x + " winnie");
        System.out.println(result);

        testConsumer(2, x -> System.out.println(x));
        String result2 = testSupplier(() -> "winnie and piglet");
        System.out.println(result2);

        Boolean flag = testPredicate("winnie", (x) -> "piglet".equals(x));
        System.out.println(flag);
    }

    /**
     * 函数型接口,有输入有输出
     *
     * @param name
     * @param function
     * @return
     */
    public static String testingFunction(String name, Function<String, String> function) {
        return function.apply(name);
    }

    /**
     * 消费型接口，有输入无输出
     *
     * @param x
     * @param consumer
     */
    public static void testConsumer(int x, Consumer<Integer> consumer) {
        consumer.accept(x);
    }

    /**
     * 供给型接口，无输入有输出
     *
     * @param supplier
     * @return
     */
    public static String testSupplier(Supplier<String> supplier) {
        return supplier.get();
    }

    /**
     * 断言型接口，有输入，输出为Boolean类型
     *
     * @param string
     * @param predicate
     * @return
     */
    public static Boolean testPredicate(String string, Predicate<String> predicate) {
        return predicate.test(string);
    }
}
