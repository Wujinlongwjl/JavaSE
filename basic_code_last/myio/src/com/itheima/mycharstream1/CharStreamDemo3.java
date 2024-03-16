package com.itheima.mycharstream1;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileWriter fw = new FileWriter("myio\\a.txt",true);
        //写出数据
        //fw.write("你好威呀???");
        char[] chars = {'a', 'b', 'c', '我'};
        fw.write(chars);



        //释放资源
        fw.close();
    }
}
