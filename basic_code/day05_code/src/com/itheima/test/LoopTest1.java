package com.itheima.test;

public class LoopTest1 {
    public static void main(String[] args) {
        /*朋友聚会的时候可能会玩一个游戏：逢7过
游戏规则：从任意一个数字开始报数，当你要报的数字是包含7或者是7的倍数时都要说：过
需求：使用程序在控制台打印出1-100之间的满足逢七必过规则的数据*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入1-100之间的数字");
        int number = sc.nextInt();


        if ( number == 7 || number % 7 == 0 ||  number % 10 == 7 ||
                number / 10 % 10 ==7 ){
            System.out.println("过");

        }*/


        for (int i = 1; i <= 100; i++) {
            if(i % 7 == 0 || i% 10 == 7 || i / 10 % 10 ==7){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
