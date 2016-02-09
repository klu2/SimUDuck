package com.simuduck;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Klaus Lehner
 */
public class DuckTest {

    @Test
    public void testMallardDuck() {
        MallardDuck duck = new MallardDuck();
        Assert.assertEquals("quack", duck.quack());
    }

    @Test
    public void testRubberDuck() {
        RubberDuck duck = new RubberDuck();
        Assert.assertEquals("squeak", duck.quack());
    }
}
