package com.cyl.chapter11.exercise;

/**
 * @author cyl
 * @version 1.0
 */

public class Factory {

    private Factory(){};
    public static Horse horse = new Horse();
    public static Horse getHorse() {
        return horse;
    }
    public static Boat getBoat() {
        return new Boat();
    }
}
