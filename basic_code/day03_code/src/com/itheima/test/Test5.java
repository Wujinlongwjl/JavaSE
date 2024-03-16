//2023年12月29日10:24:25
package com.itheima.test;

import java.util.Scanner;

public class Test5 {
    /*需求：键盘录入一个整数，表示身上的钱。
如果大于等于100块，就是网红餐厅。
否则，就吃经济实惠的沙县小吃。*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //请输入身上的钱
        System.out.println("请输入身上的钱:");
        int money = sc.nextInt();
        if(money >= 100){
            System.out.println("吃网红餐厅");
        }else{
            System.out.println("吃经济实惠的沙县小吃");
        }


    }


}
