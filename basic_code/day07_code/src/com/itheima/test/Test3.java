//2023年12月30日20:24:35
package com.itheima.test;

public class Test3 {
    public static void main(String[] args) {
        /*需求：
        定义一个方法copyOfRange(int arr,int from,int to)
        功能：
        将数组arr中从索引from(包含from)开始。
        到索引to结束(不包含to)的元素复制到新数组中，
        将新数组返回。*/

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] copyArr = copyOfRange(arr, 3, 7);
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + "\t");

        }
    }


    public static int[] copyOfRange(int[] arr, int from, int to) {
        int index = 0;
        int[] newArr = new int[to - from];
        for (int i = from; i < to; i++) {

            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }
}
