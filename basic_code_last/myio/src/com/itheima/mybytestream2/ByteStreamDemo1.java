package com.itheima.mybytestream2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //字节输入流 FileInputStream


        //创建对象
        FileInputStream fip = new FileInputStream("myio\\a.txt");

        //读取数据
        int b1 = fip.read();
        System.out.println((char)b1);

        int b2 = fip.read();
        System.out.println((char)b2);

        int b3 = fip.read();
        System.out.println((char)b3);

        //释放资源
        fip.close();

    }
}
