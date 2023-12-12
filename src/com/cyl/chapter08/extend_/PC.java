package com.cyl.chapter08.extend_;

public class PC extends Computer{
    public String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    PC() {

    }
    PC(String cpu, String disk, String memory, String brand) {
        super(cpu, disk, memory);
        setBrand(brand);
    }
    public void getDetails() {
        super.getDetails();
        System.out.println("brand=" + brand);
    }
}
