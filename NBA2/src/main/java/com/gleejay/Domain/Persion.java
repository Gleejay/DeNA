package com.gleejay.Domain;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * @author gleejay
 * @date 2018-12-19
 */
public class Persion {
    /** age */
    private int age;

    public Persion(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("eat " + age);
    }

}
