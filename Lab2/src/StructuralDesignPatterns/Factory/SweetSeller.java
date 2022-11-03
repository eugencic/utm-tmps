package StructuralDesignPatterns.Factory;

import StructuralDesignPatterns.Builders.*;

public class SweetSeller {
    public SweetBuilder makeMarsTwix(TwixBuilder builder) {
        builder.reset();
        builder.setProduct("Twix");
        builder.setManufacturer("Mars");
        builder.setPrice(1.75);
        return builder;
    }

    public SweetBuilder makeMarsSkittles(SkittlesBuilder builder) {
        builder.reset();
        builder.setProduct("Skittles");
        builder.setManufacturer("Mars");
        builder.setPrice(2.35);
        return builder;
    }

    public SweetBuilder makeMarsButterscotch(ButterscotchBuilder builder) {
        builder.reset();
        builder.setProduct("Butterscotch");
        builder.setManufacturer("Mars");
        builder.setPrice(3.40);
        return builder;
    }

    public SweetBuilder makeMarsJawbreakers(JawbreakersBuilder builder) {
        builder.reset();
        builder.setProduct("Jawbreakers");
        builder.setManufacturer("Mars");
        builder.setPrice(0.5);
        return builder;
    }

    public SweetBuilder makeNestleTwix(TwixBuilder builder){
        builder.reset();
        builder.setProduct("Twix");
        builder.setManufacturer("Mars");
        builder.setPrice(1.75);
        return builder;
    }

    public SweetBuilder makeNestleSkittles(SkittlesBuilder builder){
        builder.reset();
        builder.setProduct("Skittles");
        builder.setManufacturer("Mars");
        builder.setPrice(2.35);
        return builder;
    }

    public SweetBuilder makeNestleButterscotch(ButterscotchBuilder builder){
        builder.reset();
        builder.setProduct("Butterscotch");
        builder.setManufacturer("Mars");
        builder.setPrice(3.40);
        return builder;
    }

    public SweetBuilder makeNestleJawbreakers(JawbreakersBuilder builder){
        builder.reset();
        builder.setProduct("Jawbreakers");
        builder.setManufacturer("Mars");
        builder.setPrice(0.5);
        return builder;
    }
}