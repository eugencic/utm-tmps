package CreationalDesignPatterns;

import CreationalDesignPatterns.Builders.*;

public class SweetSeller {
    public void makeMarsTwix(TwixBuilder builder) {
        builder.reset();
        builder.setProduct("Twix");
        builder.setManufacturer("Mars");
        builder.setPrice(1.75);
    }

    public void makeMarsSkittles(SkittlesBuilder builder) {
        builder.reset();
        builder.setProduct("Skittles");
        builder.setManufacturer("Mars");
        builder.setPrice(2.35);
    }

    public void makeMarsButterscotch(ButterscotchBuilder builder) {
        builder.reset();
        builder.setProduct("Butterscotch");
        builder.setManufacturer("Mars");
        builder.setPrice(3.40);
    }

    public void makeMarsJawbreakers(JawbreakersBuilder builder) {
        builder.reset();
        builder.setProduct("Jawbreakers");
        builder.setManufacturer("Mars");
        builder.setPrice(0.5);
    }

    public void makeNestleTwix(TwixBuilder builder){
        builder.reset();
        builder.setProduct("Twix");
        builder.setManufacturer("Mars");
        builder.setPrice(1.75);
    }

    public void makeNestleSkittles(SkittlesBuilder builder){
        builder.reset();
        builder.setProduct("Skittles");
        builder.setManufacturer("Mars");
        builder.setPrice(2.35);
    }

    public void makeNestleButterscotch(ButterscotchBuilder builder){
        builder.reset();
        builder.setProduct("Butterscotch");
        builder.setManufacturer("Mars");
        builder.setPrice(3.40);
    }

    public void makeNestleJawbreakers(JawbreakersBuilder builder){
        builder.reset();
        builder.setProduct("Jawbreakers");
        builder.setManufacturer("Mars");
        builder.setPrice(0.5);
    }
}