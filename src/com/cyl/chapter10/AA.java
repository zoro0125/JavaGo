package com.cyl.chapter10;

public abstract class AA {
    public void calculate() {
        long start = System.currentTimeMillis();

        job();

        long end = System.currentTimeMillis();

        System.out.println("working time is " + (end - start));
    }
    public abstract void job();
}
