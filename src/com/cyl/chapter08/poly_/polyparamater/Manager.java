package com.cyl.chapter08.poly_.polyparamater;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double monthSalary, double bonus) {
        super(name, monthSalary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + this.bonus;
    }

    public void manager() {
        System.out.println(this.getName() + "manager()......");
    }
}
