package com.itheima.threadmethod3;

import com.itheima.threadmethod1.MyThread;

public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.setName("女神");
        t2.setName("备胎");

        //把第二个线程设置为守护线程(备胎线程)   陆陆续续结束
        t2.setDaemon(true);

        t1.start();
        t2.start();
    }
}
