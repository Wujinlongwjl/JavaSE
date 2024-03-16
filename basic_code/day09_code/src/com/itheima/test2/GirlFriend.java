package com.itheima.test2;

public class GirlFriend {
    //属性
    private String name;
    private int age;
    private String gender;


    public void setName(String name){
        this.name = name;

    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age >= 18 && age <= 30){
            this.age = age;
        }else {
            System.out.println("非法参数");
        }

    }

    public int getAge(){
        return age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }



    //行为
    public void sleep() {
        System.out.println("在睡觉");
    }

    public void eat(){
        System.out.println("在吃饭");
    }
}
