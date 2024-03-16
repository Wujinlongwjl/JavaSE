package com.itheima.mytest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test4 {
    public static void main(String[] args) throws IOException {
         /*文本文件中有以下的数据：
        2-1-9-4-7-8
        将文件中的数据进行排序，变成以下的数据：
        1-2-4-7-8-9*/


        //读取数据
        FileReader fr = new FileReader("myio\\a.txt");
        StringBuilder sb = new StringBuilder();
        int ch;
        while (((ch = fr.read())) != -1){
            sb.append((char)ch);
        }
        fr.close();
        System.out.println(sb);


        //排序
        Integer[] arr = Arrays.stream(sb.toString().split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);



        //写出

        FileWriter fw = new FileWriter("myio\\a.txt");
        String s = Arrays.toString(arr).replace(",", "-");
        String result = s.substring(1, s.length() - 1);
        fw.write(result);

        fw.close();

    }
}
