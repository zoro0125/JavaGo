package com.cyl.chapter08.poly_.polyparamater;

public class Test {
    public static void main(String[] args) {

        Common common = new Common("cyl", 10000);
        Manager manager = new Manager("tony", 10000, 10000);
        System.out.println(showEmpAnnual(common));
        System.out.println(showEmpAnnual(manager));
        testWork(common);
        testWork(manager);
         new Object();
    }



    public static double showEmpAnnual(Employee e) {
        return e.getAnnual();
    }
    public static void testWork(Employee e) {
        if (e instanceof Common) {
            ((Common) e).work();
        } else if (e instanceof Manager) {
            ((Manager) e).manager();
        }
    }
}
