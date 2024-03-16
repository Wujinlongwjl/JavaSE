package com.itheima.mymapdemo;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class TreeMapDemo3 {
    public static void main(String[] args) {
        /*需求：
字符串“aababcabcdabcde”
请统计字符串中每一个字符出现的次数，并按照以下格式输出
输出结果：
a(5)b(4)c(3)d(2)e(1)
新的统计思想：利用map集合进行统计
如果题目中没有要求对结果进行排序，默认使用HashMap
如果题目中要求对结果进行排序，请使用TreeMap
键：表示要统计的内容
值：表示次数
*/

        //创建字符串
        String str = "aababcabcdabcde";
        //创建集合
        TreeMap<Character,Integer> tm = new TreeMap<>();



        //把字符串中的每个字符单独拿出来
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(tm.containsKey(c)){
                int count = tm.get(c);
                count++;
                tm.put(c,count);

            }else {
                tm.put(c,1);
            }

        }
        //拼接集合
        StringBuilder sb = new StringBuilder();
        tm.forEach((key, value) -> sb.append(key).append("(").append(value).append(")"));

        System.out.println(sb);

    }
}
