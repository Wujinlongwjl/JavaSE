//2023年12月30日18:33:01
package com.itheima.methoddemo;

public class MethodDemo6 {
    public static void main(String[] args) {
        //定义方法,比较两个长方形的面积
        double area1 = getArea(4.5, 3.4);
        double area2 = getArea(3.5, 2.8);
        if(area1 > area2){
            System.out.println("第一个面积大");
        }else {
            System.out.println("第二个面积大");
        }
    }
    public static double getArea(double len, double width){
        double result = len * width;
        return result;
    }
}
