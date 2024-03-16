package com.itheima.searchdemo1;

public class BinarySearchDemo1 {
    public static void main(String[] args) {
        //二分查找  数据必须是有序的
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88};
        int number = 11;
        int result = binarySearch(arr, number);
        System.out.println(result);
    }

    public static int binarySearch(int[] arr, int number){
        int low = 0;
        int high = arr.length - 1;

        while (true){
            if(low > high){
                return -1;
            }

            int mid = (low + high) / 2;
            if(arr[mid] > number){
                high = mid - 1;
            }else if(arr[mid] < number){
                low = mid + 1;
            }else {
                return mid;
            }
        }
    }
}
