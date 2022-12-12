package BehavioralDesignPatterns.Decorator;

import BehavioralDesignPatterns.Items.Sweets.Sweet;
import BehavioralDesignPatterns.Factory.AbstractFactory;

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