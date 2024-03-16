package com.itheima.myexception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        try {
            System.out.println(arr[10]);
        } catch (Exception e) {
            String message = e.getMessage();
            System.out.println(message);//Index 10 out of bounds for length 6

            String str = e.toString();
            System.out.println(str);//java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 6


            e.printStackTrace();        //打印红色字体


        }

        System.out.println(123);
        System.err.println(123);//err:打印的是红色字体
    }
}
