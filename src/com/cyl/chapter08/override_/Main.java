package com.cyl.chapter08.override_;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("xiaoming", 10);
        System.out.println(person.say());
        Student student = new Student("xiaoqiang", 19, 001, 99.1);
        System.out.println(student.say());

    }
}
