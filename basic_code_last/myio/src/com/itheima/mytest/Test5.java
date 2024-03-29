package com.itheima.mytest;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test5 {
    public static void main(String[] args) throws IOException {
        //需求：把《出师表》的文章顺序进行恢复到一个新文件中。

        //读取数据
        BufferedReader br = new BufferedReader(new FileReader("myio\\csb.txt"));
        String line;
        ArrayList<String> list = new ArrayList<>();
        while ((line = br.readLine()) != null){
            list.add(line);
        }
        br.close();

        //排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i1 = Integer.parseInt(o1.split("\\.")[0]);
                int i2 = Integer.parseInt(o2.split("\\.")[0]);
                return i1 - i2;
            }
        });

        //写出
        BufferedWriter bw = new BufferedWriter(new FileWriter("myio\\result.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();

        }
        bw.close();





    }
}
