//2024年1月4日21:25:26
package com.itheima.stringdemo;

public class StringDemo7 {
    public static void main(String[] args) {
        String phoneNumber = "15212340665";
        String start = phoneNumber.substring(0, 3);
        String end = phoneNumber.substring(7);
        String result = start + "****" + end;
        System.out.println(result);

    }
}
