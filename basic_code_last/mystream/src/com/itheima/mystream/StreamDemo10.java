package com.itheima.mystream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-15", "赵敏-女-14", "谢逊-男-55", "周芷若-女-16", "张三丰-男-100",
                "张飞-男-44", "张翠山-男-36", "李二牛-男-15");

        //collect(collector.toList()) 收集流中的数据 , 放到集合中
        List<String> newList = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toList());
        System.out.println(newList);

        Set<String> newList2 = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toSet());
        System.out.println(newList2);


        //collect(collector.toMap(,)) 集合里面不能有重复的
        Map<String, Integer> newList3 = list.stream().filter(s -> "男".equals(s.split("-")[1])).
                collect(Collectors.toMap(new Function<String, String>() {
                                             @Override
                                             public String apply(String s) {
                                                 return s.split("-")[0];
                                             }
                                         },
                        new Function<String, Integer>() {
                            @Override
                            public Integer apply(String s) {
                                return Integer.parseInt(s.split("-")[2]);
                            }
                        }
                ));
        System.out.println(newList3);


        Map<String, Integer> map = list.stream().filter(s -> "男".equals(s.split("-")[1])).
                collect(Collectors.toMap(s -> s.split("-")[0], s -> Integer.parseInt(s.split("-")[2])));

        System.out.println(map);

    }
}
