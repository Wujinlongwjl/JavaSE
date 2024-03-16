//2024年1月14日13:45:36
package com.itheima.searchdemo1;

public class BasicSearchDemo1 {
    public static void main(String[] args) {

        //基本查找
        int[] arr = {12, 33, 65, 35, 87, 44, 86, 99};
        int number = 23;
        boolean b = basicSearch(arr, number);
        System.out.println(b);


    }

    public static boolean basicSearch(int[] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return true;
            }

        }
        return false;
    }
}
