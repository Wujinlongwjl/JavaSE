package com.itheima.regexdemo;

public class matches {
    public static void main(String[] args) {
        //正则表达式


        /*字符类（只匹配一个字符）
                [abc]	        只能是a,b,或c
                [^abc]	        除了a,b,c之外的任何字符
                [a-ZA-Z]		a到zA到Z,包括（范围）
                [a-d[m-p]]	    a到d,或m到p
                [a-z&&[def]	    a-z和def的交集。为：d,e,f
                [a-z&&[bc]	    a-z和非bc的交集。(等同于[ad-z])
                [a-z&&[m-p]		a到z和除了m到p的交集。(等同于[a-lq-z])
*/


        /*预定义字符（只匹配一个字符)
        .	        任何字符
        \d	        一个数字：[0-9]
        \D	        非数字：[0-9]
        \s	        一个空白字符：[\tn\x0B\f\r]
        \S	        非空白字符：[^\s]
        \w	        [a-zA-Z_0-9]英文、数字、下划线
        \W	        [^\w]一个非单词字符*/



        /*数量词
        X?		X,一次或0次
        X*		X,零次或多次
        X+		X,一次或多次
        X{n}	X,正好n次
        X{n,}	X,至少n次
        X{n,m}	X,至少n但不超过m次*/



    }
}
