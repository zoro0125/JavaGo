package com.cyl.chapter10;

public class BB extends AA {
    @Override
    public void job() {
        int sum = 0;
        for (int i = 0; i < 100000000; i++) {
            sum += i;
        }
    }
}
