package com.itheima.myiotest7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myio\\src\\com\\itheima\\myiotest7\\userinfo.txt"));
        String line = br.readLine();
        br.close();


        String[] userInfo = line.split("&");
        String[] arr1 = userInfo[0].split("=");
        String[] arr2 = userInfo[1].split("=");
        String rightUsername = arr1[1];
        String rightPassword = arr2[1];

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = sc.nextLine();
        System.out.println("请输入密码:");
        String password = sc.nextLine();


        if(rightUsername.equals(username) && rightPassword.equals(password)){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
    }
}
