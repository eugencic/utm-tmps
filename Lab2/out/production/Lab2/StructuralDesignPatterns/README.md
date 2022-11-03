# Laboratory Work No.2
## Topic: Structural Design Patterns
### Course: Software Design Techniques & Mechanisms Laboratory Works
### Author: Eugeniu Popa

## Objectives:
* Get familiar with the structural design patterns
* Choose a specific domain
* Implement at least 3 CDPs for the specific domain

## Theory
Structural design patterns are concerned with how classes and objects can be composed, to form larger structures. The structural design patterns simplifies the structure by identifying the relationships. These patterns focus on, how the classes inherit from each other and how they are composed of other classes.

There are following 7 types of structural design patterns:

* Adapter Pattern
  * Adapting an interface into another according to client expectation.

* Bridge Pattern
  * Separating abstraction (interface) from implementation.

* Composite Pattern
  * Allowing clients to operate on hierarchy of objects.

* Decorator Pattern
  * Adding functionality to an object dynamically.

* Facade Pattern
  * Providing an interface to a set of interfaces.

* Flyweight Pattern
  * Reusing an object by sharing it.

* Proxy Pattern
  * Representing another object.

## Implementation
The structural design patterns used in this laboratory work are:
1. Adapter
2. Decorator
3. Facade

### Adapter

Adapter pattern works as a bridge between two incompatible interfaces. This type of design pattern comes under structural pattern as this pattern combines the capability of two independent interfaces.

I created an interface (incompatible with my previous one - Sweet.java - Package.java - adapter, and two classes that implement this interface.

Then, I created the adapter itself PacketAdapter. It allows my code to have a subcategory in the sweet storage, which empowers the clients to buy packages.

```
public class PackageAdapter implements Package {
    private final Package pack;

    public PackageAdapter(Package packet){
        this.pack = packet;
    }

    @Override
    public String toString() {
        return pack.toString();
    }
```

### Decorator
Decorator pattern allows a user to add new functionality to an existing object without altering its structure. This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.

This pattern creates a decorator class which wraps the original class and provides additional functionality keeping class methods signature intact.

I created a decorator class AbstractFactoryDecorator.java and a concrete class FlavourDecorator. Those two wrap the original class and provide additional functionality keeping class methods signature intact and allow me to change the flavour and manufacturer of sweets, by that, allowing my code to have a special section of sweets.

```
    private final String customFlavour;

    public FlavourDecorator(AbstractFactory abstractFactory, String customFlavour) {
        super(abstractFactory);
        this.customFlavour = customFlavour;
    }
```

### Facade
Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system. This type of design pattern comes under structural pattern as this pattern adds an interface to existing system to hide its complexities.

I created a class SweetFacade.java, which allows the code to communicate with the Decorator design pattern classes. It provides a simplified method and delegates calls to these methods.

```
    private final AbstractFactory sweetFactory;

    public SweetFacade(AbstractFactory abstractFactory) { 
        this.sweetFactory = abstractFactory; 
    }
```
## Results
Implementing this design patterns into my code empowered me to extend its functionality.

Now with the help of decorator and facade, the client have a special section, with different flavours from different manufacturers.

![alt text](https://github.com/eugencic/utm-tmps-labs/blob/main/Lab2/src/StructuralDesignPatterns/Screenshots/1.png)

Adapter on the other hand, allows the client to choose a package after their shopping is done.

![alt text](https://github.com/eugencic/utm-tmps-labs/blob/main/Lab2/src/StructuralDesignPatterns/Screenshots/2.png)
