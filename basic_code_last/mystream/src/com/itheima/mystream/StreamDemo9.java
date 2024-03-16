package com.itheima.mystream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StreamDemo9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","赵敏","谢逊","周芷若","张三丰","张飞","张翠山","李二牛","张三丰");

        list.stream().forEach(s -> System.out.println(s));

        long count = list.stream().count();
        System.out.println(count);

        Object[] objects = list.stream().toArray();
        String str = Arrays.toString(objects);
        System.out.println(str);

    }
}
