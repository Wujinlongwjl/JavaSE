package com.itheima.myexception;

public class ExceptionDemo1 {
    public static void main(String[] args) {
          //灵魂二问:如果try中遇到多个问题,怎么执行?
        /*会写多个catch与之对应
        * 细节:
        *       如果我们要捕获多个异常,这些异常中如果存在父子关系的话,那么父类一定要写在下面
        *
        * 了解性:
        *        在JDK7之后,我们可以在catch中同时捕获多个异常,中间用|进行隔开
        *          表示如果出现A异常或者B异常的话,采取同一种处理方案
        *
        * */



        int[] arr = {1, 2, 3, 4, 5};


        try {
            System.out.println(arr[10]);
            System.out.println(2/0);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界了");
        }catch (NullPointerException e){
            System.out.println("空指针异常");

        }catch (Exception e){
            System.out.println("Exception");
        }
        System.out.println("看看我执行了吗");
    }
}
