package com.cyl.chapterfour;

public class ArithmeticOperator {
    /*
    取模公式 a % b = a - a / b * b
    若a是小数,会把他强转成整数
     */

    public static void main(String[] args) {
        int i = 1;
        i = i++;
        i = ++i;
        int j = i;
        System.out.println(i);
        System.out.println(j);

        String str = "1.3";
        double n1 = Double.parseDouble(str);
        System.out.println(n1);
        char c1 = 'a';
        String str2 = c1 + "";
        System.out.println(str2);
    }


}
