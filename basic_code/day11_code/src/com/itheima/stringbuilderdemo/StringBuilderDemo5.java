package com.itheima.stringbuilderdemo;

public class StringBuilderDemo5 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1, 2, 3};
        //调用方法
        String str = arrToString(arr);
        System.out.println(str);
    }

    public static String arrToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(arr.length - 1 == i){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
