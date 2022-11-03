package StructuralDesignPatterns;

import StructuralDesignPatterns.Adapter.PackageAdapter;
import StructuralDesignPatterns.Items.Package.*;
import StructuralDesignPatterns.Facade.SweetFacade;
import StructuralDesignPatterns.Factory.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the sweet shop!");

        AbstractFactory marsFactory = MarsFactory.getMarsFactory();
        AbstractFactory nestleFactory = NestleFactory.getNestleFactory();

        SweetFacade sweetFacade = new SweetFacade(nestleFactory);

        PlasticBag plasticBag = new PlasticBag();
        GiftBox giftBox = new GiftBox();

        PackageAdapter plasticBagAdapter = new PackageAdapter(plasticBag);
        PackageAdapter giftBoxAdapter = new PackageAdapter(giftBox);

        BufferedReader line1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 'r' for regular products, 's' for special products or 'q' to quit the shop: ");
        String firstLine = line1.readLine();

        switch (firstLine.toLowerCase()) {
            case "r" -> {
                System.out.println("List of our factories: \n" + "1. Mars \n" + "2. Nestle");
                System.out.println("Enter the desired factory: ");
                BufferedReader productLine = new BufferedReader(new InputStreamReader(System.in));
                String factoryName = productLine.readLine();
                switch (factoryName) {
                    case "mars" -> {
                        System.out.println("Mars Company");
                        System.out.println(marsFactory.sellSweet("butterscotch").toString());
                        System.out.println(marsFactory.sellSweet("jawbreakers").toString());
                        System.out.println(marsFactory.sellSweet("skittles").toString());
                        System.out.println(marsFactory.sellSweet("twix").toString());
                        System.out.println("Confirm your purchase with 'c' or exit the shop with 'e': ");
                        BufferedReader confirmLine = new BufferedReader(new InputStreamReader(System.in));
                        String confirmName = confirmLine.readLine();
                        switch (confirmName) {
                            case "c" -> {
                                System.out.println("Packages");
                                System.out.println(giftBoxAdapter);
                                System.out.println(plasticBagAdapter);
                                BufferedReader packageLine = new BufferedReader(new InputStreamReader(System.in));
                                System.out.println("\nEnter the desired package: ");
                                String packetName = packageLine.readLine();
                                switch (packetName) {
                                    case "gift box" ->
                                            System.out.println("Thank you for your purchasing with an eco friendly bag!");
                                    case "plastic bag" -> System.out.println("Thank you for your purchase!");
                                    default -> System.out.println("You chose an invalid package");
                                }
                            }
                            case "e" -> System.out.println("Thank you for choosing our store. Have a nice day!");
                            default -> System.out.println("Invalid letter");
                        }
                    }
                    case "nestle" -> {
                        System.out.println("Nestle Company");
                        System.out.println(nestleFactory.sellSweet("butterscotch").toString());
                        System.out.println(nestleFactory.sellSweet("jawbreakers").toString());
                        System.out.println(nestleFactory.sellSweet("skittles").toString());
                        System.out.println(nestleFactory.sellSweet("twix").toString());
                        System.out.println("Confirm your purchase with 'c' or exit the shop with 'e': ");
                        BufferedReader confirmLine1 = new BufferedReader(new InputStreamReader(System.in));
                        String confirmName1 = confirmLine1.readLine();
                        switch (confirmName1.toLowerCase()) {
                            case "c" -> {
                                System.out.println("Packages");
                                System.out.println(giftBoxAdapter);
                                System.out.println(plasticBagAdapter);
                                BufferedReader packageLine = new BufferedReader(new InputStreamReader(System.in));
                                System.out.println("\nEnter the desired package: ");
                                String packetName = packageLine.readLine();
                                switch (packetName) {
                                    case "gift box" ->
                                            System.out.println("Thank you for your purchasing with an eco friendly bag!");
                                    case "plastic bag" -> System.out.println("Thank you for your purchase!");
                                    default -> System.out.println("You chose an invalid package");
                                }
                            }
                            case "e" -> System.out.println("Thank you for choosing our store. Have a nice day!");
                            default -> System.out.println("Invalid letter");
                        }
                    }
                    default -> System.out.println("Invalid words");
                }
            }
            case "s" -> {
                System.out.println("\nSpecial Products");
                System.out.println(sweetFacade.getSweet("butterscotch", "Butter", "Tootsie Roll"));
                System.out.println(sweetFacade.getSweet("jawbreakers", "Tropical", "Mondelez International"));
                System.out.println(sweetFacade.getSweet("skittles", "Blueberry", "General Mills"));
                System.out.println(sweetFacade.getSweet("twix", "Hazelnuts", "Sour Patch"));
                System.out.println("Confirm your purchase with 'c' or exit the shop with 'e': ");
                BufferedReader confirmLine2 = new BufferedReader(new InputStreamReader(System.in));
                String confirmName2 = confirmLine2.readLine();
                switch (confirmName2.toLowerCase()) {
                    case "c" -> {
                        System.out.println("Packages");
                        System.out.println(giftBoxAdapter);
                        System.out.println(plasticBagAdapter);
                        BufferedReader packageLine = new BufferedReader(new InputStreamReader(System.in));
                        System.out.println("\nEnter the desired package: ");
                        String packetName = packageLine.readLine();
                        switch (packetName) {
                            case "gift box" ->
                                    System.out.println("Thank you for your purchasing with an eco friendly bag!");
                            case "plastic bag" -> System.out.println("Thank you for your purchase!");
                            default -> System.out.println("You chose an invalid package");
                        }
                    }
                    case "e" -> System.out.println("Thank you for choosing our store. Have a nice day!");
                    default -> System.out.println("Invalid letter");
                }
            }
            case "q" -> System.out.println("Thank you for choosing our store. Have a nice day!");
        }
    }
}