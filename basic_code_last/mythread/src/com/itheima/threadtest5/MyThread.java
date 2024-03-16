package com.itheima.threadtest5;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {
    /*有一个抽奖池,该抽奖池中存放了奖励的金额,该抽奖池中的奖项为
    [10,5,20,50,100,200,500,800,2,80,300,700];
    创建两个抽奖箱(线程)设置线程名称分别为“抽奖箱1”，“抽奖箱2"
    随机从抽奖池中获取奖项元素并打印在控制台上,格式如下：
    每次抽出一个奖项就打印一个(随机)
    抽奖箱1又产生了一个10元大奖
    抽奖箱1又产生了一个100元大奖
    抽奖箱1又产生了一个200元大奖
    抽奖箱1又产生了一个800元大奖
    抽奖箱2又产生了一个700元大奖
    .....
    */


    ArrayList<Integer> list;

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        //1.循环
        //2.同步代码块
        //3.判断
        //4.判断


        while (true) {
            synchronized (MyThread.class) {
                if (list.size() == 0) {
                    break;
                } else {
                    Collections.shuffle(list);
                    int prize = list.remove(0);
                    System.out.println(getName() + "又产生了一个" + prize + "元大奖");
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
