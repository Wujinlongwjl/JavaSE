package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        //定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处
        int[] arr = {3, 54, 64, 36, 75, 53, 44};
        boolean flag = contains(arr,144);
        System.out.println(flag);
    }

    public static boolean contains(int[] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return true;
            }
        }
        return false;
    }
}
