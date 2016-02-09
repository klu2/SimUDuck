package com.simuduck;

/**
 * @author Klaus Lehner
 */
public class Main {
    public static void main(String[] args) {

        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.quack();
        redHeadDuck.fly();

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        mallardDuck.fly();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.quack();
        rubberDuck.fly();
    }
}
