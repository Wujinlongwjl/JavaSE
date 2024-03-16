package com.itheima.test;

import java.util.ArrayList;

public class PhoneTest7 {
    public static void main(String[] args) {
        /*需求：
             定义Javabean类：Phone
             Phone属性：品牌，价格。
             main方法中定义一个集合，存入三个手机对象。
             分别为：小米，1000。苹果，8000。锤子2999.
             定义一个方法，将价格低于3000的手机信息返回。*/

        //创建集合
        ArrayList<Phone> list = new ArrayList<>();
        //创建手机对象
        Phone p1 = new Phone("小米", 1000);
        Phone p2 = new Phone("苹果", 8000);
        Phone p3 = new Phone("锤子", 2999);
        //添加元素
        list.add(p1);
        list.add(p2);
        list.add(p3);

        //遍历集合
        ArrayList<Phone> phoneInfoList = getPhoneInfo(list);
        for (int i = 0; i < phoneInfoList.size(); i++) {
            Phone phone = phoneInfoList.get(i);
            System.out.println(phone.getBrand() + ", " + phone.getPrice());

        }


    }

    //定义方法获取信息
    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list) {
        //创建集合
        ArrayList<Phone> resultList = new ArrayList<>();
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            int price = p.getPrice();
            //判断价格低于3000
            if (price < 3000) {
                resultList.add(p);

            }

        }
        //返回集合
        return resultList;
    }
}
