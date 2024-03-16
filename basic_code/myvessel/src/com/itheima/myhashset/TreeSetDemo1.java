package com.itheima.myhashset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        //创建TreeSet集合对象
        TreeSet<Integer> ts = new TreeSet();
        ts.add(5);
        ts.add(3);
        ts.add(1);
        ts.add(4);
        ts.add(2);

        System.out.println(ts);

        System.out.println("---------------");

        //三种遍历方式
        //迭代
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()){
            int i = it.next();
            System.out.println(i);
        }

        System.out.println("---------------------");

        //for增强
        for (int t : ts) {
            System.out.println(t);
        }

        System.out.println("-------------------------");

        //lambda表达式
        ts.forEach( integer-> System.out.println(integer));
    }

}
