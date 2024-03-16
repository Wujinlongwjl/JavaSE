package com.itheima.myhashset;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {


        //创建学生对象
        Student1 s1 = new Student1("张三",23);
        Student1 s2 = new Student1("李四",24);
        Student1 s3 = new Student1("王五",25);



        //创建集合对象
        TreeSet<Student1> ts = new TreeSet();

        ts.add(s3);
        ts.add(s1);
        ts.add(s2);

        System.out.println(ts);


    }
}
