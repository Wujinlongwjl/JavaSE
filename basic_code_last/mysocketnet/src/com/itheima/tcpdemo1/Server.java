package com.itheima.tcpdemo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建对象ServerSocket
        ServerSocket ss = new ServerSocket(1000);

        //监听客户端的连接
        Socket socket = ss.accept();

        //从连接通道中获取输入流的读取数据
        /*InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);*/
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        int b;
        while ((b = br.read()) != -1){
            System.out.print((char)b);
        }

        //释放资源
        socket.close();
        ss.close();
    }
}
