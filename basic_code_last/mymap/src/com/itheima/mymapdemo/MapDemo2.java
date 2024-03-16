package com.itheima.mymapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MapDemo2 {
    public static void main(String[] args) {
        //创建Map集合对象
        Map<String,String> map = new HashMap<>();
        map.put("尹志平","小龙女");
        map.put("郭靖","穆念慈");
        map.put("欧阳克","黄蓉");

        //通过键找值


        //增强for
        //获取所有的键,把这些键放到一个单列集合当中
        Set<String> keys = map.keySet();
        //遍历单列集合,看到每一个键
        for (String key : keys) {
            //利用map集合中的键获取对应的值
            String value = map.get(key);
            System.out.println(key + ", "+ value);

        }

        System.out.println("------------------");

        //迭代器
        Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            String key = it.next();
            String value = map.get(key);
            System.out.println(key + ", "+ value);
        }

        System.out.println("-----------------");

        //lambda表达式
        keys.forEach( key ->{
                //System.out.println(key);
                String value = map.get(key);
                System.out.println(key + ", "+ value);

        });



    }
}
