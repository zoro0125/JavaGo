package com.cyl.chapter21.socket_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author cyl
 * @version 1.0
 */

public class Client02 {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket(InetAddress.getLocalHost(), 10000);
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("Hello Server");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String str = bufferedReader.readLine();
        System.out.println(str);

        bufferedReader.close();
        bufferedWriter.close();
        socket.close();

    }
}
