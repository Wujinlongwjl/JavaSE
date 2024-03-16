package com.itheima.test2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
            //客户端：发送一条数据，接收服务端反馈的消息并打印
            //服务器：接收数据并打印，再给客户端反馈消息

        //创建对象并绑定1000端口
        ServerSocket ss = new ServerSocket(1000);

        //等待客户端连接
        Socket socket = ss.accept();

        //socket中获取数据流读取数据
        InputStream is = socket.getInputStream();

        InputStreamReader isr = new InputStreamReader(is);

        int b;
        while ((b = isr.read()) != -1){
            System.out.print((char) b);
        }

        //回写数据
        String str = "到底有多开心?";
        OutputStream os = socket.getOutputStream();
        os.write(str.getBytes());


        //释放资源
        socket.close();
        ss.close();

    }
}
