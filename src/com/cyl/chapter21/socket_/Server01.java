package com.cyl.chapter21.socket_;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author cyl
 * @version 1.0
 */

public class Server01 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("等待客户端发起请求...");

        Socket socket = serverSocket.accept();
        System.out.println("服务端：" + socket.getClass());

        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));
        }

        System.out.println("接收到shujv");
        OutputStream outputStream = socket.getOutputStream();

        outputStream.write("hello client".getBytes());
        socket.shutdownOutput();

        inputStream.close();
        outputStream.close();
        socket.close();
        serverSocket.close();
    }
}
