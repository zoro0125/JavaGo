package com.cyl.chapter14.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author cyl
 * @version 1.0
 */

public class Collection01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("cyl");
        list.add("ylw");
        list.add("xsw");
        list.add("yxs");
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
