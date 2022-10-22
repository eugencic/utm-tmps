# Topic: *Creational Design Patterns*
## Author: *Petici Marina*
## Task:

1. Choose an OO programming language and a suitable IDE or Editor (No frameworks/libs/engines allowed);
2. Select a domain area for the sample project;
3. Define the main involved classes and think about what instantiation mechanisms are needed;
4. Based on the previous point, implement atleast 3 creational design patterns in your project;

## Some Theory:
In software engineering, creational design patterns are a way of structuring code to make it more simple, maintainable and effective.

Some examples of this kind of design patterns are :

   * Singleton
   * Builder
   * Prototype
   * Object Pooling
   * Factory Method
   * Abstract Factory
   
## Implementation & Explanation:

The project is written in Java JDK 15.

Implemented creational design pattern used in this laboratory work are:
  1. Builder
  2. Singleton
  3. Factory Method
  4. Abstract Factory

### Builder
The builder is needed when:
- you want is to avoid using complex constructors (because long lists of parameters are confusing and do not give you much flexibility when creating a class);
- you want to move the construction of complex objects out of the constructor;
- you want to improve code scalability.

For this laboratory work, I created 4 Builders (JellyBeansBuilder.java, LollipopBuilder.java, MintBuilder.java, SourJellyBuilder.java), by that ensuring that I collect all information from 4 already existing classes (JellyBeans.java, Lollipop.java, Mint.java, SourJelly.java) (which I refactored) on the builder objects. 
```
    @Override
    public void setProduct(String productName) {
        this.mint.setProduct(productName);
    }

```
### Abstract Factory
The abstract factory pattern provides a way to encapsulate a group of individual factories that have a common theme without specifying their concrete classes.
Since I have two factory design patterns (HariboFactory and JellyBellyFactory), with AbstractFactory.java code I encapsulaed both of them.
```
public interface AbstractFactory {
    Candy sellCandy(String name);
}
```

### Singleton
The singleton pattern is a software design pattern that restricts the instantiation of a class to one "single" instance.
In this code it is used from this code example:
```
    private Singleton() {} 
  
    public static Singleton getInstance() 
    { 
        if (obj==null) 
            obj = new Singleton(); 
        return obj; 
    } 
```
And adapted for my code:
```
    private HariboFactory() {}

    public static JellyBellyFactory getJellyBellyInstance() {
        if (jellyBellyFactory == null)
            jellyBellyFactory = new JellyBellyFactory();
        return jellyBellyFactory;
    }
```
### Factory Method

The factory method pattern uses factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created.
In my project I created a factory to generate object of concrete classes based on given information by using if-else statements.
```
if (product.equals("sour jelly")) {
            SourJellyBuilder twixBuilder = new SourJellyBuilder();
            candySeller.makeHariboSourJelly(twixBuilder);
            return twixBuilder.getProduct();
        } else if (product.equals("jelly beans")) {
            SourJellyBuilder twixBuilder = new SourJellyBuilder();
            candySeller.makeHariboSourJelly(twixBuilder);
            return twixBuilder.getProduct();
```
## Results/Screenshots/Conclusions:
Main Online Candy Store Screen:


![alt text](https://github.com/marina01p/SDTM-Labs/blob/main/Lab%231/Screeshots/screen_1.png)


Searching for a product:


![alt text](https://github.com/marina01p/SDTM-Labs/blob/main/Lab%231/Screeshots/screen_2.png)


Buying the product:


![alt text](https://github.com/marina01p/SDTM-Labs/blob/main/Lab%231/Screeshots/screen_3.png)
