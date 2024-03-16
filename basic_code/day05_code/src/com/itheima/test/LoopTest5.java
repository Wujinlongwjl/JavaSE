package com.itheima.test;

import java.util.Random;

public class LoopTest5 {
    public static void main(String[] args) {


        /* 例如:用来生成任意到任意数之间的随机数 7~15
        1.让这个范围头尾都减去一个值,让这个范围从0开始 -7  0~8
        2.尾巴+1  8+1=9
        3.最终的结果,再加上第一步减去的值
         */


        //随机生成7~15的随机数
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int number = r.nextInt(9) + 7;

            System.out.println(number);

        }
    }
}
