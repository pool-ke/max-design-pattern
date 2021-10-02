package com.kd.ke.java8.stream;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @program: max-design-pattern
 * @description: Stream流创建
 * @author: muyuan_ke
 * @create: 2021-10-02 14:17
 */
public class StreamCreateMain {

    public static void main(String[] args) {
        // 使用数组创建,常用
        String[] array = new String[]{"kemuyuan","winnie","piglet","zhuxiaopi","gelin"};
        Stream<String> stream1 = Stream.of(array);
        // 使用组合Collections创建，常用
        List<String> list = Arrays.asList("kemuyuan", "winnie", "piglet", "zhuxiaopi", "gelin");
        Stream<String> stream2 = list.stream();
        // 使用generate方式创建,不常见
        Stream<String> stream = Stream.generate(() -> "love").limit(10);
        // 使用Stream.iterate()，不常见
        Stream<BigInteger> bigIntStream = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE)).limit(10);

        // stream的遍历 foreach
//        stream1.forEach((x)-> System.out.println(x));
        // stream的匹配 anyMatch，allMatch
//        boolean flag1 = stream1.anyMatch((x) -> x.equals("kemuyuan"));
//        boolean flag2 = stream2.allMatch((x) -> x.equals("kemuyuan"));
//        System.out.println("any match result:"+flag1);
//        System.out.println("all match result:"+flag2);
        // stream的过滤 filter
//        stream1.filter((x) -> x.contains("e")).forEach((x)-> System.out.println(x));
        // stream的聚合操作(max/min/count)
//        Optional<String> max = stream1.max(Comparator.comparing((x) -> {
//            return x.length();
//        }));
//        System.out.println(max.get());
//        long count = stream2.count();
//        System.out.println("the count of stream2 is :"+count);
        // stream map 映射操作 (数组转为长度)
//        stream1.map((x) -> x.length()).forEach((x)-> System.out.println(x));
        // stream收集操作collect，toList/toSet/toMap
//        List<String> lists = stream1.filter((x) -> x.contains("e")).collect(Collectors.toList());
//        for (String item : lists){
//            System.out.println(item);
//        }
//        Map<String, Integer> map = stream1.filter((x) -> x.contains("e")).collect(Collectors.toMap((x) -> x, (x) -> x.length()));
//        for (Map.Entry<String,Integer> entry:map.entrySet()){
//            String key = entry.getKey();
//            Integer value = entry.getValue();
//            System.out.println("the key and value is :"+key +" "+value);
//        }
        //统计（count/averaging）统计字符的平均长度
        Double collect = stream1.map((x) -> x.length()).collect(Collectors.averagingDouble((x) -> x));
        System.out.println(collect);
        // stream 分组（paritioningBy/groupingBy）
        //stream concat（合并流）distinct（去重）limit(限制)skip（跳过）reduce（规约）
        // 更多例子参考https://zhuanlan.zhihu.com/p/340538961

    }
}
