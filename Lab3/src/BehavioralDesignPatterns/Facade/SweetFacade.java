package BehavioralDesignPatterns.Facade;

import BehavioralDesignPatterns.Items.Sweets.Sweet;
import BehavioralDesignPatterns.Decorator.AbstractFactoryDecorator;
import BehavioralDesignPatterns.Decorator.FlavourDecorator;
import BehavioralDesignPatterns.Factory.AbstractFactory;

public class SweetFacade {
    private final AbstractFactory sweetFactory;

    public SweetFacade(AbstractFactory abstractFactory) { this.sweetFactory = abstractFactory; }

    public Sweet getSweet(String type, String customFlavour, String manufacturer) {
        AbstractFactoryDecorator customizer = new FlavourDecorator(sweetFactory, customFlavour);
        Sweet customSweet = customizer.sellSweet(type);
        customSweet.setManufacturer(manufacturer);
        return customSweet;
    }
}