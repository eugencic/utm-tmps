package Lab2.Sweets;

public class Skittles implements Sweet {
    private String productName;
    private String manufacturer;
    private boolean sugarFree;
    private double price;

    public void setProduct(String productName) {
        this.productName = productName;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() { return "\nProduct: " + productName + "\nManufacturer: " + sugarFree + "\nPrice : " + price + "$"; }
}