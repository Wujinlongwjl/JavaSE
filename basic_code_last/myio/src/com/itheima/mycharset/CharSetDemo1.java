package com.itheima.mycharset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码
        String str = "ai你哟";
        byte[] bytes1 = str.getBytes();
        System.out.println(Arrays.toString(bytes1));


        byte[] bytes2 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));


        //解码
        String str2 = new String(bytes1);
        System.out.println(str2);

        String str3 = new String(bytes2,"GBK");
        System.out.println(str3);

    }
}
