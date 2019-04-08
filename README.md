# DesignPatterns
This repository contains code to explain all types of design patterns
1. Strategy pattern:
Defines a family of algorithms encapsulating each one, and makes them interchangeable.
Strategy lets the algorithm vary independently from the clients that use it.

Use case:
Duck have fly and quack behaviour and a MallardDuck is a type of Duck but now--
A new Duck named ModelDuck has been introduced which quack & doesn't fly behaviour and
a new Behaviour FlyRocketPowered behaviour has been introduced by client which we want to provide at Run time to ModelDuck
in Main class.

2. Adapter Pattern:
The Adapter Pattern Convert the interface of a class into another interface clients expect.
Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.

Use case:
you want to use an existing class, and its interface doesn't match the one you need.
you want to create a reusable class that cooperates with unrelated or unforeseen classes, classes tht dont necessarily have compatible
interfaces.
you want to use several existing subclasses, but its impractical to adapt their interface by subclassing everyone.
An object adapter can adapt the interface of its parent class.

3. Decorator design pattern
Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending
functionality.

Use case:
Sometimes  we want to add responsibilities to individual objects, not to an entire class.
One way to add responsibilities is with inheritance and This is inflexible so more flexible approach is to
enclose a component in a decorator object that adds the responsibilities properly.

USe decorator:
-to add responsibilities to individual objects dynamically and transparently, that is , without affecting other objects.
-for responsibilities tht can be withdrawn.
-when extension by subclassing is impractical. Sometime a large no of independent extensions are possible and would produce
an explosion of subclasses to support every combination. Or a class definition may be hidden or otherwise available for subclassing.