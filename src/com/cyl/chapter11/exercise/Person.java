package com.cyl.chapter11.exercise;

/**
 * @author cyl
 * @version 1.0
 */

public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicles getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicles vehicles) {
        this.vehicles = vehicles;
    }

    public void passRiver() {
        if (!(vehicles instanceof Boat)) {
            vehicles = Factory.getBoat();
        }
        vehicles.work();
    }
    public void walk() {
        if (!(vehicles instanceof Horse)) {
            vehicles = Factory.getHorse();
        }
        vehicles.work();
    }
}
