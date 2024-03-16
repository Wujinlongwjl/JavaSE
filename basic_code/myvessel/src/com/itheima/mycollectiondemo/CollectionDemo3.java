package com.itheima.mycollectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo3 {
    public static void main(String[] args) {
        //迭代器
        //迭代器遍历完毕指针不会复位的

        //创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");

        //获取迭代器对象
        Iterator<String> it = coll.iterator();
        //利用循环不断获取集合中的每一个元素,迭代器就好比一个箭头,默认指向集合的0索引处
        while (it.hasNext()) {
            //获取元素并移动指针
            String str = it.next();
            if(str.equals("bbb")){
                it.remove();
            }
        }
        System.out.println(coll);
    }
}
