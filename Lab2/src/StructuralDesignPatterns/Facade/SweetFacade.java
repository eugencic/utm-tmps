package StructuralDesignPatterns.Facade;

import StructuralDesignPatterns.Items.Sweets.Sweet;
import StructuralDesignPatterns.Decorator.AbstractFactoryDecorator;
import StructuralDesignPatterns.Decorator.FlavourDecorator;
import StructuralDesignPatterns.Factory.AbstractFactory;

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