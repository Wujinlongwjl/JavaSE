package com.itheima.myfile;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        File f1 = new File("D:\\javaSE\\a.txt");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());

        System.out.println("----------------------------------");

        File f2 = new File("D:\\javaSE\\aaa");
        System.out.println(f2.isFile());
        System.out.println(f2.exists());

    }
}
