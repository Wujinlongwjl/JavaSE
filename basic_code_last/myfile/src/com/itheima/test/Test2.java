package com.itheima.test;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        //需求: 定义一个方法找某一个文件夹中,是否有以avi结尾的电影
        File file = new File("D:\\javaSE");
        boolean b = haveAvi(file);
        System.out.println(b);

    }

    public static boolean haveAvi(File file){
        //进入访问路径文件夹,获取里面所有的内容
        File[] files = file.listFiles();
        //遍历数组获取里面的每一个元素
        for (File f : files) {
            if(f.isFile() && f.getName().endsWith(".avi")){
                return true;
            }
        }

        return false;
    }
}
