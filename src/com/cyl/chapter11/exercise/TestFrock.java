package com.cyl.chapter11.exercise;

/**
 * @author cyl
 * @version 1.0
 */

public class TestFrock {
    public static void main(String[] args) {
        Frock frock = new Frock();
        System.out.println(frock.getSerialNumber());
        Frock frock1 = new Frock();
        System.out.println(frock1.getSerialNumber());
        Frock frock2 = new Frock();
        System.out.println(frock2.getSerialNumber());

        Cat cat = new Cat();
        cat.shout();
        Dog dog = new Dog();
        dog.shout();

        int res = new Cellphone().testWork(new ComputerIA() {
            @Override
            public int work(int x1, int x2) {
                System.out.println("work....");
                return x1 + x2;
            }
        }, 1, 2);
        System.out.println(res);


        Person person = new Person("唐僧", Factory.getHorse());
        person.walk();
        person.passRiver();
        person.passRiver();
        person.walk();
        person.passRiver();
        person.walk();

    }
}
