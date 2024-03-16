package com.itheima.stringbuilderdemo;

import java.util.Scanner;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        //当调用一个方法的时候,不需要用变量接收他的结果,直接调用其他的方法
        int length = getString().substring(1).replace("a", "d").length();
        System.out.println(length);

    }
    public static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();
        return str;
    }
}
