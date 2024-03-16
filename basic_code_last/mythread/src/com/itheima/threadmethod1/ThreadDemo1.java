package com.itheima.threadmethod1;

public class ThreadDemo1 {
    public static void main(String[] args) throws InterruptedException {
        //创建线程的对象
        MyThread t1 = new MyThread("飞机");
        MyThread t2 = new MyThread("坦克");
        //开启线程
        t1.start();
        t2.start();



        /*Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println(name);//main*/


        /*System.out.println("1111111111111111111111");
        Thread.sleep(5000);
        System.out.println("2222222222222222222222");*/




    }
}
