package com.cyl.chapter14.map_;

import java.util.*;

/**
 * @author cyl
 * @version 1.0
 */

public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        map.put("4", "d");
        map.put("5", "e");
        map.put("6", "f");
        map.put("7", "g");

        Set keyset = map.keySet();
        for (Object obj : keyset) {
            System.out.println(obj + "-" + map.get(obj));
        }

        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(map.get(next));
        }

        Collection values = map.values();
        for (Object value:values) {
            System.out.println(value);
        }
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            System.out.println(next);
        }

        Set set = map.entrySet();

        for (Object entry : set) {
            Map.Entry entry1 = (Map.Entry) entry;
            System.out.println(entry1.getKey());
            System.out.println(entry1.getValue());
        }

        Iterator iterator2 = set.iterator();
        while (iterator2.hasNext()) {
            Object next =  iterator2.next();
            Map.Entry next1 = (Map.Entry) next;
            System.out.println(next1.getKey());
            System.out.println(next1.getValue());

        }

    }
}
