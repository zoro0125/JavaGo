package com.cyl.chapter14.collection_;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author cyl
 * @version 1.0
 */

public class Iterator01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }


        int[] nums = {1, 2, 3, 4, 5};
        for (int x : nums) {
            System.out.println(x);
        }

    }
}
