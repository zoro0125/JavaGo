package com.cyl.chapter10;

public class Single02 {
    public static void main(String[] args) {

    }
}
class Person1 {
    private String name;

    private static Person1 person;
    private Person1(String name) {
        this.name = name;
    }

    public static Person1 getInstance() {
        if (person == null) {
            person = new Person1("xiaohong");
        }
        return person;
    }
}