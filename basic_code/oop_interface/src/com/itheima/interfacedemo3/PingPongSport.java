package com.itheima.interfacedemo3;

public class PingPongSport extends Sports implements SpeakEnglish{
    public PingPongSport() {
    }

    public PingPongSport(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员在说英语");
    }

    @Override
    public void study() {
        System.out.println("学打乒乓球");

    }
}
