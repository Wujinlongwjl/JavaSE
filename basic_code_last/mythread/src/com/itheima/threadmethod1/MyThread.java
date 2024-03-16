package com.itheima.threadmethod1;

public class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);//e.printStackTrace()
            }
            System.out.println(getName() + "@" + i);
        }
    }
}
