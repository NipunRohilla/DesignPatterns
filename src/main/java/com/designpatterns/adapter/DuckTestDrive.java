package com.designpatterns.adapter;

import com.designpatterns.adapter.Impl.MallardDuck;
import com.designpatterns.adapter.Impl.TurkeyAdapter;
import com.designpatterns.adapter.Impl.WildTurkey;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck =  new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Duck says...");

        testDuck(duck);

        System.out.println("The Turkey adapter says...");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.fly();
        duck.quack();
    }
}
