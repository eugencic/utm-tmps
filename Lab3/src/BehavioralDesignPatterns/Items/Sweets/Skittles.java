package BehavioralDesignPatterns.Items.Sweets;

public class Skittles implements Sweet {
    private String productName;
    private String manufacturer;
    private double price;
    private String flavour = "Sugar";

    public void setProduct(String productName) { this.productName = productName; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }
    public void setPrice(double price) { this.price = price; }
    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }
    public String toString() { return "\nProduct: " + productName + "\nManufacturer: " + manufacturer + "\nPrice : " + price + "$" + "\nFlavour: " + flavour; }
}