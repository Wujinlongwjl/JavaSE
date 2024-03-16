package com.itheima.interfacedemo3;

public class BasketballSport extends Sports {
    public BasketballSport() {
    }

    public BasketballSport(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学打篮球");
    }
}
