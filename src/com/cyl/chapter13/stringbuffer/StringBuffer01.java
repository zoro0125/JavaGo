package com.cyl.chapter13.stringbuffer;


/**
 * @author cyl
 * @version 1.0
 */

public class StringBuffer01 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello");
        StringBuffer stringBuffer1 = new StringBuffer(100);
        StringBuffer stringBuffer2 = new StringBuffer("hello");

        String str1 = "hello";
        StringBuffer stringBuffer3 = new StringBuffer(str1);
        stringBuffer3.append(str1);
        System.out.println(stringBuffer3);
        String str2 = stringBuffer3.toString();
        String string = new String(stringBuffer3);
//        Arrays.sort();
    }
}
