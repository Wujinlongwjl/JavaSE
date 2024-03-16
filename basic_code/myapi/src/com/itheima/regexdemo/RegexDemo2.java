package com.itheima.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
    public static void main(String[] args) {
        /*有如下文本，请按照要求爬取数据。
        Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11,因为这
        两个是长期支持版本，下一个长期支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台
        要求：找出里面所有的JavaXX*/
        
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11," +
                "两个是长期支持版本，下一个长期支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台";



        //method1(str);
        Pattern p = Pattern.compile("Java\\d{0,2}");
        Matcher m = p.matcher(str);
        while (m.find()){
            String s = m.group();
            System.out.println(s);
        }




    }

    private static void method1(String str) {
        //Pattern:表示正则表达式
        //Matcher:文本匹配器,作用按照正则表示式的规则去读取字符串,从头开始读
        //          在大串去找符合匹配的子串

        Pattern p = Pattern.compile("Java\\d{0,2}");
        Matcher m = p.matcher(str);
        boolean b = m.find();
        String s1 = m.group();
        System.out.println(s1);
    }
}
