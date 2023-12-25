package com.cyl.chapter11.exercise;

/**
 * @author cyl
 * @version 1.0
 */

public class Frock {
    private static int currentNum = 100000;
    private int serialNumber;

    public static int getNextNum() {
        currentNum = currentNum + 100;
        return currentNum;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    Frock() {
        serialNumber = getNextNum();
    }
}
