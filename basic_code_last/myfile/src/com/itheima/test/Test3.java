//2024年1月22日10:37:47
package com.itheima.test;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        //需求: 找到电脑所有盘符以.avi结尾的文件


        //findAVI();  需要电脑配置高,否定电脑容易出现问题

    }

    public static void findAVI(){
        File[] files = File.listRoots();
        for (File file : files) {
            findAVI(file);
        }
    }

    public static void findAVI(File src){
        File[] files = src.listFiles();
        if (files != null) {
            for (File file : files) {
                if(file.isFile()){
                    String name = file.getName();
                    if(name.endsWith(".avi")){
                        System.out.println(file);
                    }
                }else {
                    findAVI(file);
                }

            }
        }
    }
}
