package com.cyl.chapter17.thread_;

/**
 * @author cyl
 * @version 1.0
 */

public class Cpu {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());
    }
}
