package BehavioralDesignPatterns.Factory;

import BehavioralDesignPatterns.Items.Sweets.Sweet;

public interface AbstractFactory {
    Sweet sellSweet(String name);
}