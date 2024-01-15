package com.cyl.chapter14.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author cyl
 * @version 1.0
 */

public class Exercise01 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("no1", new Employee("no1", "xiaoming", 20000));
        hashMap.put("no2", new Employee("no2", "xiaoming", 2000));
        hashMap.put("no3", new Employee("no3", "xiaoming", 30000));

        Set set = hashMap.keySet();
        for (Object key : set) {
            Employee emp = (Employee) hashMap.get(key);
            if (emp.getSalary() > 18000) {
                System.out.println(emp);
            }
        }
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            Employee emp = (Employee) hashMap.get(next);
            if (emp.getSalary() > 18000) {
                System.out.println(emp);
            }
        }

        Set set1 = hashMap.entrySet();
        for (Object entry : set1) {
            Map.Entry entry1 = (Map.Entry) entry;
            Employee emp = (Employee) entry1.getValue();
            if (emp.getSalary() > 18000) {
                System.out.println(emp);
            }
        }

    }
}
class Employee {
    private String id;
    private String name;
    private  double salary;

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
