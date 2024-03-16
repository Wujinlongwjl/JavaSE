//2023年12月31日10:23:34
package com.itheima.test;

import java.util.Scanner;

public class Test1_1 {
    public static void main(String[] args) {
        /*需求：
        机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
        按照如下规则计算机票价格：旺季(5-10月)头等舱9折，经济舱8.5折，淡季(11月到来年4月)头等舱7
        折，经济舱6.5折。*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double price = sc.nextDouble();

        System.out.println("请输入是头等舱或经济舱,0表示头等舱,1表示经济舱：");
        int seat = sc.nextInt();

        System.out.println("请输入月份:");
        int month = sc.nextInt();


        if (month >= 5 && month <= 10) {
            price = getPrice(price, seat, 0.9, 0.85);

        } else if ((month <= 4 && month >= 1) || (month >= 11 && month <= 12)) {
            price = getPrice(price, seat, 0.7, 0.65);


        } else {
            System.out.println("键盘录入的月份不合法");
        }
        System.out.println("当前的价格为:" + price);

    }

    public static double getPrice(double price, int seat, double v0, double v1) {
        if (seat == 0) {
            price = price * v0;

        } else if (seat == 1) {
            price = price * v1;

        } else {
            System.out.println("没有这个舱位");
        }
        return price;

    }

}
