package com.simuduck;

/**
 * @author Klaus Lehner
 */
public abstract class Duck {

    private final QuackBehaviour quackBehaviour;
    private final FlyBehaviour flyBehaviour;

    public Duck(QuackBehaviour quackBehaviour, FlyBehaviour flyBehaviour) {
        this.quackBehaviour = quackBehaviour;
        this.flyBehaviour = flyBehaviour;
    }

    public final void quack() {
        quackBehaviour.quack();
    }

    public final void fly() {
        flyBehaviour.fly();
    }

    public void swim() {
    }

    public abstract void display();
}
