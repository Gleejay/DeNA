package com.gleejay.test;

import com.gleejay.Domain.Persion;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author gleejay
 * @date 2018-12-19
 */
public class Test1 {

    @Test
    public void test() {
        Persion persion = new Persion(20);
        Persion persion2 = new Persion(30);
        System.out.println("persion = " + persion);
        System.out.println("persion2 = " + persion2);
        Assert.assertEquals(persion,persion);
    }
}
