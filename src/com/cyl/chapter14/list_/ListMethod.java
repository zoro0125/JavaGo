package com.cyl.chapter14.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cyl
 * @version 1.0
 */

public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(3);
        list.add(1, 2);
        System.out.println(list);
        list.set(1, 8);
        System.out.println(list);
    }
}
