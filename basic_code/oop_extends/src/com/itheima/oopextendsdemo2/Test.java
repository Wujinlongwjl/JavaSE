package com.itheima.oopextendsdemo2;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.lunch();
    }
}


class Person{
    public void eat(){
        System.out.println("吃米饭, 吃菜");
    }

    public void drink(){
        System.out.println("喝白开水");
    }
}



class Student extends Person{
    public void lunch(){
        eat();
        drink();

        super.eat();
        super.drink();
    }

    //应用场景:当父类中方法,不能满足子类现在的需求时,我们就需要把这个方法进行重新
    //注意:子类中重写的方法上面需要加上@Override
    @Override
    public void eat(){
        System.out.println("吃面包");
    }

    @Override
    public void drink(){
        System.out.println("喝coco");
    }

}
