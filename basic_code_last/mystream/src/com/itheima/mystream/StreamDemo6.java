package com.itheima.mystream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","赵敏","谢逊","周芷若","杨潇","张飞","张翠山","李二牛","张三丰");

        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));

        System.out.println("----------------------------------------");

        //limit()获取前几个
        list.stream().limit(3).forEach(s -> System.out.println(s));

        System.out.println("----------------------------------------");

        //skip()跳过前几个
        list.stream().skip(3).forEach(s -> System.out.println(s));
    }

}
