package com.cyl.chapter10;

public class StaticDetails {
    public static void main(String[] args) {

    }
}
class A {
    public static int age = getAge();

    public static void show() {
        System.out.println("弗雷静态仿法");
    }
    private static int getAge() {
        return 10;
    }

    public A() {
        System.out.println("；弗雷构造期");
    }
}
class B extends A {
    public static int num = 1;
    public static void show() {
        System.out.println("zileijingtaofangfa ");
    }
}