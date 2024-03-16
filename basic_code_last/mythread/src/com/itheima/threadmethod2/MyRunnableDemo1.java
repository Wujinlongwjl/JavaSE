package com.itheima.threadmethod2;

import com.itheima.thread1.MyThread;

public class MyRunnableDemo1 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr,"飞机");
        Thread t2 = new Thread(mr,"坦克");

        t1.setPriority(1);
        t2.setPriority(10);


        t1.start();
        t2.start();
    }
}
