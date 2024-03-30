package com.cyl.chapter17.thread_;

/**
 * @author cyl
 * @version 1.0
 */

public class ThreadMethod02 {
    public static void main(String[] args) {

        T3 t3 = new T3();
        t3.start();

        int count = 0;
        while (true) {
            System.out.println("bbb" + " " + Thread.currentThread().getName() + " " + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count >= 10) {
                break;
            }
            if (count >= 5) {
                try {
                    t3.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}

class T3 extends Thread {
    @Override
    public void run() {

        int count = 0;
        while (true) {
            System.out.println("aaa" + " " + Thread.currentThread().getName() + count++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count >= 10) {
                break;
            }
        }
    }
}
