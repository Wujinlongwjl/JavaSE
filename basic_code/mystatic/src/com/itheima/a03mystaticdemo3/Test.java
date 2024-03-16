package com.itheima.a03mystaticdemo3;

import java.util.ArrayList;


/*
总结：   静态方法中，只能访问静态。
        非静态方法可以访问所有。
        静态方法中没有this关键字
*/


public class Test {
    public static void main(String[] args) {
        //定义一个集合
        ArrayList<Student> list = new ArrayList<>();
        //创建学生对象
        Student s1 = new Student("zhangsan", 23, "男");
        Student s2 = new Student("lisi", 24, "女");
        Student s3 = new Student("wangwu", 25, "男");

        //把学生对象添加到集合当中
        list.add(s1);
        list.add(s2);
        list.add(s3);


        //调用工具类的方法
        int maxAgeStudent = StudentUtil.getMaxAgeStudent(list);
        System.out.println(maxAgeStudent);


    }
}
