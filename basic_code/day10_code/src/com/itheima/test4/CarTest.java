package com.itheima.test4;

import java.util.Scanner;

public class CarTest {

    public static void main(String[] args) {

        //创建一个数组,用键盘录入数据添加进去
        Car[] arr = new Car[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建对象
            Car c = new Car();
            //录入品牌
            System.out.println("请输入汽车品牌:");
            String brand = sc.next();
            c.setBrand(brand);
            //录入价格
            System.out.println("请输入汽车的价格:");
            int price = sc.nextInt();
            c.setPrice(price);

            //录入颜色
            System.out.println("请输入汽车的颜色:");
            String color = sc.next();
            c.setColor(color);


            //将对象添加到数组当中
            arr[i] = c;


        }
        //遍历
        for (int i = 0; i < arr.length; i++) {
            Car car =  arr[i];
            System.out.println(car.getBrand() + ", " + car.getPrice() + ", " + car.getColor());

        }
    }
}
