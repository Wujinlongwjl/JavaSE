package com.itheima.oopextendsdemo1;

public class Test {
    public static void main(String[] args) {
        Ragdoll rg = new Ragdoll();
        rg.eat();
        rg.drink();
        rg.catchMouse();

        System.out.println("--------------------------------");

        LiHua lh = new LiHua();
        lh.eat();
        lh.drink();
        lh.catchMouse();

        System.out.println("--------------------------------");

        Husky hs = new Husky();
        hs.eat();
        hs.drink();
        hs.lookHome();
        hs.breakHome();

        System.out.println("--------------------------------");

        Teddy td = new Teddy();
        td.eat();
        td.drink();
        td.lookHome();
        td.touch();
    }
}
