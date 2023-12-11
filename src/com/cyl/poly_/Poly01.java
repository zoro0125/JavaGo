package com.cyl.poly_;

public class Poly01 {
    public static void main(String[] args) {
        Master master = new Master("tom");
        Dog dog = new Dog("大黄");
        Bone bone = new Bone("排骨");

        master.feed(dog, bone);
    }
}
