package com.cyl.chapter17.threaduse;

/**
 * @author cyl
 * @version 1.0
 */

public class ThreadUse03 {
    public static void main(String[] args) {

        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread.start();
        thread2.start();

    }
}
class T1 implements Runnable{
    @Override
    public void run() {
        while(true) {
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
class T2 implements Runnable{
    @Override
    public void run() {
        while (true) {
            System.out.println("hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
