package com.cyl.poly_.polyparamater;

public class Common extends Employee {
    public Common(String name, double monthSalary) {
        super(name, monthSalary);
    }
     public void work() {
         System.out.println(this.getName() + "work()......");
     }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }

}
