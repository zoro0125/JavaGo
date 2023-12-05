package com.cyl.chapterthree;

public class CharDetail {

    /*
    char的本质是一个数字,在输出时会输出unixode码对应的字符
    char类型可以参与运算
    char类型的保存:首先找到对应的码值,将数字转化为二进制,然后进行存储
     */
    public static void main(String[] args) {
        char c = 38472;
        char y = 36814;
        char l = 40857;
        System.out.println(c);
        System.out.println(y);
        System.out.println(l);

    }
}
