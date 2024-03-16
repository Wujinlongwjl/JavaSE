package com.itheima.polymorphismdemo2;

public class Test {
    public static void main(String[] args) {
        //创建对象
        Animal a = new Dog();
        //调用方法:编译看左边,运行看右边              调用变量:编译看左边,运行看左边
        //那么在编译的时候会先检查左边的父类中有没有这个方法，如果没有直接报错。
        a.eat();
    }
}

class Animal{
    public void eat(){
        System.out.println("动物在吃东西");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("够吃骨头");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫池小鱼干");
    }
}
