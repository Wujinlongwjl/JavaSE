package com.itheima.myfile;

import java.io.File;

public class FileDemo6 {
    public static void main(String[] args) {
        File f1 = new File("D:\\javaSE");
        File[] files = f1.listFiles();
        for (File file : files) {
            if(file.isFile() && file.getName().endsWith(".txt")){
                System.out.println(file);

            }
        }
    }
}
