package BehavioralDesignPatterns.Items.Package;

public class GiftBox implements Package {
    private String name = "Gift Box";
    private boolean isBio = true;
    private double price = 2.35;

    public void setName(String name) {
        this.name = name;
    }
    public void setConstitution(boolean isBio) {
        this.isBio = isBio;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() { return "\nPackage: " + name + "\nBiodegradable: " + isBio + "\nPrice : " + price + "$"; }
}