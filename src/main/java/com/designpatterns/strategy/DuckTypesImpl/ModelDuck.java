package com.designpatterns.strategy.DuckTypesImpl;

import com.designpatterns.strategy.Duck;
import com.designpatterns.strategy.DuckBehaviourImpl.FlyBehaviourImpl.FlyNoWay;
import com.designpatterns.strategy.DuckBehaviourImpl.QuackBehaviourImpl.Quack;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    protected void display() {
        System.out.println("I am a model duck...!");
    }
}
