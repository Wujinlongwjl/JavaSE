//2024年1月9日17:11:41
package com.itheima.oopextendsdemo4;

public class Test {
    public static void main(String[] args) {
       /* 1.经理
        成员变量：工号，姓名，工资，管理奖金
        成员方法：工作（管理其他人），吃饭（吃米饭）
        2.厨师
        成员变量：工号，姓名，工资
        成员方法：工作（炒菜），吃饭（吃米饭）*/



        Manager m = new Manager("001", "张三", 8000, 500);
        System.out.println(m.getId() + ", " + m.getName() + ", " + m.getSalary() + ", " + m.getBonus());
        m.work();
        m.eat();


        System.out.println("-------------------------");

        Cook c = new Cook();
        c.setId("002");
        c.setName("李四");
        c.setSalary(5000);
        System.out.println(c.getId() + ", " + c.getName() + ", " + c.getSalary());

        c.work();
        c.eat();
    }
}
