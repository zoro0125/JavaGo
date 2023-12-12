package com.cyl.chapter08.homework;

public class Homework01 {
    public static void main(String[] args) {
        Person person = new Person("jack", 20, "qw");
        Person person1 = new Person("tom", 30, "qw");
        Person person2 = new Person("jerry", 10, "qw");
        Person[] persons = {person, person1, person2};
        new Sort().sortByAge(persons);
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
    }
}
class Sort {
    public void sortByAge(Person[] persons) {
        Person temp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - i - 1; j++) {
                if (persons[j].getAge() < persons[j + 1].getAge()) {
                    temp = persons[i];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
    }
}
class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
