package com.itheima.thread3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建MyCallable实现Callable对象

        MyCallable mc = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<>(mc);
        Thread t1 = new Thread(ft);
        t1.start();

        Integer result = ft.get();
        System.out.println(result);



    }
}
