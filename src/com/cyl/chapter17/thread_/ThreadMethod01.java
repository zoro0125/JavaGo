package com.cyl.chapter17.thread_;

/**
 * @author cyl
 * @version 1.0
 */

public class ThreadMethod01 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        t1.setName("tom");
        t1.start();
        int count = 0;
        while (true) {
            System.out.println(Thread.currentThread().getName() + " " + count++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count >= 5) {
                break;
            }
        }
        t1.interrupt();

    }
}

class T1 extends Thread {

    @Override
    public void run() {
        int count = 0;
        while (true) {
            System.out.println("hello" + " " + count++ + " " + Thread.currentThread().getName());
            if (count >= 100) {
                break;
            }
        }
        try {
            System.out.println("xiumianzhong" + " " + Thread.currentThread().getName());
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            System.out.println("zhongduan" + " " + Thread.currentThread().getName());
        }
    }
}
