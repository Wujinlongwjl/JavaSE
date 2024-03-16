package com.itheima.udpdemo2;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class SendMessageDemo {
    public static void main(String[] args) throws IOException {
        //创建对象DatagramSocket的对象

        DatagramSocket ds = new DatagramSocket();

        //打包数据
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您要说的话");
            String str = sc.nextLine();
            if(str.equals("886")){
                break;
            }
            byte[] bytes = str.getBytes();
            InetAddress address = InetAddress.getByName("127.0.0.1");

            int port = 8080;
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);

            //发送数据
            ds.send(dp);
        }

        //释放资源
        ds.close();


    }
}
