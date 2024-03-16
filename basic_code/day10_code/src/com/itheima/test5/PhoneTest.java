package com.itheima.test5;

public class PhoneTest {
    public static void main(String[] args) {
        //创建数组
        Phone[] arr = new Phone[3];

        Phone p1 = new Phone("华为", 5999, "银白色");
        Phone p2 = new Phone("小米", 1999, "灰色");
        Phone p3 = new Phone("魅族", 3999, "蓝色");

        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;


        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum = sum + phone.getPrice();
        }
        int average = sum / arr.length;
        System.out.println(average);
    }
}
