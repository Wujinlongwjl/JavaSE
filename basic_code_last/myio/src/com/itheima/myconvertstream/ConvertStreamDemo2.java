package com.itheima.myconvertstream;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //JDK11以前的方案
        /*//创建转换流的对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myio\\b.txt"),"GBK");
        //写出数据
        osw.write("你好你好");
        //释放资源
        osw.close();*/


        FileWriter fw = new FileWriter("myio\\c.txt", Charset.forName("GBK"));
        fw.write("你好程序员");
        fw.close();
    }
}
