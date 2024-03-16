package com.itheima.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileInputStream fip = new FileInputStream("D:\\javaSE\\b.txt");
        FileOutputStream fop = new FileOutputStream("myio\\copy.txt");

        //拷贝   边读边写
        int b;
        while ((b = fip.read()) != -1){
            fop.write(b);
        }

        //释放资源
        fop.close();
        fip.close();
    }
}
