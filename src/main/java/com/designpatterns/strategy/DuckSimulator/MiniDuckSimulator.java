package com.designpatterns.strategy.DuckSimulator;

import com.designpatterns.strategy.Duck;
import com.designpatterns.strategy.DuckBehaviourImpl.FlyBehaviourImpl.FlyRocketPowered;
import com.designpatterns.strategy.DuckTypesImpl.MallardDuck;
import com.designpatterns.strategy.DuckTypesImpl.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        // ModelDuck has FlyRocketBehaviour
        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
