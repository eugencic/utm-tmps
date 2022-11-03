package StructuralDesignPatterns.Decorator;

import StructuralDesignPatterns.Items.Sweets.Sweet;
import StructuralDesignPatterns.Factory.AbstractFactory;

public class AbstractFactoryDecorator implements AbstractFactory {
    protected AbstractFactory decorator;
    public AbstractFactoryDecorator(AbstractFactory abstractFactory) {
        this.decorator = abstractFactory;
    }
    public Sweet sellSweet(String type) {
        return decorator.sellSweet(type);
    }
}