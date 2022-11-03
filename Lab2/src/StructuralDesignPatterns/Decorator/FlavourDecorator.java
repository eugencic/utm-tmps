package StructuralDesignPatterns.Decorator;

import StructuralDesignPatterns.Items.Sweets.Sweet;
import StructuralDesignPatterns.Factory.AbstractFactory;

public class FlavourDecorator extends AbstractFactoryDecorator {
    private final String customFlavour;

    public FlavourDecorator(AbstractFactory abstractFactory, String customFlavour) {
        super(abstractFactory);
        this.customFlavour = customFlavour;
    }

    @Override
    public Sweet sellSweet(String type) {
        Sweet sweet = super.sellSweet(type);
        sweet.setFlavour(this.customFlavour);
        return sweet;
    }
}