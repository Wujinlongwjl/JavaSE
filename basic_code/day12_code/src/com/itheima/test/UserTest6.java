package com.itheima.test;

import java.util.ArrayList;

public class UserTest6 {
    public static void main(String[] args) {
       /* 需求：
        1,main方法中定义一个集合，存入三个用户对象。
        用户属性为：id,username,password
        2,要求：定义一个方法，根据id查找对应的用户信息。
        如果存在，返回true
        如果不存在，返回false*/

        //创建集合
        ArrayList<User> list = new ArrayList<>();
        //创建用户对象
        User user1 = new User("001", "zhangsan" , "123");
        User user2 = new User("002", "lisi" , "1234");
        User user3 = new User("003", "wangwu" , "12345");
        //添加用户元素
        list.add(user1);
        list.add(user2);
        list.add(user3);

        boolean result = contains(list, "003");
        System.out.println(result);


    }

    public static boolean contains(ArrayList<User> list, String id){
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uid = u.getId();
            if(uid.equals(id)){
                return true;
            }

        }
        return false;

    }
}
