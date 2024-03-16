package com.itheima.myfunction;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa", "bbb", "ccc");
        list.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));
    }
}
