package com.cyl.chapter08.homework;

public class Homework02 {
}
class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                '}';
    }
    public void introduce() {
        System.out.println(this.toString());
    }
}
class Professor extends Teacher {
    private double level = 1.3;
    public Professor(String name, int age, String post, double salary, double level) {
        super(name, age, post, salary);
        this.level = level;
    }
}
class AssoProfessor extends Teacher {
    private double level = 1.2;

    public AssoProfessor(String name, int age, String post, double salary, double level) {
        super(name, age, post, salary);
        this.level = level;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", post='" + this.getPost() + '\'' +
                ", salary=" + this.getSalary() +
                ", level=" + level +
                '}';
    }

    @Override
    public void introduce() {
        System.out.println(this.toString());
    }
}
class lecturer extends  Teacher {
    private double level = 1.1;

    public lecturer(String name, int age, String post, double salary, double level) {
        super(name, age, post, salary);
        this.level = level;
    }
}