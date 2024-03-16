package com.itheima.mybufferedstream1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //字符缓冲输入流


        //创建字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("myio\\a.txt"));

        //读取数据
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        //释放资源
        br.close();
    }
}
