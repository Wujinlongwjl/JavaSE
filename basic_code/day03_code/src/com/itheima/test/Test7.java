//2023年12月29日10:44:51
package com.itheima.test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //键盘录入一个整数的成绩
        System.out.println("请输入小明的成绩:");
        int score = sc.nextInt();
        if(score >= 0 && score <= 100){
            if (score >= 95 && score <= 100) {
                System.out.println("送自行车一辆");
            }else if(score >= 90 && score <= 94){
                System.out.println("游乐场玩一天");
            }else if(score >= 80 && score <= 89){
                System.out.println("送变形金刚一个");
            }else {
                System.out.println("揍一顿");
            }
        }else {
            System.out.println("当前录入的成绩不合法");
        }

    }

}
