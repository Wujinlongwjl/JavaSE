//2024年1月15日21:35:05
package com.itheima.mymapdemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        //put : 添加/覆盖

        m.put("郭靖", "黄蓉");

        m.put("韦小宝","阿珂");
        m.put("尹志平","小龙女");

        //String value = m.put("韦小宝", "双儿");

        //删除
        String v = m.remove("郭靖");
        System.out.println(v);



        //清空
        //m.clear();

        boolean result = m.containsKey("韦小宝");//键
        System.out.println(result);

        boolean resultValue = m.containsValue("小龙女");
        System.out.println(resultValue);//值

        boolean empty = m.isEmpty();
        System.out.println(empty);

        int size = m.size();
        System.out.println(size);


        System.out.println(m);
    }
}
