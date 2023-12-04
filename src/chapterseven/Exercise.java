package chapterseven;

import java.util.Random;

public class Exercise {
    public static void main(String[] args) {

        double[] nums = {1.25};
        String[] strs = {"tom", "jery", "viper"};
        A01 a = new A01();
        System.out.println(a.max(nums));
        A02 a2 = new A02();
        System.out.println(a2.find(strs, "tom"));

        Circle c = new Circle();
        PassObject ps = new PassObject();
        ps.printArea(c, 5);
        System.out.println("radius=" + c.radius);
    }
}
class Tom {
    public int tomNum;
    public int comNum;

    public int genComNum() {
        Random ran = new Random();
        comNum = ran.nextInt(3);
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
        if (this.price > 150){
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

