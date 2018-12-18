package com.gleejay.server;

import java.util.HashMap;

/**
 * @author gleejay
 * @date 2018-12-18
 */
public class DebugTest {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        int j = 0;

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            j = i;
        }

        map.put("1","1");
        map.put("2","1");
        map.put("3","1");

        test1();
        map.put("4","1");
        map.put("5","1");
        map.put("6","1");
        map.put("7","1");



    }

    public static void test1() {
        System.out.println("AAAAAAAAAAAA");
        test2();
        System.out.println("oooooooooooooooo");
    }


    public static void test2() {
        System.out.println("BBBBBBBBB");
        System.out.println("CCCCCCCCCCC");
    }
}
