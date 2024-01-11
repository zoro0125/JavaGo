package com.cyl.chapter14.set_;

import java.util.HashSet;
import java.util.Set;

/**
 * @author cyl
 * @version 1.0
 */

public class Set01 {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(null);
        System.out.println(set);

        System.out.println(15 & 5);

    }
}
