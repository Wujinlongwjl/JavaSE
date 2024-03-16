package com.itheima.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        /*班级里有N个学生
        要求：
        70%的概率随机到男生
        30%的概率随机到女生*/

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1);
        Collections.addAll(list,0,0,0);
        System.out.println(list);
        //打乱
        Collections.shuffle(list);
        System.out.println(list);
        Random r = new Random();
        int index = r.nextInt(list.size());
        int number = list.get(index);
        System.out.println(number);

        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();
        Collections.addAll(boyList,"范闲","范建","范统","杜子腾","方圆","小孩哥","丁一");
        Collections.addAll(girlList, "小诗诗","小孩姐","女胖子");

        if(number == 1){
            int boyIndex = r.nextInt(boyList.size());
            String boy = boyList.get(boyIndex);
            System.out.println(boy);
        }else{
            int girlIndex = r.nextInt(girlList.size());
            String girl = girlList.get(girlIndex);
            System.out.println(girl);
        }


    }
}
