package com.itheima.mysort;

public class QuickSortDemo {
    public static void main(String[] args) {
        //快速排序
        int[] arr = {6, 3, 5, 11, 44, 66, 9, 2, 55};
        partition(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }

    public static void partition(int[] arr, int i, int j) {
        int low = i;
        int high = j;
        if(low > high){
            return;
        }

        int mid = arr[i];
        while (low != high) {

            while (true) {
                if (low >= high || arr[high] < mid) {
                    break;
                }
                high--;
            }

            while (true) {
                if (low >= high || arr[low] > mid) {
                    break;
                }
                low++;
            }


            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

        }
        int temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;

        partition(arr,i,low-1);
        partition(arr,low+1,j);
    }
}