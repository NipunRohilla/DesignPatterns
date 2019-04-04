package com.designpatterns.strategy.DuckTypesImpl;

import com.designpatterns.strategy.Duck;
import com.designpatterns.strategy.DuckBehaviourImpl.FlyBehaviourImpl.FlyWithWings;
import com.designpatterns.strategy.DuckBehaviourImpl.QuackBehaviourImpl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    public void display(){
        System.out.println("I am a Mallard duck...!!");

    }
}
