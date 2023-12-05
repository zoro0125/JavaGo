package com.cyl.chapter5;

import java.util.Scanner;

public class IfExercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = 30.1;
        double n2 = 12.2;
        if (n1 > 10.0 && n2 < 20.0) {
            System.out.println("两数之和为=" + (n1 + n2));
        }

        int x1 = 1;
        int x2 = 3;
        if ((x1 + x2) % 3 == 0 && (x1 + x2) % 5 == 0) {
            System.out.println("可以");
        } else {
            System.out.println("不可以");
        }

        System.out.println("请输入年份:");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("是闰年");
        } else if (year % 4 == 0) {
            System.out.println("是闰年");
        } else {
            System.out.println("不是闰年");
        }

    }
}
