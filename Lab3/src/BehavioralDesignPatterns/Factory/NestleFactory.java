package BehavioralDesignPatterns.Factory;

import BehavioralDesignPatterns.Builders.ButterscotchBuilder;
import BehavioralDesignPatterns.Builders.JawbreakersBuilder;
import BehavioralDesignPatterns.Builders.SkittlesBuilder;
import BehavioralDesignPatterns.Builders.TwixBuilder;
import BehavioralDesignPatterns.Items.Sweets.Sweet;

public class NestleFactory implements AbstractFactory {
    private NestleFactory() {
    }
    private static volatile NestleFactory nestleFactory;
    private final SweetSeller sweetSeller = new SweetSeller();
    public static NestleFactory getNestleFactory() {
        if (nestleFactory == null)
            nestleFactory = new NestleFactory();
        return nestleFactory;
    }

    @Override
    public Sweet sellSweet(String product) {
        switch (product) {
            case "twix":
                TwixBuilder twixBuilder = new TwixBuilder();
                sweetSeller.makeNestleTwix(twixBuilder);
                return twixBuilder.getProduct();
            case "skittles":
                SkittlesBuilder skittlesBuilder = new SkittlesBuilder();
                sweetSeller.makeNestleSkittles(skittlesBuilder);
                return skittlesBuilder.getProduct();
            case "butterscotch":
                ButterscotchBuilder butterscotchBuilder = new ButterscotchBuilder();
                sweetSeller.makeNestleButterscotch(butterscotchBuilder);
                return butterscotchBuilder.getProduct();
            case "jawbreakers":
                JawbreakersBuilder jawbreakersBuilder = new JawbreakersBuilder();
                sweetSeller.makeNestleJawbreakers(jawbreakersBuilder);
                return jawbreakersBuilder.getProduct();
            default:
                return null;
        }
    }
}