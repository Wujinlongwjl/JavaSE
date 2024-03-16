//2023年12月29日20:56:43

package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random r = new Random();
        //生成1~100的数
        int number = r.nextInt(100) + 1;

        while (true) {
            System.out.println("请输入你猜的数字:");
            int guessNumber = sc.nextInt();
            if (guessNumber == number) {
                System.out.println("猜对了");
                break;
            }
            if (guessNumber > number) {
                System.out.println("猜大了");
            }
            if (guessNumber < number) {
                System.out.println("猜小了");
            }
        }


    }
}
