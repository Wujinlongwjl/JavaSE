package com.itheima.stringbuilderdemo;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb = new StringBuilder("abc");

        //添加元素
        sb.append("def");
        sb.append("ghi");
        sb.append("jkl");
        sb.append("aaa").append("bbb").append("ccc").append("ddd");

        //再把StringBuilder变回字符串
        String str = sb.toString();
        System.out.println(str);
    }
}
