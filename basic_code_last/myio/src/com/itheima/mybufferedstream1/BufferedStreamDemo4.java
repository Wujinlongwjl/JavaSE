package com.itheima.mybufferedstream1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamDemo4 {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输出流的对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("myio\\b.txt",true));

        //写出数据
        bw.write("123");
        bw.newLine();
        bw.write("456");
        bw.newLine();

        //释放资源
        bw.close();


    }
}
