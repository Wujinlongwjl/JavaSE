package com.itheima.mycollections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        //批量添加元素
        Collections.addAll(list,"abc","bcd","ef","qwr","zxcv","dddf","bbd","brd","qwwer");
        System.out.println(list);

        //打乱
        Collections.shuffle(list);
        System.out.println(list);
    }
}
