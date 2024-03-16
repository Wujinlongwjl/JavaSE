package com.itheima.mysort;

public class SelectionDemo2 {
    public static void main(String[] args) {
        //选择排序:一开始选择最小的索引与后面每个元素进行比较,然后选择第二个
        int[] arr = {2, 1, 4, 5, 3};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1 + i; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
