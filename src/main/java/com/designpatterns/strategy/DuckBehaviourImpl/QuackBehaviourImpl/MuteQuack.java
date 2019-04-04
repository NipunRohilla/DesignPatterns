package com.designpatterns.strategy.DuckBehaviourImpl.QuackBehaviourImpl;

import com.designpatterns.strategy.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("<< SILENCE >>");
    }
}
