package com.itheima.twodimensionarr;

public class Test {
    public static void main(String[] args) {
        /*某商城每个季度的营业额如下：单位（万元）
第一季度：22,66,44
第二季度：77,33,88
第三季度：25,45,65
第四季度：11,66,99
I
要求计算出每个季度的总营业额和全年的总营业额*/

        int[][] yearArrArr = {
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };

        int yearSum = 0;
        for (int i = 0; i < yearArrArr.length; i++) {
            int[] quarterArr = yearArrArr[i];

            int sum = getSum(quarterArr);
            System.out.println("第" + (i + 1) + "个季度的总营业额为:" + sum);
            yearSum = yearSum + sum;

        }
        System.out.println("全年的总营业额为:" + yearSum);




    }

    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
