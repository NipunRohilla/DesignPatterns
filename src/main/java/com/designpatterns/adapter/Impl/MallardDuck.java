package com.designpatterns.adapter.Impl;

import com.designpatterns.adapter.Duck;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("quack..");
    }

    @Override
    public void fly() {
        System.out.println("I am flying..");
    }
}
