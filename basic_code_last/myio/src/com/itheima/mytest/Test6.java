package com.itheima.mytest;

import com.sun.source.tree.Tree;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test6 {
    public static void main(String[] args) throws IOException {
        //读取数据
        BufferedReader br = new BufferedReader(new FileReader("myio\\csb.txt"));
        String line;
        TreeMap<Integer,String> tm = new TreeMap<>();
        while ((line = br.readLine()) != null){
            String[] arr = line.split("\\.");
            tm.put(Integer.parseInt(arr[0]),line);
        }
        br.close();

        //写出数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("myio\\result2.txt"));
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            String value = entry.getValue();
            bw.write(value);
            bw.newLine();
        }
        bw.close();

    }
}
