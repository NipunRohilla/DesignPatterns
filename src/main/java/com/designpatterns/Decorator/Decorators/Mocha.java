package com.designpatterns.Decorator.Decorators;

import com.designpatterns.Decorator.Beverage;

public class Mocha extends CondimentDecorator {

    protected Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
