//2023年12月29日18:24:39
package com.itheima.test;

import java.util.Scanner;

public class 计算回文数 {
    public static void main(String[] args) {
        /*需求：给你一个整数X.
                如果x是一个回文整数，打印true,否则，返回false.
                解释：回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
        例如，121是回文，而123不是。*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字:");
        int x = sc.nextInt();
        int temp = x;
        int sum = 0;
        while (x != 0){
            int ge = x % 10;
            x = x / 10;
            sum = sum * 10 + ge;
        }

        if(temp == sum){
            //System.out.println(sum);
            System.out.println("是回文数");
        }
        else System.out.println("不是回文数");
    }
}
