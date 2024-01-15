package com.cyl.chapter15.generic_;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author cyl
 * @version 1.0
 */

public class Exercise {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("jack", 19000, new MyDate(2009, 12, 2)));
        employees.add(new Employee("tom", 13000, new MyDate(2009, 3, 12)));
        employees.add(new Employee("jerry", 19000, new MyDate(2009, 7, 24)));

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (! (o1.getName().equals(o2.getName()))) {
                    return o1.getName().compareTo(o2.getName());
                }
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });

        System.out.println(employees);

        MyDate myDate = new MyDate(1, 1, 2);
        myDate.sss(new MyDate(1212, 3232, 454));


    }
}

class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}
class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }


    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
    public void sss(MyDate datre) {
        System.out.println(datre.year);
    }

    @Override
    public int compareTo(MyDate o) {

        if (year != o.year) {
            return o.year - year;
        } else if (month != o.month) {
            return o.month - month;
        } else {
            return o.day - day;
        }
    }
}
