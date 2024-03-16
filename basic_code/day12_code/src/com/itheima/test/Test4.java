//2024年1月5日18:13:49
package com.itheima.test;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {

        /*需求：定义一个集合，添加一些学生对象，并进行遍历
        学生类的属性为：姓名，年龄。*/

        //创建集合
        ArrayList<Student> list = new ArrayList<>();
        //创建学生对象
        Student stu1 = new Student("zhangsan", 23);
        Student stu2 = new Student("lisi", 24);
        Student stu3 = new Student("wangwu", 25);
        //添加元素
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + ", " + stu.getAge());

        }

    }
}
