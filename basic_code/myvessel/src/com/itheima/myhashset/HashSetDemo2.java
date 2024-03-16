package com.itheima.myhashset;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {

        //创建学生对象
        Student s1 = new Student("张三",23);
        Student s2 = new Student("李四",24);
        Student s3 = new Student("王五",25);
        Student s4 = new Student("张三",23);

        //创建集合并添加对象
        HashSet<Student> hs = new HashSet<>();

        //添加元素
        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));
    }
}
