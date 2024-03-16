package com.itheima.threadtest6;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {
    /*在上一题基础上继续完成如下需求：
    每次抽的过程中，不打印，抽完时一次性打印(随机)
    在此次抽奖过程中，抽奖箱1总共产生了6个奖项。
    分别为：10,20,100,500,2,300最高奖项为300元，总计额为932元
    在此次抽奖过程中，抽奖箱2总共产生了6个奖项。
    分别为：5,50,200,800,80,700最高奖项为800元，总计额为1835元*/

    ArrayList<Integer> list;

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    //线程一
    static ArrayList<Integer> list1 = new ArrayList<>();
    //线程二
    static ArrayList<Integer> list2 = new ArrayList<>();


    @Override
    public void run() {
        //1.循环
        //2.同步代码块
        //3.判断
        //4.判断


        while (true) {
            synchronized (com.itheima.threadtest5.MyThread.class) {
                if (list.size() == 0) {
                    if ("抽奖箱1".equals(getName())) {
                        System.out.println("抽奖箱1" + list1);

                        int sum1 = 0;
                        for (int i = 0; i < list1.size(); i++) {
                            sum1 = sum1 + list1.get(i);

                        }
                        System.out.println("抽奖箱1总计额" + sum1);


                    } else {
                        System.out.println("抽奖箱2" + list2);

                        int sum2 = 0;
                        for (int i = 0; i < list2.size(); i++) {
                            sum2 = sum2 + list2.get(i);

                        }
                        System.out.println("抽奖箱2总计额" + sum2);
                    }


                    break;
                } else {
                    Collections.shuffle(list);
                    int prize = list.remove(0);
                    if ("抽奖箱1".equals(getName())) {
                        list1.add(prize);
                    } else {
                        list2.add(prize);
                    }
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
