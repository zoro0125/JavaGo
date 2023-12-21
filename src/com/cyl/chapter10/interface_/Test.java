package com.cyl.chapter10.interface_;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Phone phone = new Phone();
        Camera camera = new Camera();
        computer.work(phone);
        computer.work(camera);
    }
}
