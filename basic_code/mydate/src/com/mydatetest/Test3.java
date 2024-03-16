package com.mydatetest;

public class Test3 {
    public static void main(String[] args) {
        /*
        定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制。
*/

        System.out.println(toBinaryString(100));
        //系统提供的
        System.out.println(Integer.toBinaryString(100));

    }
    public static String toBinaryString(int number){
        StringBuilder sb = new StringBuilder();

        while (true) {
            if(number == 0){
                break;
            }
            int remainder = number % 2;
            //倒着拼接  sb.insert(0,remainder);
            sb.append(remainder);
            number =number / 2;
        }
        return sb.reverse().toString();
    }
}
