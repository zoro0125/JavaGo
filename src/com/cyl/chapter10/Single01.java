package com.cyl.chapter10;

public class Single01 {
    public static void main(String[] args) {
        Person person = Person.getInstance();
        System.out.println(person);
    }
}

class Person {
    
    private String name;
    private static Person person = new Person("xiaohong");
    private Person(String name) {
        this.name = name;
    }

    public static Person getInstance() {
        return person;
    } 
}