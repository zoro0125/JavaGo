package com.cyl.chapter10.interface_;

public class Phone implements UsbInterface{
    @Override
    public void start() {
        System.out.println("phone start");
    }

    @Override
    public void stop() {
        System.out.println("phone end");
    }
}
