package Lab2.Factory;

import Lab2.Builders.*;
import Lab2.Sweets.Sweet;
import Lab2.SweetSeller;

public class NestleFactory implements Lab2.Factory.AbstractFactory {

    private static NestleFactory nestleFactory;
    private final SweetSeller sweetSeller = new SweetSeller();

    public static NestleFactory getNestleInstance() {
        if (nestleFactory == null)
            nestleFactory = new NestleFactory();
        return nestleFactory;
    }

    private NestleFactory() {
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