# Topic: Creational Design Patterns
### Course: Software Design Techniques & Mechanisms Laboratory Works
### Author: Eugeniu Popa

## Objectives
Implement at least 3 creational design patterns in a project.

## Theory
In software engineering, creational design patterns are design patterns that deal with object creation mechanisms, trying to create objects in a manner suitable to the situation. The basic form of object creation could result in design problems or added complexity to the design. Creational design patterns solve this problem by somehow controlling this object creation.

* Abstract Factory
  - Creates an instance of several families of classes
* Builder
  - Separates object construction from its representation
* Factory Method
  - Creates an instance of several derived classes 
* Object Pool
  - Avoid expensive acquisition and release of resources by recycling objects that are no longer in use
* Prototype
  - A fully initialized instance to be copied or cloned
* Singleton
  - A class of which only a single instance can exist

## Implementation
The creational design patterns used in this laboratory work are:
  1. Abstract Factory
  2. Builder
  3. Factory Method
  4. Singleton

### Abstract Factory
Abstract factory is a creational design pattern that provides a way to encapsulate a group of individual factories that have a common theme, without specifying their concrete classes.

Since I have two factory design patterns (MarsFactory and NestleFactory), with AbstractFactory.java code, I encapsulated both of them.
```
public interface AbstractFactory {
    Sweet sellSweet(String name);
}
```

### Builder
Builder pattern aims to “Separate the construction of a complex object from its representation so that the same construction process can create different representations.” It is used to construct a complex object step by step and the final step will return the object.

For this laboratory work, I created 4 Builders (ButterscotchBuilder.java, JawbreakersBuilder.java, SkittlesBuilder.java, TwixBuilder.java), to ensure that I collect all the information from the four already existing classes (Butterscotch.java, Jawbreakers.java, Skittles.java, Twix.java) (which are refactored) on the builder objects. 
```
    @Override
    public void setProduct(String productName) {
        this.butterscotch.setProduct(productName);
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.butterscotch.setManufacturer(manufacturer);
    }

    @Override
    public void setPrice(double price) {
        this.butterscotch.setPrice(price);
    }
```

### Factory Method
Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

In this project I created a factory to generate object of concrete classes based on given information by using switch statements.
```
        switch (product) {
            case "twix":
                TwixBuilder twixBuilder = new TwixBuilder();
                sweetSeller.makeMarsTwix(twixBuilder);
                return twixBuilder.getProduct();
            case "skittles":
                SkittlesBuilder skittlesBuilder = new SkittlesBuilder();
                sweetSeller.makeMarsSkittles(skittlesBuilder);
                return skittlesBuilder.getProduct();
            case "butterscotch":
                ButterscotchBuilder butterscotchBuilder = new ButterscotchBuilder();
                sweetSeller.makeMarsButterscotch(butterscotchBuilder);
                return butterscotchBuilder.getProduct();
            case "jawbreakers":
                JawbreakersBuilder jawbreakersBuilder = new JawbreakersBuilder();
                sweetSeller.makeMarsJawbreakers(jawbreakersBuilder);
                return jawbreakersBuilder.getProduct();
            default:
                return null;
        }
```

### Singleton
The singleton pattern is a software design pattern that restricts the instantiation of a class to one "single" instance.
In this code it is used from this code example:
```
    private Singleton() {} 
    public static Singleton getInstance() { 
        if (obj == null) 
            obj = new Singleton(); 
        return obj; 
    } 
```
And adapted for my code:
```
    private MarsFactory() {}
    public static MarsFactory getMarsInstance() {
        if (marsFactory == null)
            marsFactory = new MarsFactory();
        return marsFactory;
    }
```

## Output Example:
### Sweet Shop:
### Searching for a product:
### Buying the product:
![alt text]()
