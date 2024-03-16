//2023年12月28日19:57:21

package com.itheima.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入我自己的时髦度:");
        int myFashion = sc.nextInt();
        System.out.println("请输入时髦度:");
        int girlFashion = sc.nextInt();

        boolean result = myFashion > girlFashion;
        System.out.println(result);
    }
}
