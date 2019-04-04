package com.designpatterns.adapter.Impl;

import com.designpatterns.adapter.Duck;
import com.designpatterns.adapter.Turkey;

public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i=0; i<5;i++){
            turkey.fly();
        }
    }
}
