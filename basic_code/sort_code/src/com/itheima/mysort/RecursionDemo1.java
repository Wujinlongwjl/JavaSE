package com.itheima.mysort;

public class RecursionDemo1 {
    public static void main(String[] args) {
        //递归

        int sum = method(10);
        System.out.println(sum);

    }

    public static int method(int number){
        if(number == 1){
            return 1;
        }

        return number + method(number - 1);
    }
}
