package com.itheima.myfile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo3 {
    public static void main(String[] args) {
        File f1 = new File("D:\\javaSE\\a.txt");
        long length = f1.length();
        System.out.println(length);

        System.out.println("--------------------------");

        File f2 = new File("myfile\\a.txt");
        File path1 = f2.getAbsoluteFile();
        System.out.println(path1);

        System.out.println("-------------------------------");

        File f3 = new File("myfile\\a.txt");
        String path2 = f3.getPath();
        System.out.println(path2);

        System.out.println("------------------------");

        File f4 = new File("myfile\\a.txt");
        String name1 = f4.getName();
        System.out.println(name1);

        File f5 = new File("D:\\javaSE\\fff");
        String name2 = f5.getName();
        System.out.println(name2);

        System.out.println("------------------------------");

        File f6 = new File("D:\\javaSE\\aaa");
        long time = f6.lastModified();
        System.out.println(time);


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date d = new Date(time);
        System.out.println(sdf.format(d));
    }
}
