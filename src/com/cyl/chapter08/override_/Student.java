package com.cyl.chapter08.override_;

public class Student extends Person {
    private int id;
    private double score;

    Student() {

    }
    Student(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }
    public String say() {
        return super.say() + " my id is " + this.id + "my score is " + this.score;
    }
}
