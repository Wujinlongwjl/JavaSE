package com.itheima.test;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        System.out.println(list);

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(list.size() - 1 == i){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i) + ", ");
            }

        }
        System.out.println("]");

    }
}
