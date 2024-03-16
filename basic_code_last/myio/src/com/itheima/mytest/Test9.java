package com.itheima.mytest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Test9 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建反序列化流的对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myio\\a.txt"));
        //读取数据
        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();

        for (Student student : list) {
            System.out.println(student);

        }

        //释放资源
        ois.close();
    }
}
