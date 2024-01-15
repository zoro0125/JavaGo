package com.cyl.chapter15.generic_;

import org.junit.Test;

import java.util.*;

/**
 * @author cyl
 * @version 1.0
 */

public class Homework01 {
    public static void main(String[] args) {

    }
    @Test
    public void TestDao() {
        DAO<User> userDAO = new DAO<>();


    }
}

class DAO<T> {
    private Map<String, T> map = new HashMap<>();


    public void save(String id, T entity) {
        map.put(id, entity);
    }
    public T get(String id) {
        return map.get(id);
    }
    public void update(String id, T entity) {
        map.put(id, entity);
    }
    public List<T> list() {
        ArrayList<T> ts = new ArrayList<>();
        Collection<T> values = map.values();
        for (T t : values) {
            ts.add(t);
        }
        return ts;
    }
    public void delete(String id) {
        map.remove(id);
    }
}
class User {
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
