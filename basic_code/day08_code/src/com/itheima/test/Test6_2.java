package com.itheima.test;

public class Test6_2 {
    public static void main(String[] args) {
        /*某系统的数字密码（大于日）。比如1983，采用加密方式进行传输，
规则如下：
每位数加上5
再对1日求余，
最后将所有数字反转，
得到一串新数。
按照以上规则进行解密：
比如1983加密之后变成8346，解密之后变成1983
*/

        int[] arr = {8, 3, 4, 6};

        //反转
        for (int i = 0,j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;


        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >=0 && arr[i] <= 4){
                arr[i] = arr[i] + 10;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        }

        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];

        }
        System.out.println(number);







    }
}
