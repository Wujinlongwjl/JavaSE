package com.itheima.mybytestream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileOutputStream fos = new FileOutputStream("myio\\a.txt");
        //写出数据
        /*fos.write(97);
        fos.write(99);*/

        byte[] bytes = {97, 98, 99, 100, 101, 102};
        //fos.write(bytes);
        fos.write(bytes,1,4);

        //释放资源
        fos.close();
    }
}
