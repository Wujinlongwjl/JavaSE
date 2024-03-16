package com.itheima.listdemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //创建一个集合
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);
        //删除元素
        list.remove(1);
        list.remove("aaa");
        System.out.println(list);
        //更改元素
        String result = list.set(0, "eee");
        System.out.println(result);
        //查找元素
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }


    }

}
