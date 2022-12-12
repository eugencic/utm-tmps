package BehavioralDesignPatterns.Adapter;

import BehavioralDesignPatterns.Items.Sweets.Sweet;
import BehavioralDesignPatterns.Items.Package.Package;

public class PackageAdapter implements Sweet {
    private final Package pack;
    public PackageAdapter(Package packet){
        this.pack = packet;
    }

    @Override
    public void setProduct(String productName) {
    }

    @Override
    public void setManufacturer(String manufacturer) {
    }

    @Override
    public void setPrice(double price) {
    }

    @Override
    public String toString() {
        return pack.toString();
    }

    @Override
    public void setFlavour(String flavour) {
    }
}