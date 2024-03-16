package com.itheima.mathdemo;

public class MathDemo4 {
    public static void main(String[] args) {
        //要求1：统计一共有多少个水仙花数。
        //要求2：判断一下为什么没有两位自幂数。（课后作业）
        //要求3：统计一共有多少个四叶玫瑰数，五角星数（课瓜作业）


        int count = 0;
        for (int i = 1000; i <= 9999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;

            double sum = Math.pow(ge,4) + Math.pow(shi,4) + Math.pow(bai,4) + Math.pow(qian,4);
            if(sum == i){
                count++;
                System.out.println(sum);
            }

        }
        System.out.println(count);


    }
}
