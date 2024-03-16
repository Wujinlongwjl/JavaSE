package com.itheima.mystream;

import java.util.ArrayList;

public class StreamDemo1 {
    public static void main(String[] args) {

        /*创建集合添加元素，完成以下需求：
        1.把所有以“张”开头的元素存储到新集合中
        2.把“张”开头的，长度为3的元素再存储到新集合中
        3.遍历打印最终结果*/

        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("赵敏");
        list.add("张三");
        list.add("张无忌");
        list.add("小昭");

        list.stream().filter(name->name.startsWith("张")).filter(name->name.length()==3).forEach(name-> System.out.println(name));
    }
}
