package com.itheima.test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("点赞了吗");
        list.add("收藏吗");
        list.add("投币了吗");
        list.add("转发了吗");
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
