package com.itheima.test;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(list.size() - 1 == i){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i) + ", ");
            }

        }
        System.out.println("]");
    }
}
