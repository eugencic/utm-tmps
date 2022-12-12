package BehavioralDesignPatterns.Decorator;

import BehavioralDesignPatterns.Items.Sweets.Sweet;
import BehavioralDesignPatterns.Factory.AbstractFactory;

public class AbstractFactoryDecorator implements AbstractFactory {
    protected AbstractFactory decorator;
    public AbstractFactoryDecorator(AbstractFactory abstractFactory) {
        this.decorator = abstractFactory;
    }
    public Sweet sellSweet(String type) {
        return decorator.sellSweet(type);
    }
}