package com.itheima.interfacedemo3;

public class PingPongCoach extends Coaches implements SpeakEnglish{
    public PingPongCoach() {
    }

    public PingPongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教打乒乒球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练在说英语");

    }
}
