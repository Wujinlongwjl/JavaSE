package com.itheima.myargs;

public class ArgsDemo1 {
    public static void main(String[] args) {
        //可变参数  ...args

        int sum = getSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(sum);

    }

    public static int getSum(int...args){
        int sum = 0;
        for (int i : args) {
            sum = sum + i;
        }
        return sum;
    }
}
