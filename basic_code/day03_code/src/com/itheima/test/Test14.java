package com.itheima.test;

public class Test14 {
    public static void main(String[] args) {
        /*需求：给定两个整数，被除数和除数(都是正数，且不超过it的范围)
将两数相除，要求不使用乘法、除法和%运算符。
得到商和余数。*/

        //商 = 被除数 / 除数


        //定义变量为被除数
        int dividend = 100;
        //定义变量为除数
        int divisor = 10;
        //定义变量为商
        int count = 0;

        //比较被除数与除数
        while (divisor <= dividend){
            dividend = dividend - divisor;
            count++;
        }
        System.out.println("余数为" + dividend);
        System.out.println("商为" + count);
    }
}
