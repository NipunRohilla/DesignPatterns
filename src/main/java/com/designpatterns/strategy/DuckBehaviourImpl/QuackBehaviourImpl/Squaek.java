package com.designpatterns.strategy.DuckBehaviourImpl.QuackBehaviourImpl;

import com.designpatterns.strategy.QuackBehaviour;

public class Squaek implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squaek");
    }
}
