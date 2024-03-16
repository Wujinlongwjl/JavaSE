package com.itheima.interfacedemo1;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("小绿", 1);
        System.out.println(f.getName() + ", " + f.getAge());
        f.eat();
        f.swim();

        System.out.println("------------------------------");

        Dog g = new Dog("旺财", 2);
        System.out.println(g.getName() + ", " + g.getAge());
        g.eat();
        g.swim();

        System.out.println("------------------------------");

        Rabbit r = new Rabbit("小雪", 3);
        System.out.println(r.getName() + ", " + r.getAge());
        r.eat();




    }
}
