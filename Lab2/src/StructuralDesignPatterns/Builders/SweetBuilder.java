package StructuralDesignPatterns.Builders;

public interface SweetBuilder {
    void reset();
    void setProduct(String productName);
    void setManufacturer(String manufacturer);
    void setPrice(double price);
}