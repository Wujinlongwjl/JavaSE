package com.itheima.myconvertstream;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo1 {
    public static void main(String[] args) throws IOException {


        //创建对象并指定字符编码
        InputStreamReader isr = new InputStreamReader(new FileInputStream("myio\\gbkfile.txt"),"GBK");

        //读取数据
        int ch;
        while ((ch = isr.read()) != -1){
            System.out.print((char)ch);

        }
        isr.close();


        System.out.println();
        System.out.println("---------------------------------------------");

        FileReader fr = new FileReader("myio\\gbkfile.txt", Charset.forName("GBK"));
        int ch2;
        while ((ch2 = fr.read()) != -1){
            System.out.print((char)ch2);

        }

        fr.close();



    }
}
