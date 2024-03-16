package com.itheima.mystream;

import java.util.Arrays;
import java.util.SortedMap;

public class StreamDemo4 {
    public static void main(String[] args) {
        //创建数组stream流
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        String[] arr2 = {"a", "b", "c"};
        Arrays.stream(arr1).forEach(s -> System.out.println(s));
        System.out.println("-----------------------------------");
        Arrays.stream(arr2).forEach(s -> System.out.println(s));
    }
}
