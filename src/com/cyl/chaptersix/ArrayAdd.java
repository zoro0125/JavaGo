package com.cyl.chaptersix;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAdd {
    public static void main(String[] args) {
        int x[] = {1, 2, 3};

        Scanner scanner = new Scanner(System.in);
        System.out.println("y or n");
        char add = scanner.next().charAt(0);
        while (add == 'y') {
            int new_array[] = new int[x.length + 1];
            for (int i = 0; i < x.length; i++) {
                new_array[i] = x[i];
            }
            System.out.println("add who?");

            int num = scanner.nextInt();
            new_array[x.length] = num;
            x = new_array;
            System.out.println("y or n");
            add = scanner.next().charAt(0);
        }
        System.out.println("exit");
        System.out.println(Arrays.toString(x));

    }
}
