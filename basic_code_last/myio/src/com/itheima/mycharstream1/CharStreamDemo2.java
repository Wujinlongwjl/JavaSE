package com.itheima.mycharstream1;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileReader fr = new FileReader("myio\\a.txt");
        //读取数据
        char[] chars = new char[2];
        int len;
        while ((len = fr.read(chars)) != -1){
            System.out.print(new String(chars,0,len));
        }

        //释放资源
        fr.close();

    }
}
