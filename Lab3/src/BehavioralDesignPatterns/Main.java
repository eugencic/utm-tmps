package BehavioralDesignPatterns;

import BehavioralDesignPatterns.Adapter.PackageAdapter;
import BehavioralDesignPatterns.Facade.SweetFacade;
import BehavioralDesignPatterns.Factory.*;
import BehavioralDesignPatterns.Interpreter.Expression;
import BehavioralDesignPatterns.Items.Package.*;
import BehavioralDesignPatterns.Responsibilities.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static BehavioralDesignPatterns.Interpreter.Interpreter.buildInterpreterTree;

public class Main {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String SINGLE_DELIMITER = ANSI_BLUE + "--------------------------------" + ANSI_RESET;

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the sweet shop!");

        AbstractFactory marsFactory = MarsFactory.getMarsFactory();
        AbstractFactory nestleFactory = NestleFactory.getNestleFactory();

        SweetFacade sweetFacade = new SweetFacade(nestleFactory);

        PlasticBag plasticBag = new PlasticBag();
        GiftBox giftBox = new GiftBox();

        PackageAdapter plasticBagAdapter = new PackageAdapter(plasticBag);
        PackageAdapter giftBoxAdapter = new PackageAdapter(giftBox);

        while (true) {
            BufferedReader rsqLine = new BufferedReader(new InputStreamReader(System.in));

            System.out.println(SINGLE_DELIMITER);
            System.out.println("""
                            - f - Search for a product or factory
                            - r - View regular products
                            - s - View special products
                            - e - Exit
                            - o - Rate our store""");
            System.out.println(SINGLE_DELIMITER);

            String rsq = rsqLine.readLine();

            switch (rsq.toLowerCase()) {
                case "f" -> {
                    BufferedReader searchLine = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println(SINGLE_DELIMITER);
                    System.out.println("Search for a product or factory: ");
                    System.out.println(SINGLE_DELIMITER);

                    String searchProduct = searchLine.readLine();
                    Expression define = buildInterpreterTree();

                    switch (searchProduct.toLowerCase().replaceAll("\\s", "")) {
                        case "butterscotch":
                        case "jawbreakers":
                        case "skittles":
                        case "twix":
                            System.out.println("Your desired product - " + searchProduct + " - is currently ");
                            if (define.interpret(searchProduct)) {
                                System.out.println(ANSI_GREEN + "Available. Check it out!" + ANSI_RESET);
                            } else {
                                System.out.println(ANSI_RED + "Not available, sorry!" + ANSI_RESET);
                            }
                            break;
                        case "mars":
                        case "nestle":
                            System.out.println("Your desired factory - " + searchProduct + " - is currently ");
                            if (define.interpret(searchProduct)) {
                                System.out.println(ANSI_GREEN + "Available. Check it out!" + ANSI_RESET);
                            } else {
                                System.out.println(ANSI_RED + "Not available, sorry!" + ANSI_RESET);
                            }
                        default:
                            System.out.println(ANSI_RED + "Not available, sorry!" + ANSI_RESET);
                            break;
                    }
                }
                case "r" -> {
                    System.out.println("""
                            List of our factories:\s
                            1. Mars\s
                            2. Nestle""");
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
                case "e" -> {
                    System.out.println(SINGLE_DELIMITER);
                    System.out.println(ANSI_BLUE + "Thank you for choosing our sweet shop!" + ANSI_RESET);
                    System.out.println(SINGLE_DELIMITER);
                    System.exit(0);
                }
                case "o" -> {
                    System.out.println(SINGLE_DELIMITER);
                    System.out.println("Please rate our shop from 1 to 5: ");
                    System.out.println(SINGLE_DELIMITER);
                    BufferedReader reviewLine = new BufferedReader(new InputStreamReader(System.in));
                    String review = reviewLine.readLine();
                    Director director = new Director();
                    VP vp = new VP();
                    director.setSuccessor(vp);
                    switch (review) {
                        case "5":
                        case "4":
                        case "3":
                            System.out.println(SINGLE_DELIMITER);
                            Request request = new Request(RequestType.GOOD_REVIEW, 5);
                            director.handleRequest(request);
                            break;
                        case "2":
                        case "1":
                            request = new Request(RequestType.BAD_REVIEW, 2);
                            director.handleRequest(request);
                            break;
                        default:
                            System.out.println(ANSI_RED + "Wrong number of stars. Please try again." + ANSI_RESET);
                    }
                }
                default -> System.out.println(ANSI_RED + "Invalid command. Please try again." + ANSI_RESET);
            }
        }
    }
}