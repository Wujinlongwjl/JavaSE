package com.itheima.mytest;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //需求:拷贝文件夹

        File src = new File("D:\\javaSE\\aaa\\src");
        File desk = new File("D:\\javaSE\\aaa\\desk");
        copyDir(src,desk);
    }

    private static void copyDir(File src, File desk) throws IOException {
        desk.mkdir();
        File[] files = src.listFiles();
        for (File file : files) {
            if(file.isFile()){
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(desk,file.getName()));
                byte[] bytes = new byte[1024];
                int len;
                while ((len = fis.read(bytes)) != -1){
                    fos.write(bytes,0,len);
                }
                fos.close();
                fis.close();
            }else {
                copyDir(file, new File(desk,file.getName()));

            }

        }
    }


}
