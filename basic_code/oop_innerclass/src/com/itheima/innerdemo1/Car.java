package com.itheima.innerdemo1;

public class Car {
    String carName;
    int carAge;
    String carColor;

    public void show(){
        Engin e = new Engin();
        System.out.println(carName);
        System.out.println(e.engineName);
    }


    class Engin{
        String engineName;
        int engineAge;

        public void show(){
            System.out.println(engineName);
            System.out.println(carName);
        }
    }

}
