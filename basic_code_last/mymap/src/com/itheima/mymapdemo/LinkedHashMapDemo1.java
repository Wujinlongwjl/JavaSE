package com.itheima.mymapdemo;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo1 {
    public static void main(String[] args) {
        //LinkedHashMap  :   有序,不重复,无索引

        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("c",789);
        lhm.put("a",123);
        lhm.put("b",456);
        lhm.put("a",111);
        System.out.println(lhm);
    }
}
