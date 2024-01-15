package com.cyl.chapter14.homework;

import java.util.ArrayList;

/**
 * @author cyl
 * @version 1.0
 */

public class Homework01 {
    public static void main(String[] args) {
        New aNew = new New("新闻一：本套Java视频教程非常适合零基础的学员观看，本教程全面讲解了Java基础的方方");
        New aNew1 = new New("新闻二:既让初学者快速掌握Java，也能让Java老手更全面、系统的学习到技术细节, 是想转行 javaEE, 大");

        ArrayList list = new ArrayList();
        list.add(aNew);
        list.add(aNew1);

        for (int i = list.size() - 1; i >= 0; i--) {
            New new1 = (New) list.get(i);
            System.out.println(new1);
        }
    }
}

class New {
    private String title;
    private String content;

    public New(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public New(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        if (title.length() > 15) {
            return "New{" +
                    "title='" + title.substring(0, 15) + "..." + '\'' +
                    '}';
        }
        return "New{" +
                "title='" + title + '\'' +
                '}';
    }
}