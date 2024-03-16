package com.itheima.mylistdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {
    public static void main(String[] args) {
        /*List系列集合的五种遍历方式：
        1.迭代器
        2.列表迭代器
        3.增强for
        4.Lambda表达式
        5.普通for循环*/


        //创建集合并添加元素
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //1.迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("--------------------");

        //增强for
        for (String s : list) {
            System.out.println(s);

        }
        System.out.println("--------------------");
        //Lambda表达式
        list.forEach(s->System.out.println(s));

        System.out.println("---------------");

        //普通for循环
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);

            System.out.println("-------------");
        }

        //列表迭代器
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()){
            String s = lit.next();
            if(s.equals("bbb")){
                lit.add("qqq");
            }
        }

        System.out.println(list);


    }
}
