package com.cyl.chapter14.map_;

import java.util.HashMap;

/**
 * @author cyl
 * @version 1.0
 */

public class Map_ {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("1", "nia");
        System.out.println(hashMap.get("1"));
        System.out.println(hashMap);
    }
}
