package com.itheima.myfile;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {


        //creatNewFile  创建一个新的空的文件
        //细节一: 如果当前路径表示的文件是不存在的,则创建成功,方法返回true
        //        如果当前路径表示的文件是存在的,则创建失败,方法返回false
        //细节二: 如果父级路径是不存在的,那么方法会有异常IOException
        //细节三: creatNewFile方法创建的一定是文件,如果路径中不包括后缀名,则创建一个没有后缀的文件
        File f1 = new File("D:\\javaSE\\e.txt");
        boolean b1 = f1.createNewFile();
        System.out.println(b1);

        System.out.println("----------------------------");


        File f2 = new File("D:\\javaSE\\qqq");
        boolean b2 = f2.createNewFile();
        System.out.println(b2);

        System.out.println("--------------------------");

        //mkdir    make Directory. 文件夹(目录)
        //细节一: windows当中路径是唯一的,如果当前路径已经存在,则创建失败,返回false
        //细节二: mkdir方法只能创建单级文件夹,无法创建多级文件夹


        File f3 = new File("D:\\javaSE\\kkk");

        boolean b3 = f3.mkdir();
        System.out.println(b3);

        File f4 = new File("D:\\javaSE\\bbb\\eee");

        boolean b4 = f4.mkdir();
        System.out.println(b4);


        //mkdirs   创建多级文件夹
        //细节:  既可以创建单级的,也可以创建多级的文件夹
        File f5 = new File("D:\\javaSE\\bbb\\eee");
        boolean b5 = f5.mkdirs();
        System.out.println(b5);


        System.out.println("---------------------------------");



        //delete  如果删除文件,则直接删除,且不走回收站
        //         如果删除的是空的文件夹,则直接删除,不走回收站
        //          如果删除的是有内容的文件夹,则删除失败
        File f6 = new File("D:\\javaSE\\e.txt");
        boolean b6= f6.delete();
        System.out.println(b6);


    }
}
