package com.cyl.chapter14.homework;

import java.util.*;

/**
 * @author cyl
 * @version 1.0
 */

public class Homework02 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        Map hashMap = new HashMap();
        hashMap.put("jack", 650);
        hashMap.put("tom", 1200);
        hashMap.put("smith", 2900);
        System.out.println(hashMap);

        hashMap.put("jack", 2600);
        System.out.println(hashMap);

        Set set = hashMap.keySet();
        for (Object obj : set) {
            System.out.println(obj);
        }

        Collection values = hashMap.values();
        for (Object obj : values) {
            System.out.println(obj);
        }

    }
}
