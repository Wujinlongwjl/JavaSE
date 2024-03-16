package com.itheima.mymapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class HashMapDemo1 {
    public static void main(String[] args) {
        //创建HashMap集合
        HashMap<Student,String> hm = new HashMap<>();

        //创建三个学生对象
        Student s1 = new Student("zhangsan" , 23);
        Student s2 = new Student("lisi" , 24);
        Student s3 = new Student("wangwu" , 25);
        Student s4 = new Student("wangwu" , 25);

        //添加元素
        hm.put(s1,"安徽");
        hm.put(s2,"江苏");
        hm.put(s3,"上海");
        hm.put(s4,"浙江");

        //遍历集合
        Set<Student> keys = hm.keySet();
        for (Student key : keys) {
            String value = hm.get(key);
            System.out.println(key + "= " + value);
        }

        System.out.println("------------------------------");

        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "= " + value);

        }

        System.out.println("---------------------------");

        hm.forEach(new BiConsumer<Student, String>() {
            @Override
            public void accept(Student key, String value) {
                System.out.println(key + " = " + value);
            }
        });

        System.out.println("--------------------------");

        hm.forEach((key, value) -> System.out.println(key + " = " + value));

    }
}
