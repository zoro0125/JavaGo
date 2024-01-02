package com.cyl.chapter12;

/**
 * @author cyl
 * @version 1.0
 */

public class Test {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 0;

        try {
            int res = num1 / num2;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
//            throw new RuntimeException(e);
        }

        System.out.println("hahahah");
    }
}
