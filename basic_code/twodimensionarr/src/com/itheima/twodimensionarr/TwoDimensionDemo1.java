//2024年1月1日14:54:36
package com.itheima.twodimensionarr;

public class TwoDimensionDemo1 {
    public static void main(String[] args) {
        //静态初始化二维数组
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};
        int[][] arr3 = {
                {1, 2, 3},
                {4, 5, 6, 7}
        };

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j]+"\t");
            }
            System.out.println();
        }
    }


}
