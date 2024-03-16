package com.itheima.polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(23);

        Teacher t = new Teacher();
        t.setName("李四");
        t.setAge(24);

        Administrator ad = new Administrator();
        ad.setName("王爱国");
        ad.setAge(33);

        register(s);
        register(t);
        register(ad);


    }

    public static void register(Person p) {
        p.show();
    }
}
