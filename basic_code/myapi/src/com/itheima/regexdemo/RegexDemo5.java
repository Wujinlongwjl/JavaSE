package com.itheima.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo5 {
    public static void main(String[] args) {

        //贪婪爬取:在爬取数据时尽可能多的获取数据
        //非贪婪爬取:在爬取数据时尽可能少的获取数据

        //非贪婪爬取:  +?
        //非贪婪爬取:  *?

        //贪婪爬取:abbbbbbbbbbbbbbbbbbbbb
        //非贪婪爬取:ab

        String s ="abbbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaa";

        String regex = "ab+?";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
