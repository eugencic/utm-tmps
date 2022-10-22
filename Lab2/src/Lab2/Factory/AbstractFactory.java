package Lab2.Factory;

import Lab2.Sweets.Sweet;
public interface AbstractFactory {
    Sweet sellSweet(String name);
}
