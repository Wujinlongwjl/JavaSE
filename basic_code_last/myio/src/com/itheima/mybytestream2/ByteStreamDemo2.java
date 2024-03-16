package com.itheima.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {

        //创建对象
        FileInputStream fis = new FileInputStream("myio\\a.txt");

        //读取数据
        int b;
        while ((b = fis.read()) != -1){
            System.out.println((char)b);
        }

        //释放资源
        fis.close();
    }
}
