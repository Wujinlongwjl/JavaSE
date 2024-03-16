package com.itheima.oopextendsdemo3;

public class DogTest {
    public static void main(String[] args) {
        Husky hs = new Husky();
        hs.eat();
        hs.drink();
        hs.lookHome();
        hs.breakHome();

        System.out.println("-------------------------");

        SharPei sp = new SharPei();
        sp.eat();
        sp.drink();
        sp.lookHome();

        System.out.println("-------------------------");

        ChineseDog cg = new ChineseDog();
        cg.eat();
        cg.drink();
        cg.lookHome();

    }




}
