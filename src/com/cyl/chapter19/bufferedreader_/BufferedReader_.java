package com.cyl.chapter19.bufferedreader_;

import java.io.*;

/**
 * @author cyl
 * @version 1.0
 */

public class BufferedReader_ {
    public static void main(String[] args) {
        String filePath = "/home/yl/IdeaProjects/JavaGo/data/a.txt";
        String des = "/home/yl/IdeaProjects/JavaGo/data/news3.txt";
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            bufferedWriter = new BufferedWriter(new FileWriter(des));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
