package com.itheima.mylistdemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        /*
            List系列集合独有的方法：
            void add(int index,E element)       在此集合中的指定位置插入指定的元素
            E remove(int index)                 删除指定索引处的元素，返回被删除的元素
            E set(int index,E element)          修改指定索引处的元素，返回被修改的元素
            E get(int index)                    返回指定索引处的元素
*/

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        System.out.println(list);

        //在某个索引插入元素
        list.add(1,"qqq");
        System.out.println(list);

        //删除某个索引上的元素,或者直接删除元素
        list.remove(1);
        System.out.println(list);


        list.set(1, "eee");

        System.out.println(list);


        String s = list.get(1);
        System.out.println(s);
    }
}
