package com.itheima.test1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       /* 需求：
        键盘录入自己心仪的女朋友姓名和年龄。
        姓名的长度在3~10之间，
        年龄的范围为18-40岁，
        超出这个范围是异常数据不能赋值，需要重新录入，一直录到正确为止。
        提示：
        需要考虑用户在键盘录入时的所有情况。
        比如：录入年龄时超出范围，录入年龄时录入了abc等情况*/


        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //创建女朋友对象
        GirlFriend gf = new GirlFriend();
        while (true) {
            //键盘录入女朋友对象的姓名与年龄
            try {
                System.out.println("请输入你的心仪的女朋友的名字:");
                String name = sc.nextLine();
                gf.setName(name);
                System.out.println("请输入你心仪的女朋友的年龄:");
                String strAge = sc.nextLine();
                int age = Integer.parseInt(strAge);
                gf.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入的年龄的格式有误,请重新输入数字" );
                //continue;
            }catch (RuntimeException e){
                System.out.println("姓名的长度或者年龄的范围有误");
                //continue;
            }
        }
        System.out.println(gf);


    }
}
