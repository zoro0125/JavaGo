package com.cyl.override_;

public class Person {
    private String name;
    private int age;

    Person() {

    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String say() {
        return "my name is " + this.name + " my age is " + this.age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
