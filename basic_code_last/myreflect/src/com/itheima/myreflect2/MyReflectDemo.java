package com.itheima.myreflect2;

import com.itheima.myreflect2.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class MyReflectDemo {
    public static void main(String[] args) throws IllegalAccessException, IOException {
        Student s = new Student("小A", 23,'女',168.2,"睡觉");
        Teacher t = new Teacher("播妞", 10000);

        saveObject(s);

    }

    private static void saveObject(Object obj) throws IllegalAccessException, IOException {
        //1.获取字节码文件的对象
        Class clazz = obj.getClass();

        //2.创建IO流
        BufferedWriter bw = new BufferedWriter(new FileWriter("myreflect\\a.txt"));

        //3.获取所有的成员变量
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            //获取成员变量的名字
            String name = field.getName();
            //获取成员变量的值
            Object value = field.get(obj);

            //写出数据
            bw.write(name + "=" + value);
            bw.newLine();



        }
        bw.close();

    }
}
