package com.cyl.chapter17.thread_;

/**
 * @author cyl
 * @version 1.0
 */

public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        T6 t6 = new T6();
        System.out.println(t6.getState());
        t6.start();

        while (t6.getState() != Thread.State.TERMINATED) {
            System.out.println(t6.getState());
            Thread.sleep(1000);
        }

    }
}
class T6 extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
