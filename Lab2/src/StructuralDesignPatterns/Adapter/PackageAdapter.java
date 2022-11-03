package StructuralDesignPatterns.Adapter;

import StructuralDesignPatterns.Items.Package.Package;

public class PackageAdapter implements Package {
    private final Package pack;
    public PackageAdapter(Package packet){
        this.pack = packet;
    }

    @Override
    public void setName(String name) {
    }

    @Override
    public void setConstitution(boolean isBio) {
    }

    @Override
    public void setPrice(double price) {
    }

    @Override
    public String toString() {
        return pack.toString();
    }
}