package com.itheima.mathdemo;

public class MathDemo3 {
    public static void main(String[] args) {
        //要求1：统计一共有多少个水仙花数。
        //要求2：判断一下为什么没有两位自幂数。（课后作业）
        //要求3：统计一共有多少个四叶玫瑰数，五角星数（课瓜作业）


        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;


            double sum = Math.pow(ge,2) + Math.pow(shi,2) ;
            if(sum == i){
                count++;
                System.out.println(sum);
            }

        }
        System.out.println(count);


    }
}
