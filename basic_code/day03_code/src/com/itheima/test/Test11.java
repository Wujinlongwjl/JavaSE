package com.itheima.test;

public class Test11 {

    public static void main(String[] args) {
        //求1~100之间的偶数和

        int sum = 0;
        for(int i = 2; i <= 100; i += 2){
            sum += i;
        }
        System.out.println(sum);
    }
}
