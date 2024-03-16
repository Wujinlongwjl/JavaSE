package com.itheima.mycollectiondemo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        /*public boolean add(E e)						添加
        public void clear（）							清空
        public boolean remove(E e)					删除
        public boolean contains(Object obj)			判断是否包含
        public boolean isEmpty（）					判断是否为空
        public int size（）							集合长度*/

        Collection<String> coll = new ArrayList<>();

        //添加
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");

        System.out.println(coll);

        //清空
        //coll.clear();
        //System.out.println(coll);


        //删除
        coll.remove("aaa");
        System.out.println(coll);


        //判断是否相同
        boolean result1 = coll.contains("bbb");
        System.out.println(result1);

        //判空
        boolean result2 = coll.isEmpty();
        System.out.println(result2);

        //长度
        int size = coll.size();
        System.out.println(size);
    }
}
