package com.cyl.chapter12.exception_;

import java.util.Scanner;

/**
 * @author cyl
 * @version 1.0
 */

public class Exercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String num;
        int x;

        while (true) {
            System.out.println("inout");
            num = scanner.next();
            try {
                x = Integer.parseInt(num);
                break;
            } catch (Exception e) {
                System.out.println("青草巷宏新输入");
            }
        }


        System.out.println(num);

    }
}
