package com.itheima.thread2;

public class ThreadDemo1 {
    public static void main(String[] args) {
        //创建MyRun对象
        MyRun mr = new MyRun();
        //创建线程对象
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();

    }
}
