//2024年1月10日11:36:40
package com.itheima.abstractdemo1;

public class Test {
    public static void main(String[] args) {

        /*青蛙frog
        属性：名字，年龄
        行为：吃虫子，喝水
                狗Dog
        属性：名字，年龄
        行为：吃骨头，喝水
                山羊Sheep
        属性：名字，年龄
        行为：吃艹，喝水*/

        Frog f = new Frog("小绿", 2);
        System.out.println(f.getName() + ", " + f.getAge());
        f.eat();
        f.drink();


    }
}
