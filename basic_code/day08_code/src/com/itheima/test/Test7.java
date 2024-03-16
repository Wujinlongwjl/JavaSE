//2023年12月31日19:23:06
package com.itheima.test;

import java.util.Random;

public class Test7 {
    public static void main(String[] args) {
        /*需求：
一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,18000五个奖金。
请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
打印效果如下：(随机顺序，不一定是下面的顺序)
888元的奖金被抽出
588元的奖金被抽出
18808元的奖金被抽出
1080元的奖金被抽出
2元的奖金被抽出
*/


        int[] arr = {2, 88, 888, 8888, 10000, 88888};
        int[] newArr = new int[arr.length];

        Random r = new Random();
        for (int i = 0; i < arr.length; ) {
            int randomIndex = r.nextInt(arr.length);
            int prize = arr[randomIndex];
            boolean flag = contains(newArr, prize);
            if (!flag) {
                newArr[i] = prize;
                i++;
            }

        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "      ");
        }


    }

    public static boolean contains(int[] arr, int prize) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize)
                return true;
        }
        return false;
    }
}
