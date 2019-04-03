package com.designpatterns.strategy.Impl;

import com.designpatterns.strategy.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I cant fly..!");
    }
}
