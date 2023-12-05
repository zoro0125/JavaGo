package com.cyl.chapterseven;

public class TestPerson {
    public static void main(String[] args) {

        Person1 p1 = new Person1("sam", 19);
        Person1 p2 = new Person1("sam", 19);
        System.out.println(p1.compareTo(p2));

    }
}
class Person1 {
    public String name;
    public int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public boolean compareTo (Person1 p) {
//        if (this.age == p.age && this.name.equals(p.name)) {
//            return true;
//        } else {
//          return false;
//        }
        return this.age == p.age && this.name.equals(p.name);
    }
}
