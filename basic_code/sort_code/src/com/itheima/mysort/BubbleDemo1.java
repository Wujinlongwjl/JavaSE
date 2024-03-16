package com.itheima.mysort;

public class BubbleDemo1 {
    public static void main(String[] args) {
        //冒泡排序
        int[] arr = {2, 4, 1, 5, 3};
        //趟数
        for (int i = 0; i < arr.length - 1; i++) {
            //每趟比较的次数
            for (int j = 0; j < arr.length -1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }


}
