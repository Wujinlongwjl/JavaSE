package com.itheima.mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张无忌","赵敏","谢逊","周芷若","张三丰","张飞","张翠山","李二牛","张三丰");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"杨过","小龙女","郭靖");

        //distinct()去重
        list1.stream().distinct().forEach(s -> System.out.println(s));

        //concat()将两个集合整合在一起
        Stream.concat(list1.stream(),list2.stream()).forEach(s -> System.out.println(s));

    }
}
