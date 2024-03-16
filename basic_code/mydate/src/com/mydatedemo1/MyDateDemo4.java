//2024年1月13日19:10:34
package com.mydatedemo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateDemo4 {
    public static void main(String[] args) throws ParseException {
        /*需求:
        秒杀活动：2023年11月11日 0:0:0
        开始时间：2023年11月11日 0:10:0

        小贾下单并付款的时间为：2023年11月11日0:01:00
        小皮下单并付款的时间为：2023年11月11日0:11:0
        用代码说明这两位同学有没有参加上秒杀活动？*/



        //定义三个字符串表示三个时间
        String startStr = "2023年11月11日 0:0:0";
        String endStr = "2023年11月11日 0:10:0";
        String orderStr = "2023年11月11日 0:01:0";

        //解析上面三个时间,得到Date对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate = sdf.parse(startStr);
        Date endDate = sdf.parse(endStr);
        Date orderDate = sdf.parse(orderStr);

        //得到三个时间的毫秒值
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long orderTime = orderDate.getTime();

        //判断
        if(orderTime >= startTime && orderTime <= orderTime){
            System.out.println("参加秒杀活动成功");
        }else {
            System.out.println("参加秒杀活动失败");
        }
    }
}
