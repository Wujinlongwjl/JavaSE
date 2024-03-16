package com.itheima.myobjectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectStreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {



        //创建反序列化流的对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myio\\b.txt"));
        //读取数据
        Student o = (Student) ois.readObject();
        //打印对象
        System.out.println(o);
        //释放资源
        ois.close();
    }
}
