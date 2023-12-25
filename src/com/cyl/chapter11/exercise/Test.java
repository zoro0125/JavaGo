package com.cyl.chapter11.exercise;

/**
 * @author cyl
 * @version 1.0
 */

public class Test {
    public static void main(String[] args) {
        Car car = new Car(60);
        car.getAir().flow();
        Color color = Color.BLUE;
        switch (color) {
            case BLACK:
                color.show();
                break;
            case BLUE:
                color.show();
                break;
            case YELLOW:
                color.show();
                break;
            case RED:
                color.show();
                break;
            case GREEN:
                color.show();
                break;
        }
    }
}
