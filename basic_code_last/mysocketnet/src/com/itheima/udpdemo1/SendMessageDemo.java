package com.itheima.udpdemo1;

import java.io.IOException;
import java.net.*;

public class SendMessageDemo {
    public static void main(String[] args) throws IOException {
        //发送数据


        //创建 DategramSocket对象
        DatagramSocket ds = new DatagramSocket();

        String str = "你好威武呀";
        byte[] bytes = str.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);
        ds.send(dp);

        ds.close();
    }
}
