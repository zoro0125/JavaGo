package com.cyl.poly_.polyparamater;

public class Employee {
    private String name;
    private double monthSalary;

    Employee(String name, double monthSalary) {
        this.name = name;
        this.monthSalary = monthSalary;
    }
    public double getAnnual() {
        return monthSalary * 12;
    }

    public String getName() {
        return name;
    }

    public double getMonthSalary() {
        return monthSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }
}
