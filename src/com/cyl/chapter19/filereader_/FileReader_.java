package com.cyl.chapter19.filereader_;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author cyl
 * @version 1.0
 */

public class FileReader_ {
    public static void main(String[] args) {

        String filePath = "/home/yl/IdeaProjects/JavaGo/data/a.txt";
        String desfilePath = "/home/yl/IdeaProjects/JavaGo/data/hello.txt";
        FileWriter fileWriter = null;
        FileReader fileReader = null;
        char[] buffer = new char[1024];
        int data = 0;
        int readLen = 0;
        try {
            fileReader = new FileReader(filePath);
            fileWriter = new FileWriter(desfilePath);
            while ((readLen = fileReader.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, readLen));
                fileWriter.write(buffer, 0, readLen);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
