package com.cyl.chapter19.outputstream_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author cyl
 * @version 1.0
 */

public class FIleCopy {
    public static void main(String[] args) throws IOException {

        String srcPath = "/home/yl/IdeaProjects/JavaGo/data/bqb.jpg";
        String desPath = "/home/yl/IdeaProjects/JavaGo/data/bqb_1.jpg";

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        byte[] buffer = new byte[1024];
        int readLen = 0;

        try {
            fileInputStream = new FileInputStream(srcPath);
            fileOutputStream = new FileOutputStream(desPath);
            while ((readLen = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, readLen);
            }
            System.out.println("copy done");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            fileOutputStream.close();
            fileInputStream.close();
        }

    }
}
