package com.designpatterns.Decorator.Decorators;

import com.designpatterns.Decorator.Beverage;

public class Whip extends CondimentDecorator {

    protected Beverage beverage;

    public Whip(Beverage bvr){
        this.beverage = bvr;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+ ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
