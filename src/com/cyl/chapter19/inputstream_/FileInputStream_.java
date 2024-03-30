package com.cyl.chapter19.inputstream_;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author cyl
 * @version 1.0
 */

public class FileInputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void readFile01() {
        int read = 0;
        String filePath = "/home/yl/IdeaProjects/JavaGo/data/hello.txt";
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            while ((read = fileInputStream.read()) != -1) {
                System.out.print((char)read );
            }
            ;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    @Test
    public void readFile02() {
        int readlen = 0;
        byte[] buffer = new byte[8];
        String filePath = "/home/yl/IdeaProjects/JavaGo/data/hello.txt";
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            while ((readlen = fileInputStream.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, readlen));
            }
            ;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
