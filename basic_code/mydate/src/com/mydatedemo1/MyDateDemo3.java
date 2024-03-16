package com.mydatedemo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateDemo3 {
    public static void main(String[] args) throws ParseException {
        /*假设，你初恋的出生年月日为：2000-11-11
请用字符串表示这个数据，并将其转换为：2000年11月11日
创建一个Date对象表示2000年11月11日
创建一个SimpleDateFormat对象，并定义格式为年月日
把时间变成：2000年11月11日
*/

        //可以通过2000-11-11解析,解析成Date对象
        String str = "2000-11-11";
        //解析
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(str);
        //格式化
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
        String result = sdf1.format(parse);
        System.out.println(result);


    }
}
