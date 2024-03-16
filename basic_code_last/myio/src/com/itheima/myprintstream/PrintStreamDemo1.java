package com.itheima.myprintstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        //创建字节打印流的对象      自动刷新
        PrintStream ps = new PrintStream(new FileOutputStream("myio\\a.txt"));
        //写出数据
        ps.println(97);
        ps.print(true);
        ps.printf("%s 爱上了 %s","阿珍","阿强");
        //释放资源
        ps.close();
    }
}
