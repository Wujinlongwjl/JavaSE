package com.itheima.immutable;

import java.util.Map;
import java.util.Set;

public class ImmutableDemo3 {
    public static void main(String[] args) {
        //Map不可变集合
        //key不可重复

        Map<String, String> map = Map.of("张三", "广州", "李四", "杭州", "王五", "南京", "赵六", "成都", "钱七", "哈尔滨", "周八", "深圳", "吴九", "合肥",
                "丁一", "武汉", "孙二", "长沙", "郑十", "北京");


        Set<String> keys = map.keySet();
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key + " = " + value);

        }

        System.out.println("-------------------------");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);

        }
    }
}
