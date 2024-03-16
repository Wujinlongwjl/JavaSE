package com.itheima.immutable;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ImmutableDemo1 {
    public static void main(String[] args) {

        //List不可变集合

        //集合一旦创建成功是无法修改的,只能进行查询
        List<String> list = List.of("张三", "李四", "王五", "赵六");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        System.out.println("----------------------");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("----------------------");

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("--------------------");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

        System.out.println("----------------------");

        list.forEach(s -> System.out.println(s));


        System.out.println("----------------------------");


    }
}
