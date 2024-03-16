package com.itheima.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {
    public static void main(String[] args) {

        /*需求1：爬取版本号为8,11,17的Java文本，但是只要Java,不显示版本号。
        需求2：爬取版本号为8,11,17的Jaa文本。正确爬取结果为：Java8Java11Java17Java17
        需求3：爬取除了版本号为8,11,17的Java文本，*/


        String str = "java自从95年问世以来，经历了很多版本，目前企业中用的最多的是JAva8和JavA11,因为这" +
                "两个是长期支持版本，下一个长期支持版本是JaVa17,相信在未来不久Java17也会逐渐登上历史舞台";

        //?理解为前面的数据Java
        //=表示在Java后面要跟随的数据
        //但是在获取的时候,只获取前半部分
        //?i:表示忽略大小写

        //需求1:
        String regex1 = "((?i)Java)(?=8|11|17)";
        //需求2:
        String regex2 = "((?i)Java)(?:8|11|17)";
        //需求3:
        String regex3 = "((?i)Java)(?!8|11|17)";

        Pattern p = Pattern.compile(regex2);
        Matcher m = p.matcher(str);
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
