package com.itheima.myfunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class FunctionDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三丰", "成昆", "谢逊", "张无忌", "张飞");


        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张") && s.length()==3;
            }
        }).forEach(s -> System.out.println(s));

        StringOperation so = new StringOperation();
        list.stream().filter(so::stringJudge).forEach(s -> System.out.println(s));


        list.stream().filter(new FunctionDemo3()::stringJudge).forEach(s -> System.out.println(s));
    }

    public boolean stringJudge(String s){
        return s.startsWith("张") && s.length()==3;
    }
}
