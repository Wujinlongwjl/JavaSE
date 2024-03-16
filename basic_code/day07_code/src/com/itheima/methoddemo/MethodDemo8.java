//2023年12月30日19:42:19
package com.itheima.methoddemo;

public class MethodDemo8 {
    //需求:设计一个方法用于数组遍历,要求遍历的结果是上一行的.例如:[11, 22, 33, 44, 55]
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        printArr(arr);

    }
    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("]");
    }

}
