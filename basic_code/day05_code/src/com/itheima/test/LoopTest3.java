package com.itheima.test;

import java.util.Scanner;

public class LoopTest3 {
    public static void main(String[] args) {
        //键盘录入一个正整数x,判断该正整数是否为一个质数
        System.out.println("请输入一个正整数:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        //假设x是一个质数
        boolean flag = true;
        for (int i = 2; i < x; i++) {
            if(x % i == 0){
                flag = false;
                //System.out.println("不是质数");
                break;
            }

        }
        if(flag){
            System.out.println(x + "是一个质数");
        }else {
            System.out.println(x + "不是一个质数");
        }
    }
}
