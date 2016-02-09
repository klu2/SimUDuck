package com.simuduck;

/**
 * @author Klaus Lehner
 */
public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("squeak");
    }
}
