package StructuralDesignPatterns.Builders;

import StructuralDesignPatterns.Items.Sweets.Jawbreakers;

public class JawbreakersBuilder implements SweetBuilder {
    private Jawbreakers jawbreakers;
    public JawbreakersBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.jawbreakers = new Jawbreakers();
    }

    @Override
    public void setProduct(String productName) {
        this.jawbreakers.setProduct(productName);
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.jawbreakers.setManufacturer(manufacturer);
    }

    @Override
    public void setPrice(double price) {
        this.jawbreakers.setPrice(price);
    }

    public Jawbreakers getProduct() {
        Jawbreakers product = this.jawbreakers;
        this.reset();
        return product;
    }
}