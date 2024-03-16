package com.itheima.mymapdemo;

import java.util.*;

public class HashMapDemo2 {
    public static void main(String[] args) {
        /*需求
        某个班级80名学生，现在需要组成秋游活动，班长提供了四个景点依次是(A、B、C、D),每个学生只
        能选择一个景点，请统计出最终哪个景点想去的人数最多。*/

        //定义一个数组用来存储A,B,C,D
        String[] arr = {"A", "B", "C", "D"};
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);

        }



        //创建HashMap集合
        HashMap<String,Integer> hm = new HashMap<>();
        for (String name : list) {
            if (hm.containsKey(name)) {
                int count = hm.get(name);
                count++;
                hm.put(name,count);
            }else {
                hm.put(name,1);
            }

        }
        System.out.println(hm);

        //求最大值
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count > max) {
                max = count;
            }
        }

        System.out.println(max);

        //判断哪个景点的人数最多,打印出来
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count == max) {
                System.out.println(entry.getKey());
            }
        }

    }
}
