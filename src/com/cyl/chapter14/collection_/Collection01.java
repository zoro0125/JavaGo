package com.cyl.chapter14.collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cyl
 * @version 1.0
 */

public class Collection01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add(1);

        list.remove(0);
        System.out.println(list.contains("jack"));
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.isEmpty());


    }
}
