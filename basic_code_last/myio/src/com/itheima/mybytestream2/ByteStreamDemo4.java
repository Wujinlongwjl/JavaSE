package com.itheima.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("myio\\a.txt");
        byte[] bytes = new byte[2];
        int len1 = fis.read(bytes);
        System.out.println(len1);
        String str1 = new String(bytes, 0, len1);
        System.out.println(str1);

        int len2 = fis.read(bytes);
        System.out.println(len2);
        String str2 = new String(bytes, 0, len2);
        System.out.println(str2);

        int len3 = fis.read(bytes);
        System.out.println(len3);
        String str3 = new String(bytes, 0, len3);
        System.out.println(str3);

        fis.close();

    }
}
