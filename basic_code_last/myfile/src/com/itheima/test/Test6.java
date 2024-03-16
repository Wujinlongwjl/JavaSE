package com.itheima.test;

import java.io.File;
import java.lang.reflect.Field;
import java.security.Signature;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test6 {
    public static void main(String[] args) {
        File file = new File("D:\\新建文件夹");
        HashMap<String,Integer> hm = getCount(file);
        System.out.println(hm);

    }
    public static HashMap<String, Integer> getCount(File src){
        HashMap<String, Integer> hm = new HashMap<>();
        File[] files = src.listFiles();
        for (File file : files) {
            if(file.isFile()){
                String name = file.getName();
                String[] arr = name.split("\\.");
                if(arr.length >= 2){
                    String endName = arr[arr.length - 1];
                    if (hm.containsKey(endName)) {
                        int count = hm.get(endName);
                        count++;
                    }else {
                        hm.put(endName, 1);
                    }
                }
            }else {
                HashMap<String, Integer> sonMap = getCount(file);
                Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    Integer value = entry.getValue();
                    if(hm.containsKey(key)){
                        int count = hm.get(key);
                        count = count + value;
                        hm.put(key, count);
                    }else {
                        hm.put(key,value);
                    }
                }

            }
        }
        return hm;
    }
}
