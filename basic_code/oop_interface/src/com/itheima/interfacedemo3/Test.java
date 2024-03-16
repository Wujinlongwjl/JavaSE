//2024年1月10日14:32:21
package com.itheima.interfacedemo3;

public class Test {
    /*乒乓球运动员：姓名，年龄，学打乒乓球，说英语
    篮球运动员：
    姓名，年龄，学打篮球
    乒乓球教练：
    姓名，年龄，教打乒乓球，说英语
    篮球教练：
    姓名，年龄，教打篮球
    */
    public static void main(String[] args) {
        PingPongSport pgs = new PingPongSport("张三", 23);
        System.out.println(pgs.getName() + ", " + pgs.getAge());
        pgs.study();
        pgs.speakEnglish();
    }
}
