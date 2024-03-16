package com.itheima.Test6;

public class GirlFriendTest {
    public static void main(String[] args) {
        /*定义数组存储4个女朋友的对象
        女朋友的属性：姓名、年龄、性别、爱好
        要求1：计算出四女朋友的平均年龄
        要求2：统计年龄比平均值低的女朋友有几个？并把她们的所有信息打印出来。*/




        //创建数组将对象添加进去
        GirlFriend[] arr = new GirlFriend[4];
        //创建女朋友对象
        GirlFriend gf1 = new GirlFriend("小九九", 18, "萌妹子","吃饭");
        GirlFriend gf2 = new GirlFriend("小慧慧", 19, "萌妹子","睡觉");
        GirlFriend gf3 = new GirlFriend("小娇娇", 20, "萌妹子","玩游戏");
        GirlFriend gf4 = new GirlFriend("小萍萍", 21, "憨妹子","看书");

        //将对象添加到数组当中
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;


        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            //累加
            sum = sum + gf.getAge();

        }
        //算出年龄的平均值
        int avg = sum / arr.length;

        //统计年龄比平均年龄小的有几个
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            if(gf.getAge() < avg){
                System.out.println(gf.getName() + ", " + gf.getAge() + ", " + gf.getGender() + ", " + gf.getHobby());
                count++;
            }
        }
        //打印年龄比平均年龄小的
        System.out.println(count + "个");

    }

}
