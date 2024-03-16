package com.itheima.mybufferedstream1;

import java.io.*;

public class BufferedStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //创建缓冲流的对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myio\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myio\\copy2.txt"));

        //循环读取并写到目的地
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }
        //释放资源
        bos.close();
        bis.close();
    }
}
