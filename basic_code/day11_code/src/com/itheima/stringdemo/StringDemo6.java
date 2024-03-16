//2024年1月4日16:39:03
package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {

        //键盘录入一个金额
        int money;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个金额:");
            money = sc.nextInt();
            //判断金额有无在范围之内
            if(money>=0 && money <=9999999){
                break;
            }else {
                System.out.println("金额无效");
            }
        }

        //
        String moneyStr = "";
        while (true){
            //从右往左获取数据,因为右侧是数据的个位
            int ge = money % 10;
            //将数字换成大写的
            String capitalNumber = getCapitalNumber(ge);
            //依次获取右边的数据
            money = money / 10;
            //拼接成字符串
            moneyStr = capitalNumber + moneyStr;// moneyStr = moneyStr capitalNumber; 这句拼接成相反的语句



            //等于0就结束
            if (money == 0){
                break;
            }

        }
        //System.out.println(moneyStr);

        //总七位,获取前面的位数
        int count = 7 - moneyStr.length();
        //获取总共七位,不足七位,前面补零
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }

        //定义单位字符串
        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};


        //将数字与单位拼接在一起
        String str = "";
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            str = str + c + arr[i];
        }
        System.out.println(str);

    }


    //输入数字变换成大写数字
    public static String getCapitalNumber(int number){
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[number];
    }

}
