package com.cyl.chapter11;

/**
 * @version 1.0
 * @author cyl
 */

public class Enum {
    public static void main(String[] args) {

    }
}
@SuppressWarnings({"all"})
enum Season {
    SPRING("chuntian", "wennuan"), SUMMER("", "");

    private String name;
    private String desc;

    Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
