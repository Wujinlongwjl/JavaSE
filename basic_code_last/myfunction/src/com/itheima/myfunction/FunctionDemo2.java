package com.itheima.myfunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class FunctionDemo2 {
    public static void main(String[] args) {
        //将字符串数字转换成数字

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5");
        
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                int i = Integer.parseInt(s);
                return i;
            }
        }).forEach(s-> System.out.println(s));





        //引用方法
        list.stream().map(Integer::parseInt).forEach(s-> System.out.println(s));
    }
}
