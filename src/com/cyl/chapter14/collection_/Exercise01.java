package com.cyl.chapter14.collection_;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author cyl
 * @version 1.0
 */

public class Exercise01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Dog(1, "jack"));
        list.add(new Dog(2, "tom"));
        list.add(new Dog(3, "sam"));
        for (Object dog : list) {
            System.out.println(dog);
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}


class Dog {
    private int age;
    private String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
