package com.itheima.mysort;

public class InsertSortDemo3 {
    public static void main(String[] args) {
        //插入排序
        int[] arr = {3, 44, 36, 35, 87, 33, 55, 23, 67, 66, 99, 4, 31, 11, 22};

        //分成两部分,前面有序,后面无序
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[i + 1]){
                startIndex = i + 1;
                break;
            }

        }

        for (int i = startIndex; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]){
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }


        }


        //这个也行,不用排序,直接从第二个与第一个进行比较,然后后面与其前面的比较
        /*for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }*/

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
