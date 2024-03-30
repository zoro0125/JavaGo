package com.cyl.chapter21.socket_;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author cyl
 * @version 1.0
 */

public class Client01 {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);

        System.out.println("客户端：" + socket.getClass());
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("Hello Server".getBytes());
        System.out.println("数据以发送");
        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();

        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));
        }

        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
