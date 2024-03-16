//2023年12月28日21:05:06
//ctrl + Alt + L 自动格式化代码


package com.itheima.test;

import java.util.Scanner;

public class Test4 {
    /*需求：动物园里有两只老虎，体重分别为通过键盘录入获得，
请用程序实现判断两只老虎的体重是否相同。*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重:");
        int weight1 = sc.nextInt();
        System.out.println("请输入第二只老虎的体重:");
        int weight2 = sc.nextInt();

        String result = weight1 == weight2 ? "相同" : "不同";
        System.out.println(result);
    }

}
