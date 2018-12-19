package com.gleejay.service;

import com.gleejay.Domain.Persion;
import com.gleejay.domain.People;

/**
 * @author gleejay
 * @date 2018-12-19
 */
public class Test {

    public static void main(String[] args) {
        testNBA1();
        Persion persion = new Persion(20);
        persion.eat();

        People people = new People(50,"Gleejay");
        System.out.println(people);

        System.out.println("testNBA1()  ");
    }

    public static void testNBA1() {
        System.out.println("testNBA1");
    }
}
