//2023年12月29日10:30:04

package com.itheima.test;


import java.util.Scanner;

public class Test6 {

    public static void main(String[] args) {
        /*假设某影院售卖了100张票，票的序号为1~100.
        其中奇数票号坐左侧，偶数票号坐右侧。
        键盘录入一个整数表示电影票的票号。
        根据不同情况，给出不同的提示：
        如果票号为奇数，那么打印坐左边
        如果票号为偶数，那么打印坐右边。*/


        //键盘录入一个1~100整数表示电影票的票号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个1~100电影票的票号:");
        int ticket = sc.nextInt();

        //判断票号是奇数还是偶数
        //if嵌套
        if(ticket >= 0 && ticket <= 100){
            if(ticket % 2 == 0){
                System.out.println("坐右边");
            }else {
                System.out.println("坐左边");
            }
        }


    }


}
