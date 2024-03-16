package com.itheima.mystream;

import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo2 {
    public static void main(String[] args) {
        //单列集合获取Stream流
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e","f");
        list.stream().forEach(s -> System.out.println(s));
    }
}
