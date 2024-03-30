package com.cyl.chapter17.tunableuse;

/**
 * @author cyl
 * @version 1.0
 */

public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start();
        while (true) {
            System.out.println("main---");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class Dog implements Runnable {

    @Override
    public void run() {
        int times = 0;
        while (true) {
            System.out.println("wsng---");
            times++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
