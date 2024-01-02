package com.cyl.chapter12.selfexception;

/**
 * @author cyl
 * @version 1.0
 */

public class CustomException {
    public static void main(String[] args) {
        int age = 100000;
        if (!(age >= 12 && age <=120)) {
            throw new AgeException("年龄不合适");
        }
        System.out.println("hahaha");
    }
}

class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }

}
