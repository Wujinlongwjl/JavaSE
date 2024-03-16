package com.mydatetest;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*
            键盘录入一些1~100之间的整数，并添加到集合中。
            直到集合中所有数据和超过200为止。*/

        //创建一个集合
        ArrayList<Integer> list = new ArrayList<>();
        //键盘录入一个整数
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入一个整数:");
            String strNum = sc.nextLine();
            int num = Integer.parseInt(strNum);
            if(num < 1 || num > 100){
                System.out.println("输入的整数不合法,请重新输入");
                continue;
            }
            //将输入的整数添加到集合当中
            list.add(num);

            //调用求和方法
            int sum = getSum(list);

            if(sum > 200){
                System.out.println("输入整数的和已经大于200");
                break;
            }

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    //求和
    private static int getSum(ArrayList<Integer> list) {

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        return sum;
    }
}
