package com.cyl.chapter11.exercise;

/**
 * @author cyl
 * @version 1.0
 */

public class Car {
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public class Air {
        public void flow() {
            if (temperature > 40) {
                System.out.println("cold");
            } else if (temperature < 0) {
                System.out.println("hot");
            } else {
                System.out.println("Air shut down");
            }
        }
    }
    public Air getAir() {
        return new Air();
    }
}
