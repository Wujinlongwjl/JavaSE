package com.itheima.mydynamicproxy1;

public interface Star {
    //我们可以把所有想要被代理的方法定义在接口当中

    public abstract String sing(String name);

    public abstract void dance();
}
