package com.itheima.myfile;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        String str = "C:\\Users\\Desktop\\a.text";
        File f1 = new File(str);
        System.out.println(f1);


        String parent = "C:\\Users\\Desktop";
        String child = "a.text";
        File f2 = new File(parent, child);
        System.out.println(f2);

        File parent2 = new File("C:\\Users\\Desktop");
        String child2 = "a.text";
        File f4 = new File(parent2, child2);
        System.out.println(f4);
    }
}
