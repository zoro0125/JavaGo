package com.cyl.poly_;

public class Master {
    private String name;

    public Master() {
    }

    public Master(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void feed(Animal animal, Food food) {
        System.out.println("主人" + name + "给小狗" + animal.getName() + "喂" + food.getName());
    }
}
