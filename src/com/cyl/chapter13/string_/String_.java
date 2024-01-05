package com.cyl.chapter13.string_;

/**
 * @author cyl
 * @version 1.0
 */

public class String_ {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
//        String str3 = new String(char[] {'h', 'e'});
        String str4 = new String("");
        System.out.println(str1.intern());
        System.out.println(str2 == str2.intern());

    }
}
