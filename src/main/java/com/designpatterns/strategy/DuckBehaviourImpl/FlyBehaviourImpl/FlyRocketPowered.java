package com.designpatterns.strategy.DuckBehaviourImpl.FlyBehaviourImpl;

import com.designpatterns.strategy.FlyBehaviour;

public class FlyRocketPowered implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I am flying with a Rocket...!!");
    }
}
