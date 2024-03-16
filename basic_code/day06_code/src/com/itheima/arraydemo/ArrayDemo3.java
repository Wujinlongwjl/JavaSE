//2023年12月30日10:37:16
package com.itheima.arraydemo;

public class ArrayDemo3 {
    public static void main(String[] args) {
        /*定义一个数组，存储1,2,3,4,5,6,7,8,9,10
        遍历数组得到每一个元素，统计数组里面一共有多少个能被3整除的数字*/

        //定义一个数组 存储1,2,3,4,5,6,7,8,9,10
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //定义一个变量,用来统计个数
        int count = 0;
        //遍历数组得到每一个元素
        for (int i = 0; i < arr.length; i++) {
            //i表示数组里面的每一个索引
            //arr[i]表示数组里面的每一个元素

            //打印每一个元素
            System.out.println(arr[i]);
            //判断当前元素能否被3整除,如果可以统计变量就自增一次
            if (arr[i] % 3 == 0) {
                count++;
            }
        }
        System.out.println("一共有" + count + "个能被3整除的数字");
    }
}
