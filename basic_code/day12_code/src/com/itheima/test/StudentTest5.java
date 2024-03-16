package com.itheima.test;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest5 {
    public static void main(String[] args) {
        /*需求：定义一个集合，添加一些学生对象，并进行遍历
        学生类的属性为：姓名，年龄。
        要求：对象的数据来自键盘录入*/

        //创建集合
        ArrayList<Student> list = new ArrayList<>();
        //键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            //创建对象
            Student stu = new Student();
            System.out.println("请输入姓名:");
            String name = sc.next();
            System.out.println("请输入年龄:");
            int age = sc.nextInt();

            stu.setName(name);
            stu.setAge(age);
            list.add(stu);

            /*//创建对象
            Student stu = new Student(name,age);
            list.add(stu);*/
        }

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + ", " + stu.getAge() );

        }
    }
}
