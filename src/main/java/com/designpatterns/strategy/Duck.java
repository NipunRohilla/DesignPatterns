package com.designpatterns.strategy;

public abstract class Duck {
    /* The Fly behaviour and Quack behaviour are required to put in interfaces as the different implementation classes of the Duck class
    * may not have all the features and it will be waste of code to implement all the behaviour where ever not required.
    * Also, code reuse is not strictly followed.
    * */
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    abstract void display();

    public Duck(){}

    /* The setter will help to achieve the behaviours to implement at Runtime*/
    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    /* The performFly and performQuack is used to call the actual behaviour. */
    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void swim(){
        System.out.println("All ducks float even decoys..!");
    }
}
