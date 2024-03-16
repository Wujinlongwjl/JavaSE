//2023年12月29日18:22:59
package com.itheima.test;

public class Test13 {
    public static void main(String[] args) {
        /*需求：世界最高山峰是珠穆朗玛峰(8844,43米=8844430毫米)，假如我有一张足够大的纸，它的厚度是0.1毫米。
请问，我折叠多少次，可以折成珠穆朗玛峰的高度？*/

        //定义珠穆朗玛峰的高度
        double height = 8844430;
        //定义纸张的厚度
        double paper = 0.1;
        //定义计数器初始值为0
        int count = 0;
        //纸张厚度小于珠穆朗玛峰的高度,就让纸张折叠一次
        while (paper < height){
            paper *= 2;
            count++;
        }
        //打印输出折叠的次数
        System.out.println(count);
    }
}
