package com.designpatterns.Decorator;

import com.designpatterns.Decorator.Decorators.Mocha;
import com.designpatterns.Decorator.Decorators.Whip;

public class StarBuzzCoffee {
    public static void main(String[] args) {

        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage= new Whip(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
