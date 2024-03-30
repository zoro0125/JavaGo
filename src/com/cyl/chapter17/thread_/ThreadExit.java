package com.cyl.chapter17.thread_;

/**
 * @author cyl
 * @version 1.0
 */

public class ThreadExit {
    public static void main(String[] args) {
        T t = new T();
        t.start();

    }
}
class T extends Thread {
    int count = 0;
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(count++);
        }
    }
}
