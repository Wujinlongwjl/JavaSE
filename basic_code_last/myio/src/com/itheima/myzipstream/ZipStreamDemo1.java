package com.itheima.myzipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo1 {
    public static void main(String[] args) throws IOException {
        File src = new File("D:\\javaSE\\aaa.zip");
        File dest = new File("D:\\javaSE");
        unzip(src,dest);

    }
    public static void unzip(File src, File dest) throws IOException {
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));
        ZipEntry entry;
        while ((entry = zip.getNextEntry()) != null){
            System.out.println(entry);
            if(entry.isDirectory()){
                File file = new File(dest,entry.toString());
                file.mkdirs();
            }else {
                FileOutputStream fos = new FileOutputStream(new File(dest,entry.toString()));
                int b;
                while ((b = zip.read()) != -1){
                    fos.write(b);
                }
                fos.close();
                zip.closeEntry();

            }

        }
        zip.close();

    }
}
