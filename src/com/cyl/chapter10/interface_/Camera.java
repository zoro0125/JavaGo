package com.cyl.chapter10.interface_;

public class Camera implements UsbInterface {
    @Override
    public void stop() {
        System.out.println("camera stop");
    }

    @Override
    public void start() {
        System.out.println("camera start");
    }
}
