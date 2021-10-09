package com.kd.ke.java8dt;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @program: max-design-pattern
 * @description: java8日期时间API使用练习
 * @author: muyuan_ke
 * @create: 2021-10-09 16:37
 */
public class DataTimeMain {

    public static void main(String[] args) {
        //获取今天的日期
        LocalDate now = LocalDate.now();
        System.out.println("Today Local Data is:"+now);
        //获取今天日期对应的年月日
        int year = now.getYear();
        int monthValue = now.getMonthValue();
        int dayOfMonth = now.getDayOfMonth();
        System.out.printf("Year:%d,Month:%d,Day:%d",year,monthValue,dayOfMonth);
        //使用Of静态方法创建任意日期
        LocalDate nationalDay = LocalDate.of(2021, 10, 1);
        System.out.println("Notional Day Data is:"+nationalDay);
        boolean before = now.isBefore(nationalDay);
        System.out.println(before);
        MonthDay currentMonthDay = MonthDay.of(10,1);
        System.out.println("National Dat month day is :"+ currentMonthDay);
        //判断比如纪念日，生日等周期节日可以借助构造MonthDay，或者DayOfMonth来判断,类似操作还有YearMonth

        // 获取当前时间(毫秒级)
        LocalTime nowTime = LocalTime.now();
        System.out.println("Now Local Time is:"+nowTime);
        //当前时间加上或减去小时数，分钟数
        LocalTime localTime = nowTime.minusHours(2);
        LocalTime localTime1 = nowTime.plusHours(2);
        System.out.println(localTime);
        System.out.println(localTime1);

        //java 8提供了Clock类获取当前时间搓，或当前时区下的日期时间信息，LocalDate.now可以使用Clock构造
        Clock clock = Clock.systemUTC();
        System.out.println(clock);
        LocalDate now1 = LocalDate.now(clock);
        System.out.println(now1);

        //计算两个日期中间的月数和天数
        Period between = Period.between(nationalDay, now);
        int days = between.getDays();
        int months = between.getMonths();
        System.out.println(days+months);

        //获取时间戳,与之前的Time工具类很相似
        Instant now2 = Instant.now();
        System.out.println(now2);

        // 字符串转为日期
        //使用DateTimeFormatter中BASIC_ISO_DATE对常规8位字符串日期进行格式化,将字符串转为LocalDate或者LocalTime,使用parse方法解析
        String stringDay = "20210821";
        LocalDate parseDay = LocalDate.parse(stringDay, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parseDay);
        //也可使用自定义格式化工具解析日期 DateTimeFormatter ofPattern静态方法。

        //日期转为字符创,使用format方法进行格式化
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM dd yyyy  hh:mm a");
        String format1 = localDateTime.format(format);
        System.out.println(format1);


    }
}
