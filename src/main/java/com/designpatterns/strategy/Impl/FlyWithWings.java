package com.designpatterns.strategy.Impl;

import com.designpatterns.strategy.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I am flying...!!");
    }
}
