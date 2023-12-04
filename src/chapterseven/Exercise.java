package chapterseven;

public class Exercise {
    public static void main(String[] args) {

        double[] nums = {1.25};
        String[] strs = {"tom", "jery", "viper"};
        A01 a = new A01();
        System.out.println(a.max(nums));
        A02 a2 = new A02();
        System.out.println(a2.find(strs, "tom"));
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
    public void updatePrice(Book book) {
        if (book.price > 150){
            book.price = 150;
        } else if (book.price > 100) {
            book.price = 100;
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

