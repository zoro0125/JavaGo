package com.cyl.chapterfour;

public class TernaryOperatorExercise {
    public static void main(String[] args) {
        /*
        返回三个数的最大值
         */
        int a = 1;
        int b = 2;
        int c = 3;
        int temp = a >= b ? a : b;
        int max = temp >= c ? temp : c;
        System.out.println(max);
    }
}
