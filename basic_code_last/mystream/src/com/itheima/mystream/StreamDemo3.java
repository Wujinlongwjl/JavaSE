package com.itheima.mystream;

import java.util.HashMap;

public class StreamDemo3 {
    public static void main(String[] args) {
        //双列集合无法直接创建Stream流
        //创建双列集合
        HashMap<String , Integer> hm = new HashMap<>();
        //添加元素
        hm.put("aaa",111);
        hm.put("bbb",222);
        hm.put("ccc",333);
        hm.put("ddd",444);

        //第一种获取Stream流
        hm.keySet().stream().forEach(s -> System.out.println(s));
        //第二种获取Stream流
        hm.entrySet().stream().forEach(s -> System.out.println(s));
    }
}
