package com.itheima.test;

public class Test1 {
    //需求:设计一个方法求数组的最大值,并将最大值返回
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {33, 11, 66, 44, 55};
        //调用方法求最大值
        int max = getMax(arr);
        System.out.println(max);
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

}
