package com.itheima.test;

import java.util.Random;

public class LoopTest4 {
    public static void main(String[] args) {
        //生成一个0~9的随机数

        //创建对象
        Random r = new Random();
        int number = r.nextInt(10);//范围为0~9
        System.out.println(number);
    }
}
