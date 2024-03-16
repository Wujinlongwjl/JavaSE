//2023年12月30日11:10:06
package com.itheima.test;

public class ArrayTest1 {
    public static void main(String[] args) {
        //定义一个数字求最大值
        int[] arr = {33, 55, 99, 77, 88};
        int max = arr[0];//将第一个元素赋值给变量max
        for (int i = 0; i < arr.length; i++) {
            //如果后面的元素比前面的大,就将大的元素赋值个max
            if(arr[i] > max){
                max = arr[i];
            }
        }
        //打印最大值
        System.out.println(max);
    }
}
