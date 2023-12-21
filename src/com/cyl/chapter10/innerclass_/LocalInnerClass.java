package com.cyl.chapter10.innerclass_;

public class LocalInnerClass {
    public static void main(String[] args) {

    }
}

class Outer01 {
    private int x = 10;
    private void m2(){

    }
    public void m1() {
        class Inner {
            private int x  =9;
            public void f1() {
                System.out.println(x);
                m2();
            }
        }
        Inner inner = new Inner();
    }
}
