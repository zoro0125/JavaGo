package com.cyl.chapter21.socket_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author cyl
 * @version 1.0
 */

public class Server02 {
    public static void main(String[] args) throws IOException {


        ServerSocket serverSocket = new ServerSocket(10000);
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String str = bufferedReader.readLine();
        System.out.println(str);

        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("Hello Client");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        bufferedWriter.close();
        bufferedReader.close();
        serverSocket.close();
        socket.close();



    }
}
