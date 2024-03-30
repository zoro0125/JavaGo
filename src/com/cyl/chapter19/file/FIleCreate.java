package com.cyl.chapter19.file;

import java.io.File;
import java.io.IOException;

/**
 * @author cyl
 * @version 1.0
 */

public class FIleCreate {
    public static void main(String[] args) {
        create01();
        create02();
        create03();
    }
    public static void create01() {
        String filePath = "/home/yl/IdeaProjects/JavaGo/data/news1.txt";
        File file = new File(filePath);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            System.out.println("文件创建失败");
        }
    }
    public static void create02() {
        File file = new File("/home/yl/IdeaProjects/JavaGo/data/");
        String fileName = "news2.txt";

        File file1 = new File(file, fileName);

        try {
            file1.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {

            e.printStackTrace();
        }

    }
    public static void create03() {
        String filePath = "/home/yl/IdeaProjects/JavaGo/data/";
        String fileName = "news3.txt";

        File file1 = new File(filePath, fileName);

        try {
            file1.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {

            e.printStackTrace();
        }

    }
}
