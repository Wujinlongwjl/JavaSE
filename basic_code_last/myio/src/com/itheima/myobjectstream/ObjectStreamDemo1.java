package com.itheima.myobjectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //创建学生对象
        Student stu = new Student("zhangsan", 23,"上海");
        //创建序列化流的对象/对象操作输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myio\\b.txt"));
        //写出数据
        oos.writeObject(stu);
        //释放资源
        oos.close();
    }
}
