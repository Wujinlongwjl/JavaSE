package com.itheima.test;

public class Test10 {
    public static void main(String[] args) {
        int sum = 0;

        //将1~5数字相加
        for(int i = 1; i <= 100; i++){
            sum += i;
        }
        //打印最后相加的结果
        System.out.println(sum);
    }
}
