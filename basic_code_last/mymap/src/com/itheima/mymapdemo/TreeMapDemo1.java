package com.itheima.mymapdemo;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        /*需求1:
        键：整数表示id
        值：字符串表示商品名称
        要求：按照id的升序排列、按照id的降序排列

        需求2:
        键：学生对象
        值：籍贯
        要求：按照学生年龄的升序排列，年龄一样按照姓名的字母排列，同姓名年龄视为同一个人。*/

        TreeMap<Integer,String> tm = new TreeMap<>((o1,o2) ->  o2 - o1);//o1 - o2升序
        tm.put(1,"语文");
        tm.put(5,"408");
        tm.put(4,"政治");
        tm.put(2,"数学");
        tm.put(3,"英语");

        System.out.println(tm);


    }
}
