//2024年1月5日14:41:35
package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        /*给定两个字符串，A和B.
                A的旋转操作就是将A最左边的字符移动到最右边。
        例如，若A='abcde',在移动一次之后结果就是bcdea'
        如果在若干次调整操作之后，A能变成B,那么返回True.
                如果不能匹配成功，则返回false*/

        String strA = "abcde";
        String strB = "bcdea";
        boolean flag = check(strA, strB);
        System.out.println(flag);

    }

    public static boolean check(String strA, String strB) {
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if (strA.equals(strB)) {
                return true;
            }
        }
        return false;

    }

    public static String rotate(String str) {
        char start = str.charAt(0);
        String end = str.substring(1);
        return (end + start);
    }
}
