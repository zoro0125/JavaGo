package com.cyl.chapterseven;

public class RecursionExercise {
    public static void main(String[] args) {

        Prac p = new Prac();
        int res = p.getFibo(7);
        System.out.println(res);
        int num = p.eatPear(9);
        System.out.println(num);
    }
}

class Prac {
    public int getFibo(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return getFibo(n - 1 ) + getFibo(n - 2);
        }
    }

    public int eatPear(int day) {
        if (day == 10) {
            return 1;
        } else {
            return (1 + eatPear(day + 1)) * 2;
        }
    }
}