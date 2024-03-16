package com.itheima.methoddemo;

public class MethodDemo5 {
    public static void main(String[] args) {
        //计算全年的总营业额

        //计算第一季度的营业额
        int sum1 = getSum(19,43,32);
        //计算第一季度的营业额
        int sum2 = getSum(33,44,66);
        //计算第一季度的营业额
        int sum3 = getSum(32,24,63);
        //计算第一季度的营业额
        int sum4 = getSum(34,53,26);

        //计算总的营业额
        int sum = sum1 + sum2 + sum3 + sum4;

        System.out.println(sum);
    }
    public static int getSum(int sum1,int sum2, int sum3){
        int result = sum1 + sum2 + sum3;
        return result;
    }
}
