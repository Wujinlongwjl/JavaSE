//2023年12月28日20:41:27

package com.itheima.test;

import java.util.Scanner;

public class Test3 {

    /*数字6是一个真正伟大的数字，键盘录入两个整数。
    如果其中一个为6，最终结果输出true.
    如果它们的和为6的倍数。最终结果输出true.
    其他情况都是false。*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数字:");
        int number2 = sc.nextInt();
        boolean result = number1 == 6 || number2 == 6 || (number1 + number2) % 6 == 0;
        System.out.println(result);
    }
}
