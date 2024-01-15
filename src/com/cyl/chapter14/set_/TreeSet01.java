package com.cyl.chapter14.set_;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author cyl
 * @version 1.0
 */

public class TreeSet01 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).compareTo((String) o2);
            }
        });
    }
}
class A {


    interface S {

    }
}
