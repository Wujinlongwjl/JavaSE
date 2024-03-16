package com.itheima.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        /*班级里有N个学生，学生属性：姓名，年龄，性别。
实现随机点名器。*/

        //创建集合
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        Collections.addAll(list,"范闲","范建","范统","杜子腾","小诗诗","方圆","小孩姐","小孩哥","女胖子","丁一");

        //随机点名
        Random r = new Random();
        int index = r.nextInt(list.size());
        String result = list.get(index);
        System.out.println(result);


        //打乱
        Collections.shuffle(list);
        System.out.println(list.get(0));


    }
}
