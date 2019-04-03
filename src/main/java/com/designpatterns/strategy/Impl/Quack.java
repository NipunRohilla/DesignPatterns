package com.designpatterns.strategy.Impl;

import com.designpatterns.strategy.QuackBehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
