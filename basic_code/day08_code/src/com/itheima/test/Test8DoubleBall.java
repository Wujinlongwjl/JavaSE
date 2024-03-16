//2024年1月1日10:05:15
package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class Test8DoubleBall{
    public static void main(String[] args) {
        /*投注号码由6个红色球号码和1个蓝色
        球号码组成。红色球号码从1一33中选
        择；蓝色球号码从1一16中选择。*/

        //随机生成红蓝号码
        int[] arr = creatNumber();

        /*System.out.println("-------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");

        }
        System.out.println("-----------------");*/

        //手动输入红蓝号码
        int[] useInputArr = useInputNumber();


        int redCount = 0;
        int blueCount = 0;
        //判断红色号码是否一致
        for (int i = 0; i < useInputArr.length -1; i++) {
            int redNumber = useInputArr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if(redNumber == arr[j]){
                    redCount++;
                    break;
                }
            }
        }

        //判断蓝色号码是否一致
        int blueNumber = useInputArr[useInputArr.length - 1];
        if (blueNumber == arr[arr.length-1]){
            blueCount++;
        }
//        System.out.println(redCount);
//        System.out.println(blueCount);


        //判断有无中奖
        if(redCount == 6 & blueCount == 1){
            System.out.println("恭喜你,中奖1000万");
        }else if(redCount == 6 & blueCount == 0){
            System.out.println("恭喜你,中奖500万");
        }else if(redCount == 5 & blueCount == 1){
            System.out.println("恭喜你,中奖3000");
        }else if((redCount == 5 & blueCount == 0) ||(redCount == 4 & blueCount == 1)){
            System.out.println("恭喜你,中奖200");
        }else if((redCount == 4 & blueCount == 0) ||(redCount == 3 & blueCount == 1)){
            System.out.println("恭喜你,中奖10");
        }else if((redCount == 2 & blueCount == 1) ||(redCount == 1 & blueCount == 1)||(redCount == 0 & blueCount == 1)){
            System.out.println("恭喜你,中奖5");
        }else {
            System.out.println("谢谢参与,谢谢惠顾");
        }


    }



    //用户输入号码
    public static int[] useInputNumber() {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length - 1; ) {
            System.out.println("请输入第" + (i + 1) + "个号码:");
            int redNumber = sc.nextInt();
            if (redNumber > 0 && redNumber <= 33) {
                boolean flag = contains(arr, redNumber);
                if (!flag) {
                    arr[i] = redNumber;
                    i++;
                } else {
                    System.out.println("当前红色号码已经存在,请重新输入:");
                }

            } else {
                System.out.println("输入的号码超出了范围");
            }

        }

        System.out.println("请输入蓝色号码:");
        int blueNumber = sc.nextInt();

        while (true) {
            if (blueNumber > 0 & blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber;
                break;
            } else {
                System.out.println("当前蓝色号码超过范围,请重新输入:");
            }
        }
        return arr;

    }


    public static int[] creatNumber() {
        //创建数组用于添加中奖号码
        //6个红球 1个蓝球  数组长度:7


        int[] arr = new int[7];
        //随机生成号码并添加到数组当中
        //红球:不能重复的
        //蓝球:可以跟红球号码重复
        Random r = new Random();
        for (int i = 0; i < arr.length; ) {
            //获取红球号码
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                //把红球号码添加到数组当中
                arr[i] = redNumber;
                i++;
            }
            //生成蓝球号码并添加到数组当中
            int blueNumber = r.nextInt(16) + 1;
            arr[arr.length - 1] = blueNumber;
        }
        return arr;
    }


    //为了获取红球号码各不相同
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
