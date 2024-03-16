//2024年1月12日21:05:07
package com.itheima.regexdemo;

public class Regex {
    //正则表达式
    public static void main(String[] args) {
        //只能是  a  b   c
        System.out.println("a".matches("[abc]"));
        System.out.println("z".matches("[abc]"));
        System.out.println("0".matches("[abc]"));
        System.out.println("aa".matches("[abc]"));
        System.out.println("aa".matches("[abc][abc]"));

        System.out.println("------------------------------");

        //不能出现 a  b   c
        System.out.println("a".matches("[^abc]"));
        System.out.println("z".matches("[^abc]"));
        System.out.println("0".matches("[^abc]"));
        System.out.println("zz".matches("[^abc]"));
        System.out.println("zz".matches("[^abc][^abc]"));

        System.out.println("---------------------------------");

        //a到z  A到Z(包括头尾的范围)
        System.out.println("a".matches("[a-zA-Z]"));
        System.out.println("z".matches("[a-zA-Z]"));
        System.out.println("zz".matches("[a-zA-Z]"));

        System.out.println("----------------------------");

        //[a-d[m-p]]  a到d, 或m到p
        System.out.println("a".matches("[a-d[m-p]]"));
        System.out.println("d".matches("[a-d[m-p]]"));
        System.out.println("m".matches("[a-d[m-p]]"));
        System.out.println("p".matches("[a-d[m-p]]"));
        System.out.println("z".matches("[a-d[m-p]]"));

        System.out.println("--------------------------");

        //[a-z&&[def]]  a-z和def的交集, 为 d  e  f
        System.out.println("a".matches("[a-z&&[def]]"));
        System.out.println("d".matches("[a-z&&[def]]"));


    }
}
