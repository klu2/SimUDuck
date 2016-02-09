package com.simuduck;

/**
 * @author Klaus Lehner
 */
public class NoFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("-");
    }
}
