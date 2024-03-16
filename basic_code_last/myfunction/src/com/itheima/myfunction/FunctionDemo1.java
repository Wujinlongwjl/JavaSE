package com.itheima.myfunction;

import java.util.Arrays;
import java.util.Comparator;

public class FunctionDemo1 {
    public static void main(String[] args) {
        Integer[] arr = {2, 4, 1, 5, 3};

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        System.out.println(Arrays.toString(arr));


        Arrays.sort(arr, (Integer o1, Integer o2) -> {
            return o1 - o2;

        });
        System.out.println(Arrays.toString(arr));

        //lambda表达式简化格式
        Arrays.sort(arr, (o1, o2) -> o1 - o2);
        System.out.println(Arrays.toString(arr));

        //方法引用   ::方法引用符
        Arrays.sort(arr, FunctionDemo1::subtraction);
        System.out.println(Arrays.toString(arr));

    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }
}
