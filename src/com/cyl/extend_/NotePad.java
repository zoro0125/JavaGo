package com.cyl.extend_;

public class NotePad extends Computer {
    public String color;

    public void setColor(String color) {
        this.color = color;
    }
    NotePad() {

    }
    NotePad(String cpu, String disk, String memory, String color) {
        super(cpu, disk, memory);
        setColor(color);
    }
    public void getDetails() {
        super.getDetails();
        System.out.println("color=" + color);
    }
}
