package com.itheima.tcpdemo1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        //创建Socket对象
        Socket socket = new Socket("127.0.0.1",1000);

        //可以从连接通道中获取输出流
        OutputStream os = socket.getOutputStream();
        //写出数据
        os.write("你好你好".getBytes());

        //释放资源
        os.close();
        socket.close();

    }
}
