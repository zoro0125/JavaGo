package com.cyl.chapter19.outputstream_;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author cyl
 * @version 1.0
 */

public class FIleOutputStream_ {
    public static void main(String[] args) {

    }
    @Test
    public void writeFile() {

        FileOutputStream fileOutputStream = null;

        String filePath = "/home/yl/IdeaProjects/JavaGo/data/a.txt";

        try {
            fileOutputStream = new FileOutputStream(filePath, true);
            String str = "hello, world";
            fileOutputStream.write(str.getBytes());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
