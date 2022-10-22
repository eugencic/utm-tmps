package CreationalDesignPatterns.Factory;

import CreationalDesignPatterns.Sweets.Sweet;
public interface AbstractFactory {
    Sweet sellSweet(String name);
}
