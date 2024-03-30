package com.cyl.chapter21.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author cyl
 * @version 1.0
 */

public class Api_ {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
    }
}
