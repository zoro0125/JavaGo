package com.cyl.chapter14.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author cyl
 * @version 1.0
 */

public class Exercise01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("hello" + i);
        }
        System.out.println(list);
        list.add(1, "汉顺平教育");
        System.out.println(list);
        System.out.println(list.get(4));
        list.remove(5);
        System.out.println(list);
        list.set(6, "change");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            System.out.println(obj);
        }
    }
}
