package com.cyl.chapter10.innerclass_;

public class Exercise {
    public static void main(String[] args) {

        f1(new AA() {
            @Override
            public void show() {
                System.out.println("aaa");
            }
        });
    }
    public static void f1(AA aa) {
        aa.show();
    }
}
interface AA {
    void show();
}