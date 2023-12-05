package com.cyl.chapter5;

public class Stars {
    public static void main(String[] args) {
        int level = 10;
        for (int i = 1; i <= level; i++) {

            for (int j = 1; j <= level - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j== 2 * i -1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for (int i = level + 1; i <= 2 * level - 1; i++) {
            for (int j = 1; j <= i - level; j++) {
                System.out.print(" ");
            }
            for (int j = 2 * (2 * level - i) -1; j >= 1; j--) {
                if (j == 1 || j == 2 * (2 * level - i) -1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
