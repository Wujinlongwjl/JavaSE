package com.itheima.test1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //客户端：多次发送数据
        //服务器：接收多次接收数据，并打印

        //创建对象绑定1000端口
        ServerSocket ss = new ServerSocket(1000);

        //等待客户端来连接
        Socket socket = ss.accept();

        //读取数据
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());

        int b;
        while ((b = isr.read()) != -1){
            System.out.print((char)b);
        }

        //释放资源

        socket.close();
        ss.close();

    }
}
