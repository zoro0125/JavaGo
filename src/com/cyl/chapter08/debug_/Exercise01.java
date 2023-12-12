package com.cyl.chapter08.debug_;

public class Exercise01 {
    public static void main(String[] args) {

        Person person = new Person("jack", 10);
        System.out.println(person.toString());
    }
}
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
