package BehavioralDesignPatterns.Builders;

import BehavioralDesignPatterns.Items.Sweets.Twix;

public class TwixBuilder implements SweetBuilder {
    private Twix twix;
    public TwixBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.twix = new Twix();
    }

    @Override
    public void setProduct(String productName) {
        this.twix.setProduct(productName);
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.twix.setManufacturer(manufacturer);
    }

    @Override
    public void setPrice(double price) {
        this.twix.setPrice(price);
    }

    public Twix getProduct() {
        Twix product = this.twix;
        this.reset();
        return product;
    }
}