package com.itheima.lambdademo;

import java.util.Arrays;

public class LambdaDemo3 {
    public static void main(String[] args) {
        Integer[] arr = {2, 3, 6, 99, 44, 33, 22, 66, 77, 5};


        /*Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });*/


        /*//lambda完整格式
        Arrays.sort(arr,(Integer o1, Integer o2)->{
            return o1-o2;
        });*/




        //lambda省略写法
        Arrays.sort(arr,(o1,o2)->o1-o2);


        System.out.println(Arrays.toString(arr));
    }
}
