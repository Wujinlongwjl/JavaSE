package com.itheima.test;

public class Test6_1 {
    public static void main(String[] args) {
        int number = 12345;
        int temp = number;
        int count = 0;
        while (number != 0) {
            //每一次循环都去掉右边一个数字
            number = number / 10;
            //去掉一个计数器就自增一次
            count++;
        }

        //动态初始化
        int[] arr = new int[count];

        //把整数上的每一位都添加到数组当中
        int index = arr.length - 1;
        while (temp != 0) {
            //获取temp里面的每一位数组
            int ge = temp % 10;
            //再去掉右边的那位数字
            temp = temp / 10;
            //把当前获取的个位添加到数组当中
            arr[index] = ge;
            index--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
