//2023年12月31日15:33:18
package com.itheima.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /*需求：
        在唱歌比赛中，有6名评委给选手打分，分数范围是[0-100]之间的整数。选手的最后得分为：去掉最
        高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。*/


        //定义一个数组,用来存储6名评委的打分(0~100)
        int[] arrScores = getScores();
        for (int i = 0; i < arrScores.length; i++) {
            System.out.print(arrScores[i] + "\t");
        }

        //求出数组中的最大值
        int max = getMax(arrScores);

        //求出数组中的最小值
        int min = getMin(arrScores);

        //求出数组中6个元素的总和
        int sum = getSum(arrScores);

        //(总和 - 最大值 - 最小值) / 4
        int average = (sum - max - min) / (arrScores.length - 2);

        System.out.println("选手的最终得分为:" + average);


    }

    public static int getMax(int[] arrScores) {
        int max = arrScores[0];
        for (int i = 1; i < arrScores.length; i++) {

            if (arrScores[i] > max) {
                max = arrScores[i];
            }


        }
        return max;

    }

    public static int getMin(int[] arrScores) {
        int min = arrScores[0];
        for (int i = 1; i < arrScores.length; i++) {

            if (arrScores[i] < min) {
                min = arrScores[i];
            }


        }
        return min;

    }

    public static int getSum(int[] arrScores) {
        int sum = 0;
        for (int i = 0; i < arrScores.length; i++) {

            sum = arrScores[i] + sum;
        }
        return sum;
    }

    public static int[] getScores() {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < scores.length; ) {
            System.out.println("请输评委打的分数:");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            } else {
                System.out.println("当前输入的分数不合法,继续录入,当前的i为:" + i);
            }
        }
        return scores;


    }
}
