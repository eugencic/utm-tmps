package StructuralDesignPatterns.Items.Package;

public class PlasticBag implements Package {
    private String name = "Plastic Bag";
    private boolean isBio = false;
    private double price = 1.25;

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