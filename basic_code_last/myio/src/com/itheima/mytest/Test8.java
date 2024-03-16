package com.itheima.mytest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) throws IOException {
        //创建对象
        Student stu1 = new Student("zhangsan",23,"南京");
        Student stu2 = new Student("lisi",24,"天津");
        Student stu3 = new Student("wangwu",25,"北京");

        //创建集合把对象添加进去
        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //创建序列化流的对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myio\\a.txt"));

        //写出数据
        oos.writeObject(list);


        //释放资源

        oos.close();
    }
}
