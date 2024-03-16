package com.itheima.test;

import java.util.Random;

public class ArrayTest2 {
    /*需求：生成10个1~100之间的随机数存入数组。
1)求出所有数据的和
2)求所有数据的平均数
3)统计有多少个数据比平均值小*/
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        double sum = 0;
        double average = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100) + 1;
            arr[i] = number;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");

        }
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println();
        average = sum / arr.length;


        System.out.println("和为:" + sum);
        System.out.println("平均数为:" + average);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average) {
                count++;
            }
        }
        System.out.println("有" + count + "个数比平均值小");

    }


}
