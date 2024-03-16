//2024年1月5日20:13:15
package com.itheima.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    private static final String ADDSTUDENT = "1";
    private static final String DELETESTUDENT = "2";
    private static final String UPDATESTUDENT = "3";
    private static final String QUERYSTUDENT = "4";
    private static final String EXIT = "5";

    public static void startStudentSystem() {
        /*欢迎来到黑马学生管理系统
        "1:添加学生"
        "2:删除学生"
        "3:修改学生"
        "4:查询学生"
        "5:退出"
        "请输入您的选择：*/

        //创建集合
        ArrayList<Student> list = new ArrayList<>();
       loop: while (true) {
            System.out.println("---------------欢迎来到黑马学生管理系统------------------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入您的选择:");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose){
                case ADDSTUDENT -> addStudent(list);
                case DELETESTUDENT -> deleteStudent(list);
                case UPDATESTUDENT -> updateStudent(list);
                case QUERYSTUDENT -> queryStudent(list);
                case EXIT -> {
                    System.out.println("退出");
                    //break loop;
                    System.exit(0);//停止虚拟机运行
                }
                default -> System.out.println("没有这个选项");
            }
        }


    }


    //添加学生
    public static void addStudent(ArrayList<Student> list){
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入学生的ID:");
            String id = sc.next();
            boolean flag = contains(list, id);
            if(flag){
                System.out.println("当前ID已经存在了,请重新录入:");
            }else {
                stu.setId(id);
                break;
            }
        }

        System.out.println("请输入学生的姓名:");
        String name = sc.next();
        stu.setName(name);

        System.out.println("请输入学生的年龄:");
        int age = sc.nextInt();
        stu.setAge(age);


        System.out.println("请输入学生的地址:");
        String address = sc.next();
        stu.setAddress(address);

        list.add(stu);
        System.out.println("学生信息添加成功");



    }

    //删除学生
    public static void deleteStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的ID:");
        String id = sc.next();
        int index = getIndex(list, id);
        if(index >= 0){
            list.remove(index);
            System.out.println("id为" + id + "删除成功");
        }else {
            System.out.println("id不存在,删除失败");
        }

    }

    //修改学生
    public static void updateStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的id:");
        String id = sc.next();
        int index = getIndex(list, id);
        if(index == -1){
            System.out.println("要修改的id为"+id+"不存在");
            return;
        }

        Student stu = list.get(index);
        System.out.println("请输入要修改的学生姓名:");
        String newName = sc.next();
        stu.setName(newName);

        System.out.println("请输入要修改的学生年龄:");
        int newAge = sc.nextInt();
        stu.setAge(newAge);

        System.out.println("请输入要修改的学生地址:");
        String newAddress = sc.next();
        stu.setAddress(newAddress);

        System.out.println("修改信息成功");



    }

    //查询学生
    public static void queryStudent(ArrayList<Student> list){
        if(list.size() == 0){
            System.out.println("当前无学生信息,请添加后在查询");
            return;
        }
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getId()+ "\t\t" +student.getName() + "\t" +
                    student.getAge() + "\t" + student.getAddress());


        }


    }



    //判断ID是否唯一
    public static boolean contains(ArrayList<Student> list, String id){
        /*for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String sid = stu.getId();
            if(sid.equals(id)){
                return true;
            }

        }
        return false;*/
        return getIndex(list,id) >= 0;
    }


    //判断id是否相等,相等返回索引,不相等返回-1
    public static int getIndex(ArrayList<Student> list, String id){
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String sid = stu.getId();
            if(sid.equals(id)){
                return i;
            }

        }
        return -1;
    }

}
