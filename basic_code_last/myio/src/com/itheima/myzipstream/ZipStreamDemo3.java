package com.itheima.myzipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo3 {
    public static void main(String[] args) throws IOException {
        File src = new File("D:\\javaSE\\aaa");
        File destParent = src.getParentFile();
        File dest = new File(destParent,src.getName()+".zip");
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));

        toZip(src,zos,src.getName());

        zos.close();
    }

    public static void toZip(File src, ZipOutputStream zos, String name) throws IOException {
        File[] files = src.listFiles();
        for (File file : files) {
            if(file.isFile()){
                ZipEntry entry = new ZipEntry(name+ "\\" + file.getName());
                zos.putNextEntry(entry);
                FileInputStream fis = new FileInputStream(file);
                int b;
                while ((b = fis.read()) != -1){
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();

            }else {

                toZip(file,zos,name + "\\" + file.getName());
            }

        }
    }
}
