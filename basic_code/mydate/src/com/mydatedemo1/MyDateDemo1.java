package com.mydatedemo1;

import java.util.Date;
import java.util.Random;

public class MyDateDemo1 {
    public static void main(String[] args) {
        /*需求1：打印时间原点开始一年之后的时间
        需求2：定义任意两个Date对象，比较一下哪个时间在前，哪个时间在后*/

        Date d1 = new Date(0L);
        long time = d1.getTime();
        time = time + 1000L * 60 * 60 * 24 * 365;
        d1.setTime(time);
        System.out.println(d1);


        Random r = new Random();
        Date d2 = new Date(Math.abs(r.nextInt()));
        Date d3 = new Date(Math.abs(r.nextInt()));
        long time2 = d2.getTime();
        long time3 = d3.getTime();
        if(time3 > time2){
            System.out.println("第一个时间在前,第二个时间在后");
        }else {
            System.out.println("第一个时间在后,第二个时间在前");

        }
    }
}
