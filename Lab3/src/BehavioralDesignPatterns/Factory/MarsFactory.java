package BehavioralDesignPatterns.Factory;

import BehavioralDesignPatterns.Builders.ButterscotchBuilder;
import BehavioralDesignPatterns.Builders.JawbreakersBuilder;
import BehavioralDesignPatterns.Builders.SkittlesBuilder;
import BehavioralDesignPatterns.Builders.TwixBuilder;
import BehavioralDesignPatterns.Items.Sweets.Sweet;

public class MarsFactory implements AbstractFactory {
    private MarsFactory() {
    }
    private static volatile MarsFactory marsFactory;
    private final SweetSeller sweetSeller = new SweetSeller();
    public static MarsFactory getMarsFactory() {
        if (marsFactory == null)
            marsFactory = new MarsFactory();
        return marsFactory;
    }

    @Override
    public Sweet sellSweet(String product) {
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
    }
}