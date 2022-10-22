package Lab2.Factory;

import Lab2.Builders.*;
import Lab2.Sweets.Sweet;
import Lab2.SweetSeller;
public class MarsFactory implements AbstractFactory {
    private MarsFactory() {
    }
    private static MarsFactory marsFactory;
    private final SweetSeller sweetSeller = new SweetSeller();
    public static MarsFactory getMarsInstance() {
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
