//2024年1月14日10:34:12
package com.mydatetest;

public class Test2 {
    public static void main(String[] args) {
        /*自己实现parselnt方法的效果，将字符串形式的数据转成整数。
        要求：
        字符串中只能是数字不能有其他字符
        最少一位，最多10位
        0不能开头*/

        //定义一个字符串
        String str = "1234";
        //校验字符串,先把异常的字符串过滤,剩下来的就是正确的
        if (!str.matches("[1-9]\\d{0,9}")) {
            System.out.println("输入格式有误");
        } else {
            System.out.println("输入格式正确");
            int number = 0;
            for (int i = 0; i < str.length(); i++) {
                int c = str.charAt(i) - '0';
                //把每位数字放到number当中
                number = number * 10 + c;

            }
            System.out.println(number);
            System.out.println(number + 1);
        }
    }
}
