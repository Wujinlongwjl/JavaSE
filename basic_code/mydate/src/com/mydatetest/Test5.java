//2024年1月14日11:42:29
package com.mydatetest;

import java.time.LocalDate;
import java.util.Calendar;

public class Test5 {
    public static void main(String[] args) {
        /*
            判断任意的一个年份是闰年还是平年
            要求：用JDK7和JDK8两种方式判断
            提示：
            二月有29天是闰年
            一年有366天是闰年*/

        //JDK7
        Calendar c = Calendar.getInstance();
        c.set(2000,2,1);//月份的范围是在0~11
        //把日历往前减一天
        c.add(Calendar.DAY_OF_MONTH, -1);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);





        //JDK8
        LocalDate ld = LocalDate.of(2000, 3, 1);
        LocalDate ld2 = ld.minusDays(1);
        int day2 = ld2.getDayOfMonth();
        System.out.println(day2);


        //直接判断平闰年
        System.out.println(ld.isLeapYear());

    }
}
