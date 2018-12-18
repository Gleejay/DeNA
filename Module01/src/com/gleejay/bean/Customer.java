package com.gleejay.bean;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Customer extends Persion {
    private static final String KK  = "213414";

    private static final int AABB = 1;
    private static int num;

    @Override
    public void eat() {
        System.out.println("Customer eat");

        //renew 2
    }

    public static void main(String[] args) {
        //单行注释

        fori();

        List<String> list = new ArrayList<String>();

        HashMap<String, String> hashMap = new HashMap<String, String>();

        new HashMap<String, String>();
        hashMap.put("1", "a");
        hashMap.put("2", "B");

        list.add(0, "11111");

        if (list == null) {

        }

        if (hashMap != null) {

        }


        System.out.println(hashMap.get("2"));
        System.out.println("gleejay");

        fun();
        System.out.println("Customer.main");
    }

    public static void fun() {
        num = 1;
        System.out.println(num);
        System.out.println("fun()");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C://ss.text");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


    public static void fori(){
        String s[] = new String[]{"111","22222"};
        for (int i = 0; i < s.length; i++) {
            System.out.println("打印的数值: " + s[i]);
        }

        for (String s1 : s) {
            System.out.println("msg: " + s1);
        }


        for (int i = 0; i < s.length; i++) {
            String s1 = s[i];
            System.out.println(s1);
        }
    }



    public Customer() {
    }
}
