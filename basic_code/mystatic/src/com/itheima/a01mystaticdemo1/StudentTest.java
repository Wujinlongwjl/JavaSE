//2024年1月9日09:37:31
package com.itheima.a01mystaticdemo1;

public class StudentTest {
    public static void main(String[] args) {
        //创建第一个学生对象
        Student.teacherName = "z老师";
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(23);
        s1.setGender("男");
        s1.study();
        s1.show();
        //s1.teacherName = "z老师";

        //创建第一个学生对象
        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(24);
        s2.setGender("女");
        s2.study();
        s2.show();
        //s2.teacherName = "z老师";

    }
}
