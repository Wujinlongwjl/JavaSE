package com.itheima.myhashsettest;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        /*需求：创建5个学生对象
        属性：(姓名，年龄，语文成绩,数学成绩,英语成绩)，
        按照总分从高到低输出到控制台
        如果总分一样，按照语文成绩排
        如果语文一样，按照数学成绩排
        如果数学成绩一样，按照英语成绩排
        如果英文成绩一样，按照年龄排
        如果年龄一样，按照姓名的字母顺序排
        如果都一样，认为是同一个学生，不存。*/



        //创建学生对象
        Student s1 = new Student("zhangsan",23,98,55,77);
        Student s2 = new Student("lisi",24,87,79,34);
        Student s3 = new Student("wangwu",25,77,33,99);
        Student s4 = new Student("zhaoliu",26,83,66,84);
        Student s5 = new Student("qianqi",27,71,52,91);

        TreeSet<Student> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        //遍历
        for (Student t : ts) {
            System.out.println(t);

        }
    }
}
