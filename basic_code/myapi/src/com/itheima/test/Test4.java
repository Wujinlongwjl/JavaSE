package com.itheima.test;

public class Test4 {
    public static void main(String[] args) {
        /*可爱的小明特别喜欢爬楼梯，他有的时候一次爬一个台阶，有的时候一次爬两个台阶。
        如果这个楼梯有20个台阶，小明一共有多少种爬法呢？*/
        System.out.println(getCount(20));

    }
    public static int getCount(int n){
        if(n == 1){
            return 1;

        }
        if(n == 2){
            return 2;
        }

        return getCount(n - 1) + getCount(n - 2);
    }

}
