package StructuralDesignPatterns.Builders;

import StructuralDesignPatterns.Items.Sweets.Skittles;

public class SkittlesBuilder implements SweetBuilder {
    private Skittles skittles;
    public SkittlesBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.skittles = new Skittles();
    }

    @Override
    public void setProduct(String productName) {
        this.skittles.setProduct(productName);
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.skittles.setManufacturer(manufacturer);
    }

    @Override
    public void setPrice(double price) {
        this.skittles.setPrice(price);
    }

    public Skittles getProduct() {
        Skittles product = this.skittles;
        this.reset();
        return product;
    }
}