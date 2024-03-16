package com.itheima.stringjoinerdemo;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        //创建对象
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        //添加元素
        sj.add("aaa").add("bbb").add("ccc");
        int length = sj.length();
        System.out.println(length);

        String str = sj.toString();
        System.out.println(str);
    }
}
