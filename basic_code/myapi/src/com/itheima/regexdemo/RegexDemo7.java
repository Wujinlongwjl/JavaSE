package com.itheima.regexdemo;

public class RegexDemo7 {
    public static void main(String[] args) {
        String str = "我要学学编编编编程程程程程程";
        String s = str.replaceAll("(.)\\1+", "$1");
        System.out.println(s);
    }
}
