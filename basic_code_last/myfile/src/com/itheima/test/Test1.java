package com.itheima.test;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("myfile\\aaa");
        f1.mkdir();
        
        File src = new File(f1,"a.txt");
        boolean b = src.createNewFile();
        if(b){
            System.out.println("创建成功");
        }else {
            System.out.println("创建失败");
        }


    }
}
