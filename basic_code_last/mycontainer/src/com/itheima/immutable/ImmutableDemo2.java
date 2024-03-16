package com.itheima.immutable;

import java.util.Iterator;
import java.util.Set;

public class ImmutableDemo2 {
    public static void main(String[] args) {

        //Set不可变集合

        Set<String> set = Set.of("张三", "李四", "王五", "赵六");
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("-----------------");

        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
