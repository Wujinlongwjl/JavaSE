package com.itheima.mymapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDem4 {
    public static void main(String[] args) {
        //创建Map集合
        Map<String,String> map = new HashMap<>();
        map.put("鲁迅", "这句话是我说的");
        map.put("曹操", "不可能,绝对不可能");
        map.put("刘备", "接着奏乐接着舞");
        map.put("柯镇恶", "看我眼色行事");

        //内部类
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+ "= " + value);
            }
        });

        System.out.println("------------------------------");

        //lambda表达式
        map.forEach((String key, String value) -> {
                System.out.println(key+ "= " + value);

        });

        System.out.println("-----------------------------------");

        //lambda表达式最简
        map.forEach((key, value) -> System.out.println(key+ "= " + value));

    }
}
