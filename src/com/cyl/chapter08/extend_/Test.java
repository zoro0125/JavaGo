package com.cyl.chapter08.extend_;

public class Test {
    public static void main(String[] args) {
        PC pc = new PC("i7", "qw", "ew", "len");
        pc.getDetails();
        NotePad notePad = new NotePad("i8", "sd", "vrf", "red");
        notePad.getDetails();

    }
}
class Grandpa {
    public String name = "yeye";
    public String hobby = "wan";
}
class Father extends Grandpa {
    public String name = "baba";
    public String hobby = "he";
}
class Son extends Father {
    public String name = "erzi";
}
