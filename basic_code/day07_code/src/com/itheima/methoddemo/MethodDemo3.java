package com.itheima.methoddemo;

public class MethodDemo3 {
    //需求：定义一个方法，求长方形的周长，将结果在方法中进行打印。
    public static void main(String[] args) {

        getLength(5.3, 5.2);
    }

    public static void getLength(double len, double width) {
        double result = (len + width) * 2;
        System.out.println(result);

    }
}
