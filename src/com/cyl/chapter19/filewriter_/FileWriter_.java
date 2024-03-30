package com.cyl.chapter19.filewriter_;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author cyl
 * @version 1.0
 */

public class FileWriter_ {
    public static void main(String[] args) {

        String filePath = "/home/yl/IdeaProjects/JavaGo/data/hello.txt";
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
        }

    }
}
