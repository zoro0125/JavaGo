package com.cyl.chapter17.thread_;

/**
 * @author cyl
 * @version 1.0
 */

public class ThreadExercise01 {
    public static void main(String[] args) throws InterruptedException {

        int count = 0;
        while (true) {
            System.out.println("主线程" + " hi" + (count++));
            Thread.sleep(1000);

            if (count >= 10) {
                break;
            }
            if (count == 5) {
                T5 t5 = new T5();
                Thread thread = new Thread(t5);
                thread.start();
                thread.join();
            }
        }

    }
}
class T5 implements Runnable {
    @Override
    public void run() {
        int count = 0;
        while (true) {
            System.out.println("子线程" + " hello" + (count++));
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
