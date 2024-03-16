package com.itheima.mymapdemo;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        /*需求1:
        键：整数表示id
        值：字符串表示商品名称
        要求：按照id的升序排列、按照id的降序排列

        需求2:
        键：学生对象
        值：籍贯
        要求：按照学生年龄的升序排列，年龄一样按照姓名的字母排列，同姓名年龄视为同一个人。*/

        //创建集合
        TreeMap<Student1,String> hm = new TreeMap<>();


        //创建学生对象
        Student1 s1 = new Student1("zhangsan",23);
        Student1 s2 = new Student1("lisi",24);
        Student1 s3 = new Student1("wangwu",25);

        //添加元素
        hm.put(s1,"安徽");
        hm.put(s2,"上海");
        hm.put(s3,"江苏");

        System.out.println(hm);

    }
}
