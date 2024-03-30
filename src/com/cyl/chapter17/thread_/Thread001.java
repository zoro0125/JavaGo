package com.cyl.chapter17.thread_;

/**
 * @author cyl
 * @version 1.0
 */

public class Thread001 {
    public static void main(String[] args) throws InterruptedException {

        T4 t4 = new T4();
        t4.setDaemon(true);
        t4.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("hihihi------");
            Thread.sleep(1000);
        }
    }
}
class T4 extends Thread {
    @Override
    public void run() {

        while (true) {
            System.out.println("hello______");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
