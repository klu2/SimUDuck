package com.simuduck;

/**
 * @author Klaus Lehner
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new Squeak(), new NoFly());
    }

    @Override
    public void display() {
    }
}
