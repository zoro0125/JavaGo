package com.cyl.chapter17.ticket;

/**
 * @author cyl
 * @version 1.0
 */

public class SellTicket {
    public static void main(String[] args) {
        SellTicket01 sellTicket01 = new SellTicket01();
        SellTicket01 sellTicket02 = new SellTicket01();
        SellTicket01 sellTicket03 = new SellTicket01();
        sellTicket01.start();
        sellTicket02.start();
        sellTicket03.start();
    }
}
class  SellTicket01 extends Thread {

    private static int ticketNUm = 100;
    private boolean loop = true;

    public synchronized void m() {


            if (ticketNUm <= 0) {
                System.out.println("sold out");
                loop = false;
                return;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("seller:" + Thread.currentThread().getName() + " " + (--ticketNUm));


    }


    @Override
    public void run() {
        while (loop) {
            m();
        }
    }

}

class SellTicket02 implements Runnable {
    @Override
    public void run() {

    }
}