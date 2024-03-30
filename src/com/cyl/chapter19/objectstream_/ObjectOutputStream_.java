package com.cyl.chapter19.objectstream_;

import java.io.*;

/**
 * @author cyl
 * @version 1.0
 */

public class ObjectOutputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String file = "/home/yl/IdeaProjects/JavaGo/data/data.dat";

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeInt(100);
        objectOutputStream.writeUTF("陈迎龙");
        objectOutputStream.writeObject(new Dog(12, "tom"));
        System.out.println("序列化");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));

        int a = objectInputStream.readInt();
        System.out.println(a);
        String str = objectInputStream.readUTF();
        System.out.println(str);
        Object dog = objectInputStream.readObject();
        System.out.println((Dog) dog);


    }
}

class Dog implements Serializable{
    int age;
    String name;

    public Dog(int age, String name) {
        this.age = age;
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
