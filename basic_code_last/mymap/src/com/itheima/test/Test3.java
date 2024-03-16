//2024年1月16日19:47:04
package com.itheima.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        /*班级里有N个学生
        要求：
        被点到的学生不会再被点到。
        但是如果班级中所有的学生都点完了，需要重新开启第二轮点名。*/

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "范闲", "范建", "范统", "杜子腾", "小诗诗", "方圆", "小孩姐", "小孩哥", "女胖子", "丁一");
        ArrayList<String> list2 = new ArrayList<>();

        int count = list1.size();
        for (int i = 1; i <= 10; i++) {
            System.out.println("---------第" + i + "轮开始了-----------------------");
            Random r = new Random();
            for (int j = 0; j < count; j++) {
                int index = r.nextInt(list1.size());
                String name = list1.remove(index);
                list2.add(name);
                System.out.println(name);
            }

            list1.addAll(list2);
            list2.clear();

        }


    }
}
