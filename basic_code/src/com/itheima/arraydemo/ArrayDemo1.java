package com.itheima.arraydemo;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //数组的格式:    数据类型[] 数组名 = new 数据类型[]{元素1,元素2,....};
        //简化格式:     数据类型[] 数组名 = {元素1,元素2,....};

        //需求1:定义数组存储5个学生的年龄
        int[] arr1 = new int[]{13, 13, 21, 22, 16};
        int[] arr2 = {13, 13, 21, 22, 16};

        //需求2:定义数组存储3个学生的姓名
        String[] arr3 = new String[]{"zhangsan", "lisi", "wangwu"};
        String[] arr4 = {"zhangsan", "lisi", "wangwu"};

        //需求3:定义数组存储4个学生的身高
        double[] arr5 = new double[]{1.78, 1.88, 1.92, 1.75};
        double[] arr6 = {1.78, 1.88, 1.92, 1.75};


        System.out.println(arr5);//获取的是arr5的地址值
        System.out.println(arr5[1]);//获取的是索引为1的元素值
    }
}
