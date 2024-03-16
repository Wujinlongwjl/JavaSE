package com.itheima.test3;

public class GoodsTest {
    public static void main(String[] args) {
        //创建一个数组
        Goods[] arr = new Goods[3];

        //创建三个商品对象   ctrl + p 可以看到定义属性
        Goods g1 = new Goods("001", "华为手机", 4999.9, 899);
        Goods g2 = new Goods("002", "保温杯", 239.9, 80);
        Goods g3 = new Goods("003", "枸杞", 34.8, 90);

        //把商品添加到数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;


        //遍历
        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId() + "," + goods.getName() + "," + goods.getPrice() + "," + goods.getCount());

        }
    }
}
