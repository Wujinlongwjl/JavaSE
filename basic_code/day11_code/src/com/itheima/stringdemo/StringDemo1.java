package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
       /* 需求：已知正确的用户名和密码，请用程序实现模拟用户登录。
        总共给三次机会，登录之后，给出相应的提示*/


        //定义两个变量，记录正确的用户名和密码
        String rightUsername = "zhangsan";
        String rightPassword = "123456";

        //键盘录入用户名和密码
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名:");
            String username = sc.next();
            System.out.println("请输入密码:");
            String password = sc.next();
            if (username.equals(rightUsername) && password.equals(rightPassword)) {
                System.out.println("用户登录成功");
                break;
            } else {
                if (i == 2) {
                    System.out.println("三次机会用完,请24小时后再尝试");
                    break;
                }else {
                    System.out.println("用户登录失败,用户名或密码错误,您还剩 " + (2 - i) + "次机会");
                }

            }

        }
    }


}

