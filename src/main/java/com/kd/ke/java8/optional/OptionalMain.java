package com.kd.ke.java8.optional;

import java.util.Optional;

/**
 * @program: max-design-pattern
 * @description: Optional相关例子运行类
 * @author: muyuan_ke
 * @create: 2021-10-02 15:42
 */
public class OptionalMain {

    public static void main(String[] args) {
        // 创建Optional容器的三种方式
        Optional<Object> empty = Optional.empty();
        Optional<String> winnie = Optional.of("winnie");
        String result = "piglet";
        Optional<String> piglet = Optional.ofNullable(result);

        // Optional 使用方法
        // get(),不存在则抛出空指针异常
        // ifPresent 接受Consumer函数
        // isPresent 返回boolean类型代表存在/不存在
        // orElse/orElseGet 不存在则返回默认值，orElseGet接受Supplier参数
        // map如果Optional有值，则执行映射函数，并获取其返回值，如果返回值不为null，则返回带有返回值的Optional对象
        // 否则，返回一个空的Optional对象
        // orElseThrow 存在则返回，不存在则抛出异常

    }
}
