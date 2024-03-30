package com.cyl.chapter17.threaduse;

/**
 * @author cyl
 * @version 1.0
 */

public class Thread01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.start();
        while (true) {
            System.out.println("mainmain-----");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }

}

class Cat extends Thread{

    @Override
    public void run() {

        int count = 0;
        while (true) {
            System.out.println("miaomiao");
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count == 80) {
                break;
            }
        }
    }
}
