package com.itheima.mycommonsio;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CommonsIODemo1 {
    public static void main(String[] args) throws IOException {
        File src = new File("myio\\a.txt");
        File dest = new File("myio\\copy3.txt");
        FileUtils.copyFile(src,dest);


        File src2 = new File("D:\\javaSE\\aaa");
        File dest2 = new File("D:\\javaSE\\bbb");
        FileUtils.copyDirectory(src2, dest2);
    }
}
