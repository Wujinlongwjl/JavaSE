package com.itheima.mybufferedstream1;

import java.io.*;

public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //创建缓冲流的对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myio\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myio\\copy.txt"));

        //循环读取并写到目的地
        int b;
        while ((b = bis.read()) != -1){
            bos.write(b);
        }
        //释放资源
        bos.close();
        bis.close();
    }
}
