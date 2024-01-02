package com.cyl.chapter12.exception_;

/**
 * @author cyl
 * @version 1.0
 */

public class Exception01 {
    public static void main(String[] args) {

//        String name = null;
//        System.out.println(name.length());

//        int[] nums = {1, 2};
//        System.out.println(nums[3]);

//        String num = "12x3";
//        int x = Integer.parseInt(num);
//        System.out.println(x);

        int num1 = 1;
        int num2 = 0;

        int res;
        try {
            res = num1 / num2;
        }catch (Exception e) {
            System.out.println(e.getMessage());
            res = 1;
        }

        System.out.println(res);


        int[] nums = new int[3];
        System.out.println(nums[2]);



    }
}
