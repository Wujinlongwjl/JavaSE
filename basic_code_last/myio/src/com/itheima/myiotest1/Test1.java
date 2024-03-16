package com.itheima.myiotest1;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //制造假数据    爬取姓名

        //定义变量记录网址
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        //爬取数据,把网址上所有的数据拼接成一个字符串
        String familyStr = webCrawler(familyNameNet);
        String boyNameStr = webCrawler(boyNameNet);
        String girlNameStr = webCrawler(girlNameNet);


        //通过正则表达式,把其中符合要求的数据获取出来
        ArrayList<String> familyNameTempList = getDate(familyStr, "(.{4})(，|。)",1);
        ArrayList<String> boyNameTempList = getDate(boyNameStr, "([\\u4E00-\\u9FA5]{2})(、|。)",1);
        ArrayList<String> girlNameTempList = getDate(girlNameStr, "(.. ){4}..",0);
        //System.out.println(girlNameTempList);

        //处理数据
        //姓氏
        ArrayList<String> familyNameList = new ArrayList<>();
        for (String str : familyNameTempList) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                familyNameList.add(c + "");
            }
        }

        //男生的名字
        ArrayList<String> boyNameList = new ArrayList<>();
        for (String str : boyNameTempList) {
            if(!boyNameList.contains(str)){
                boyNameList.add(str);
            }
        }


        //女生的名字
        ArrayList<String> girlNameList = new ArrayList<>();
        for (String str : girlNameTempList) {
            String[] arr = str.split(" ");
            for (int i = 0; i < arr.length; i++) {
                girlNameList.add(arr[i]);
            }
        }

        //生成数据
        ArrayList<String> list = getInfos(familyNameList, boyNameList, girlNameList, 70, 50);
        Collections.shuffle(list);
        System.out.println(list);

        //写出数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("myio\\names.txt"));
        for (String str : list) {
            bw.write(str);
            bw.newLine();
        }
        bw.close();


    }


    public static ArrayList<String> getInfos(ArrayList<String> familyNameList, ArrayList<String> boyNameList, ArrayList<String> girlNameList, int boyCount, int girlCount){
        //生成男生不重复的名字
        HashSet<String> boyhs = new HashSet<>();
        while (true){
            if(boyhs.size() == boyCount){
                break;
            }

            //随机
            Collections.shuffle(familyNameList);
            Collections.shuffle(boyNameList);
            boyhs.add(familyNameList.get(0) + boyNameList.get(0));

        }

        //生成女生不重复的名字
        HashSet<String> girlhs = new HashSet<>();
        while (true){
            if(girlhs.size() == girlCount){
                break;
            }

            //随机
            Collections.shuffle(familyNameList);
            Collections.shuffle(girlNameList);
            girlhs.add(familyNameList.get(0) + girlNameList.get(0));

        }
        //生成男生的信息并添加到集合当中
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (String boyName : boyhs) {
            int age = r.nextInt(10) + 18;
            list.add(boyName + "-男-" + age);

        }

        //生成男生的信息并添加到集合当中
        for (String girlName : girlhs) {
            int age = r.nextInt(8) + 18;
            list.add(girlName + "-女-" + age);

        }


        return list;

    }


    private static ArrayList<String> getDate(String str, String regex, int index) {
        //创建集合存放数据
        ArrayList<String> list = new ArrayList<>();
        //按照正则表达式的规则,去获取数据
        Pattern pattern = Pattern.compile(regex);
        //按照pattern的规则,到str当中获取数据
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            list.add(matcher.group(index));
        }


        return list;
    }

    public static String webCrawler(String net) throws IOException {
        //定义StringBuilder拼接爬取到的数据
        StringBuilder sb = new StringBuilder();
        //创建一个URL对象
        URL url = new URL(net);
        //连接上这个网址
        URLConnection conn = url.openConnection();
        //读取数据
        InputStreamReader isr = new InputStreamReader(conn.getInputStream());

        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char) ch);
        }
        //释放资源
        isr.close();
        //把读取的数据返回
        return sb.toString();


    }
}
