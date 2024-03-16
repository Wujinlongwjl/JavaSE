package com.itheima.myprintstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //创建字符打印流的对象       需要自己刷新
        PrintWriter pw = new PrintWriter(new FileWriter("myio\\a.txt"),true);
        //写出数据
        pw.println("手握日月摘星辰,世间无我这般人");
        pw.print("你好你好");
        pw.println();
        pw.printf("%s爱上了%s", "阿珍", "阿强");
        //释放资源
        pw.close();


    }
}
