package com.tutorial.aopdemo.console;

import core.aspects.MeasureTime;

public class ClassForTest {

    @MeasureTime
    public void simpleMethod() {
        System.out.println("Simple method execution");
    }

    @MeasureTime
    public void simpleMethodWithSleeping() {
        System.out.println("Simple method 2 execution");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
