package BehavioralDesignPatterns.Builders;

import BehavioralDesignPatterns.Items.Sweets.Butterscotch;

public class ButterscotchBuilder implements SweetBuilder {
    private Butterscotch butterscotch;
    public ButterscotchBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.butterscotch = new Butterscotch();
    }

    @Override
    public void setProduct(String productName) {
        this.butterscotch.setProduct(productName);
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.butterscotch.setManufacturer(manufacturer);
    }

    @Override
    public void setPrice(double price) {
        this.butterscotch.setPrice(price);
    }

    public Butterscotch getProduct() {
        Butterscotch product = this.butterscotch;
        this.reset();
        return product;
    }
}