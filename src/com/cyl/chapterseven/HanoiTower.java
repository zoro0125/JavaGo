package com.cyl.chapterseven;

public class HanoiTower {
    public static void main(String[] args) {

        Tower t = new Tower();
        t.move(5, 'a', 'b', 'c');
    }
}
class Tower {

    /*
    num 圆盘的个数
    a b c 是三个柱子
     */
    public void move(int num, char a, char b, char c) {
        if (num == 1) {
            System.out.println(a + "-->" + c);
        } else {
            move(num - 1, a, c ,b);
            System.out.println(a + "-->" + c);
            move(num - 1, b, a, c);
        }
    }
}
