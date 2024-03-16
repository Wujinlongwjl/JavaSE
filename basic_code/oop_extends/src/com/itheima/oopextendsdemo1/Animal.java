//2024年1月9日13:41:53
package com.itheima.oopextendsdemo1;


//四种动物分别有以下的行为：
//布偶猫：吃饭、喝水、抓老鼠
//中国狸花猫：吃饭、喝水、抓老鼠
//哈士奇：吃饭、喝水、看家、拆家
//泰迪：吃饭、喝水、看家、蹭一蹭

public class Animal {
    //子类只能访问父类公有的,私有的就无法访问了
    public void eat(){
        System.out.println("吃饭");

    }

    public void drink(){
        System.out.println("喝水");
    }
}
