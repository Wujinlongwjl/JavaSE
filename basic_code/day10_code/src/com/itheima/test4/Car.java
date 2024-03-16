package com.itheima.test4;

public class Car {
    //第一套体系:
    //nextInt();接收整数
    //nextDouble();接收小数
    //next();接收字符串
    //遇到空格,制表符,回车就停止.这些符合后面的数据就不会接受了

    //第二套体系:
    //nextLine();接收字符串
    //可以接收空格,制表符,遇到回车才停止接收数据



    //键盘录入数据添加到数组当中

    private String brand;
    private int price;
    private String color;


    public Car() {
    }

    public Car(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
