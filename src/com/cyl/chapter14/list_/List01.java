package com.cyl.chapter14.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cyl
 * @version 1.0
 */

public class List01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(2);
        System.out.println(list);
        System.out.println(list.get(3));
    }
}
