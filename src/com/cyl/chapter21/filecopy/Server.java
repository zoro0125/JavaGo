package com.cyl.chapter21.filecopy;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author cyl
 * @version 1.0
 */

public class Server {
    public static void main(String[] args) throws Exception {
        String file = "/home/yl/IdeaProjects/JavaGo/data/bqb6.jpg";

        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("等待客户端连接");
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        byte[] bytes = streamToByteArray(bufferedInputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        bufferedOutputStream.write(bytes);


        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("shoudao");
        bufferedWriter.newLine();
        bufferedWriter.flush();


        bufferedWriter.close();
        bufferedInputStream.close();
        bufferedOutputStream.close();
        serverSocket.close();
        socket.close();



    }
    public static byte[] streamToByteArray(InputStream is) throws Exception{
        ByteArrayOutputStream bos = new ByteArrayOutputStream();//创建输出流对象
        byte[] b = new byte[1024];
        int len;
        while((len=is.read(b))!=-1){
            bos.write(b, 0, len);
        }
        byte[] array = bos.toByteArray();
        bos.close();
        return array;
    }
}
