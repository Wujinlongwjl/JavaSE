package com.itheima.mycollectiondemo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo4 {
    public static void main(String[] args) {
        //迭代器
        //增强for
        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");

        for (String s : coll) {
            System.out.println(s);

        }

    }
}
