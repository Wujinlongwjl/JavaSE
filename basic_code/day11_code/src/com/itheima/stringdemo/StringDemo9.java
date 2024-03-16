//2024年1月5日09:32:23
package com.itheima.stringdemo;

public class StringDemo9 {
    public static void main(String[] args) {
        String talk = "你玩得很好,下次不要再玩了,TMD,SB";

        String[] arr ={"TMD", "SB", "NMB", "NMGB", "DB"};
        for (int i = 0; i < arr.length; i++) {
             talk = talk.replace(arr[i], "***");

        }

        System.out.println(talk);

    }
}
