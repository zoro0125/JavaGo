package com.cyl.chapter17.thread_;

/**
 * @author cyl
 * @version 1.0
 */

public class ThreadUse {
    public static void main(String[] args) throws InterruptedException {

        Cat cat = new Cat();
        cat.start();

        while (true) {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
        }

    }
}
class Cat extends Thread {
    @Override
    public void run() {

        while (true) {
            System.out.println("miao miao");
            System.out.println(Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
