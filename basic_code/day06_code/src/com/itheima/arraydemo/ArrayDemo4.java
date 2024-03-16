package com.itheima.arraydemo;

public class ArrayDemo4 {
    public static void main(String[] args) {
        /*要求：
        1,如果是奇数，
        则将当前数字扩大两倍
        2,如果是偶数，则将当前数字变成二分之一*/

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;

            } else {
                arr[i] = arr[i] * 2;

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
