package com.itheima.mysort;

public class RecursionDemo2 {
    public static void main(String[] args) {
        //需求：用递归求5的阶乘，并把结果在控制台输出
        System.out.println(function(4));
    }

    public static int function(int number){
        if(number == 1){
            return 1;
        }
        return number * function(number - 1);
    }
}
