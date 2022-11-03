package StructuralDesignPatterns.Factory;

import StructuralDesignPatterns.Items.Sweets.Sweet;

public interface AbstractFactory {
    Sweet sellSweet(String name);
}