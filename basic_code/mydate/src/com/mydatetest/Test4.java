package com.mydatetest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        //请使用代码实现计算你活了多少天，用JDK7和JDK8两种方式完成

        //JDK7
        //计算出生年月的毫秒值
        String birthday = "2000年1月1日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(birthday);
        //计算出生的时间
        long birthdayTime = date.getTime();
        //计算当前的时间
        long todayTime = System.currentTimeMillis();
        long time = todayTime - birthdayTime;
        System.out.println(time / 1000 / 60 / 60 / 24);




        //JDK8
        LocalDate ld1 = LocalDate.of(2000,1,1);
        LocalDate ld2 = LocalDate.now();

        long days = ChronoUnit.DAYS.between(ld1, ld2);//后面减前面  ld2 - ld1
        System.out.println(days);

    }
}
