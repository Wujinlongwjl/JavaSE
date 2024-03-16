package com.itheima.threadtest4;

public class ThreadTest4 {
    public static void main(String[] args) {
        /*抢红包也用到了多线程。
        假设：100块，分成了3个包，现在有5个人去抢。
        其中，红包是共享数据。
        5个人是5条线程。
        打印结果如下：
        XXX抢到了XXX元
                XXX抢到了XXX元
        XXX抢到了XXX元
                XXX没抢到
        XXX没抢到*/

        //创建线程对象
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        MyThread t4 = new MyThread();
        MyThread t5 = new MyThread();


        //给线程设置名字
        t1.setName("小诗诗");
        t2.setName("小丹丹");
        t3.setName("小慧慧");
        t4.setName("小娇娇");
        t5.setName("小辣椒");

        //启动线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
