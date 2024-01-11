package com.cyl.chapter14.list_;

import java.util.ArrayList;

/**
 * @author cyl
 * @version 1.0
 */

public class ALSource {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        for (int i = 11; i <= 15; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);
    }
}
