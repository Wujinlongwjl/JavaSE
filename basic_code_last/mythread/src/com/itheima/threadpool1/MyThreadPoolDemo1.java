package com.itheima.threadpool1;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPoolDemo1 {
    public static void main(String[] args) throws InterruptedException {
        //获取线程池对象
        //ExecutorService pool1 = Executors.newCachedThreadPool();//没有上限的线程池
        ExecutorService pool1 = Executors.newFixedThreadPool(3);//有上限的线程池

        //提交任务
        pool1.submit(new MyRunnable());
        Thread.sleep(1000);
        pool1.submit(new MyRunnable());
        Thread.sleep(1000);
        pool1.submit(new MyRunnable());
        Thread.sleep(1000);
        pool1.submit(new MyRunnable());

        //销毁线程池
        //pool1.shutdown();

    }
}
