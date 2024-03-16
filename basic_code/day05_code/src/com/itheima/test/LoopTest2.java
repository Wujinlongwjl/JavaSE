package com.itheima.test;

import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        /*需求：键盘录入一个大于等于2的整数X,计算并返回X的平方根。
        结果只保留整数部分，小数部分将被舍去。*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于等于2的整数:");
        int X = sc.nextInt();
        /*X = (int) sqrt(X);
        System.out.println(X);*/

        for (int i = 1; i <= X; i++) {
            if(i * i == X){
                System.out.println(i + "就是" + X + "平方根");
                break;//一旦找到了,循环就可以停止了,后面数字就可以不需要再找了,提高代码运行效率
            }else if(i * i >= X){
                System.out.println(i - 1 + "就是" + X + "平方根");
                break;

            }
        }
    }

}
