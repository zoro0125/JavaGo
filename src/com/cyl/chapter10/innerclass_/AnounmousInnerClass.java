package com.cyl.chapter10.innerclass_;

public class AnounmousInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
    }
}
class Outer02{

    private int x = 1;
    public void m1() {
        IA ia = new IA() {
            @Override
            public void cry() {
                System.out.println("cry()....");
            }
        };
        System.out.println(ia.getClass());
        ia.cry();
        Father jack = new Father("jack"){
            @Override
            public void test() {
                System.out.println("hhh");
            }
        };
        System.out.println(jack.getClass());
        jack.test();
    }

}
interface IA {
    void cry();
}
class Father {
    private String name;

    public Father(String name) {
        this.name = name;
    }
    public void test() {

    }
}
