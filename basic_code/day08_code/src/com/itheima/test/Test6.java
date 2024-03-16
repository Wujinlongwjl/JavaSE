package com.itheima.test;

public class Test6 {
    public static void main(String[] args) {
        /*需求：
        某系统的数字密码(大于0)，比如1983，采用加密方式进行传输。
        规则如下：
        先得到每位数，然后每位数都加上5，再对10求余，最后将所有数字反转，得到一串新数。*/


        //把整数里面的每一位放到数组当中
        int[] arr = {1, 9, 8, 3};

        //每位数都加上5         6, 14, 13, 8
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
        }

        //在对10求余            6, 4, 3, 8
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }

        //再将所有数字反转      8, 3, 4, 6
        for (int i = 0, j = arr.length -1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        //将所有数字进行拼接
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i];
        }
        System.out.println(num);

    }
}
