package com.itheima.myset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        /*1.Set系列集合的特点
            ●无序、不重复、无索引
            ●Set集合的方法上基本上与Collection的API一致

          2.Set集合的实现类特点
            ●HashSet:无序、不重复、无索引
            ●LinkedHashSet:有序、不重复、无索引
            ●TreeSet:可排序、不重复、无索引*/








        //set:不重复,无索引,无序

        Set<String> set = new HashSet<>();
        set.add("张三");
        set.add("李四");
        set.add("王五");

        //迭代遍历
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }

        System.out.println("--------------------");

        //for增强
        for (String s : set) {
            System.out.println(s);

        }

        System.out.println("--------------------");


        //Lambda
        set.forEach((String s) -> System.out.println(s));
    }
}
