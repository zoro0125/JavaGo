package com.cyl.chapterseven;

import java.util.Random;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {

        Tom tom = new Tom();
        tom.count = 3;
        for (int i = 0; i < tom.count; i++) {
            System.out.println("请出拳：");
            Scanner scanner = new Scanner(System.in);
            tom.setTomNum(scanner.nextInt());
            tom.setComNum();
            if (tom.comNum == 0) {
                System.out.println("电脑出石头");
            } else if (tom.comNum == 1) {
                System.out.println("电脑出剪刀");
            } else {
                System.out.println("电脑出布");
            }
            tom.compare();
        }
    }
}

class Tom {
    public int tomNum;
    public int comNum;
    public int count = 1;


    public void setComNum() {
        Random ran = new Random();
        comNum = ran.nextInt(3);
    }

    public void setTomNum(int tomNum) {
        this.tomNum = tomNum;
    }

    public void compare() {
        if ((tomNum == 0 && comNum == 1) || (tomNum == 1 && comNum == 2) || (tomNum == 2 && comNum == 0)) {
            System.out.println("你赢了");
        } else if (tomNum == comNum) {
            System.out.println("平了");
        } else {
            System.out.println("你输了");
        }
    }
}

class Circle {
    public double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    Circle() {

    }

    public double findArea() {
        return Math.PI * radius * radius;
    }
}

class PassObject {
    public void printArea(Circle c, int times) {
        System.out.println("Radius\tArea");
        for (int i = 1; i <= times; i++) {
            c.radius = i;
            System.out.println(i + "\t\t" + c.findArea());
        }
    }
}

class A01 {
    public Double max(double[] nums) {
        if (nums.length == 0) {
            return null;
        }
        int maxIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex])
                maxIndex = i;
        }
        return nums[maxIndex];

    }
}

class A02 {
    public int find(String[] strs, String str) {
        for (int i = 0; i < strs.length; i++) {
            if (str.equals(strs[i])) {
                return i;
            }
        }
        return -1;
    }
}

class Book {
    int price;

    public void updatePrice() {
        if (this.price > 150) {
            this.price = 150;
        } else if (this.price > 100) {
            this.price = 100;
        }
    }
}

class Employee {
    public String name;
    public char sex;
    public int age;
    public String level;
    public double salary;

    Employee(String name, char sex, int age) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    Employee(String level, double salary) {
        this.level = level;
        this.salary = salary;
    }

    Employee(String name, char sex, int age, String level, double salary) {
        this(name, sex, age);
//        this(level, salary);
        this.level = level;
        this.salary = salary;
    }

}

