package com.cyl.chapter21.filecopy;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author cyl
 * @version 1.0
 */

public class Client {
    public static void main(String[] args) throws Exception {

        String filePath = "/home/yl/IdeaProjects/JavaGo/data/bqb.jpg";

        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);


        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));

        byte[] bytes = streamToByteArray(bufferedInputStream);


        OutputStream outputStream = socket.getOutputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        bufferedOutputStream.write(bytes);
        socket.shutdownOutput();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String str = bufferedReader.readLine();
        System.out.println(str);

        bufferedReader.close();
        bufferedOutputStream.close();
        bufferedInputStream.close();
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

