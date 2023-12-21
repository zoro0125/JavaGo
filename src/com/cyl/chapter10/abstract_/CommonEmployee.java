package com.cyl.chapter10.abstract_;

public class CommonEmployee extends Employee{

    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("common worker" + this.getName() + "is working");
    }
}
