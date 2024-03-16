package com.itheima.myfunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FunctionTest1 {
    public static void main(String[] args) {
        //练习1：集合中存储一些字符串的数据，比如：张三，23.
        //收集到Student类型的数组当中（使用方法引用完成）


        //创建集合并添加元素
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"蔡坤坤,24","叶胸咸,23","刘不甜,22","吴签,24","谷嘉,30","肖梁梁,27");

        Student[] arr = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
