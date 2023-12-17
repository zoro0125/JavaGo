package com.cyl.chapter10;

public class StaticMethod {
    public static void main(String[] args) {

//        new Student("niaho");
        System.out.println("iuahif");

    }
}
class Student {
    public static int money;
    public String name;

    static {
        System.out.println("codeblock...");
    }
    public Student(String name) {
        this.name = name;
    }

    public static void show() {
        System.out.println();
    }
}
