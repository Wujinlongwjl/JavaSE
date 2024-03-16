//2023年12月29日18:07:02
package com.itheima.test;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        /*需求：键盘录入两个数字，表示一个范围。
统计这个范围中。
既能被3整除，又能被5整除数字有多少个？*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字表示开始:");
        int start = sc.nextInt();
        System.out.println("请输入一个数字表示结束:");
        int end = sc.nextInt();
        int count = 0;
        for (int i = start; i <= end; i++) {

            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i);

                count ++;
            }

        }
        System.out.println(count);

    }

}
