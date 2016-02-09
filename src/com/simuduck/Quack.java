package com.simuduck;

/**
 * @author Klaus Lehner
 */
public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("quack");
    }
}
