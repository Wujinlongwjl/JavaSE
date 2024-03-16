//2024年1月13日15:41:10
package com.itheima.regexdemo;

public class RegexDemo6 {
    public static void main(String[] args) {
        String s1= "小诗诗sdkfaldsfljfi小慧慧jfdasjhgsdfa小甜甜";
        //替换
        String vs = s1.replaceAll("[\\w&&[^_]]+", "vs");
        System.out.println(vs);

        String s2= "小诗诗sdkfaldsfljfi小慧慧jfdasjhgsdfa小甜甜";
        //分片
        String[] result = s2.split("[\\w&&[^_]]+");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

        }

    }
}
