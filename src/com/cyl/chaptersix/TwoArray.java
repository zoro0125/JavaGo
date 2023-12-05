package com.cyl.chaptersix;

import java.util.Arrays;

public class TwoArray {
    public static void main(String[] args) {
        int nums[][] = new int[3][];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = new int[i + 1];
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = i + 1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums[i]));

        }
    }
}
