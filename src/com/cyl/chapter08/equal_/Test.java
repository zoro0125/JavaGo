package com.cyl.chapter08.equal_;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("qw", 12, '男');
        Person person1 = new Person("qw", 2, '男');
        System.out.println(person1.equals(person));
        System.out.println(person.toString());
        person = null;
    }
}
