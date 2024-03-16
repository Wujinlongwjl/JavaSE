package com.itheima.searchdemo1;

import java.util.ArrayList;

public class BasicSearchDemo2 {
    public static void main(String[] args) {
        int[] arr = {12, 33, 65, 33, 87, 44, 86, 99};
        int number = 33;
        int b = basicSearch(arr, number);
        System.out.println(b);

    }
    public static int basicSearch(int[] arr, int number){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                list.add(i);
            }

        }
        return list.toArray().length;
    }
}
