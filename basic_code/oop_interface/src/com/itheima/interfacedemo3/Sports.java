package com.itheima.interfacedemo3;

public abstract class Sports extends Person{
    public Sports() {
    }

    public Sports(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}
