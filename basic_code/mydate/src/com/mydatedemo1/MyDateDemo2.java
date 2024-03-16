package com.mydatedemo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateDemo2 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sp1 = new SimpleDateFormat();
        Date d1 = new Date();
        String format1 = sp1.format(d1);
        System.out.println(format1);



        SimpleDateFormat sp2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 EEEE");
        Date d2 = new Date();
        String format2 = sp2.format(d2);
        System.out.println(format2);


        String str = "2024-11-11 11:11:11";
        SimpleDateFormat sp3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sp3.parse(str);
        System.out.println(parse);
    }
}
