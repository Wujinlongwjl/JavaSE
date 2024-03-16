package com.itheima.mystream;

import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo8 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张无忌-15","赵敏-14","谢逊-55","周芷若-16","张三丰-100",
                "张飞-44","张翠山-36","李二牛-15");
        //map转换流中的数据类型
        list1.stream().map(s->Integer.parseInt(s.split("-")[1])).forEach(s-> System.out.println(s));
    }
}
