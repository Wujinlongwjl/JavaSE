//2024年1月5日09:54:15
package com.itheima.stringbuilderdemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb = new StringBuilder("abc");

        //添加元素
        /* sb.append(1);
        sb.append(2.3);
        sb.append(true);*/

        //反转
        //sb.reverse();

        int length = sb.length();


        System.out.println(sb);
        System.out.println(length);
    }
}
