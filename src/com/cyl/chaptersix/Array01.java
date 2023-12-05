package com.cyl.chaptersix;

import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        /*
        数组的初始化

        数组是引用类型，创建之后在堆里面，有默认值，变量在栈里面，没有默认值
         */
        Scanner scanner = new Scanner(System.in);
        char litters[] = new char[26];
        char x = 'A';
        for (int i = 0; i < litters.length; i++, x++) {
            litters[i] = x;
        }
        for (int i = 0; i < litters.length; i++) {
            System.out.println(litters[i]);
        }

        int nums[] = {1, 2, 3, 4, 5};
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = i;
            }
        }
        System.out.println(nums[max]);
        System.out.println(max);



    }
}
