package CreationalDesignPatterns;

import CreationalDesignPatterns.Factory.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the sweet shop!\n");
        System.out.println("Type of sweets: \n" + "1. Chewy \n" + "2. Hard");
        System.out.println("Enter the desired type of sweet: ");
        BufferedReader productInput = new BufferedReader(new InputStreamReader(System.in));
        String productName = productInput.readLine();
        System.out.println("List of our factories: \n" + "1. Mars \n" + "2. Nestle");
        System.out.println("Enter the desired factory : ");
        BufferedReader factoryInput = new BufferedReader(new InputStreamReader(System.in));
        String factoryName = factoryInput.readLine();
        AbstractFactory marsFactory = MarsFactory.getMarsInstance();
        AbstractFactory nestleFactory = NestleFactory.getNestleInstance();

        switch (productName.toLowerCase()) {
            case "chewy":
                switch (factoryName.toLowerCase()) {
                    case "mars":
                        System.out.println("Chewy Sweets\n");
                        System.out.println("Mars Company\n");
                        System.out.println(marsFactory.sellSweet("twix").toString());
                        System.out.println(marsFactory.sellSweet("skittles").toString());
                        break;
                    case "nestle":
                        System.out.println("Chewy Sweets\n");
                        System.out.println("Nestle Company\n");
                        System.out.println(nestleFactory.sellSweet("twix").toString());
                        System.out.println(nestleFactory.sellSweet("skittles").toString());
                        break;
                    default:
                        System.out.println("You entered an invalid factory.");
                        System.exit(0);
                }
                break;
            case "hard":
                switch (factoryName.toLowerCase()) {
                    case "mars":
                        System.out.println("Hard Sweets");
                        System.out.println("Mars Company");
                        System.out.println(marsFactory.sellSweet("butterscotch").toString());
                        System.out.println(marsFactory.sellSweet("jawbreakers").toString());
                        break;
                    case "nestle":
                        System.out.println("Hard Sweets");
                        System.out.println("Nestle Company");
                        System.out.println(nestleFactory.sellSweet("butterscotch").toString());
                        System.out.println(nestleFactory.sellSweet("jawbreakers").toString());
                        break;
                    default:
                        System.out.println("You entered an invalid factory.");
                        System.exit(0);
                }
                break;
            default:
                System.out.println("You entered an invalid product.");
                System.exit(0);
        }

        BufferedReader purchaseLine = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nEnter the desired product type and name of the factory (product name, factory name): ");
        String purchased = purchaseLine.readLine();

        String n = "\nYour purchase: ";
        String m = "\nThank you for your purchase!";

        switch (purchased.toLowerCase().replace(",", "")) {
            case "twix mars":
                System.out.println(n);
                System.out.println(marsFactory.sellSweet("twix").toString());
                System.out.println(m);
                break;
            case "twix nestle":
                System.out.println(n);
                System.out.println(nestleFactory.sellSweet("twix").toString());
                System.out.println(m);
                break;
            case "skittles mars":
                System.out.println(n);
                System.out.println(marsFactory.sellSweet("skittles").toString());
                System.out.println(m);
                break;
            case "skittles nestle":
                System.out.println(n);
                System.out.println(nestleFactory.sellSweet("skittles").toString());
                System.out.println(m);
                break;
            case "butterscotch mars":
                System.out.println(n);
                System.out.println(marsFactory.sellSweet("butterscotch").toString());
                System.out.println(m);
                break;
            case "butterscotch nestle":
                System.out.println(n);
                System.out.println(nestleFactory.sellSweet("butterscotch").toString());
                System.out.println(m);
                break;
            case "jawbreakers mars":
                System.out.println(n);
                System.out.println(marsFactory.sellSweet("jawbreakers").toString());
                System.out.println(m);
                break;
            case "jawbreakers nestle":
                System.out.println(n);
                System.out.println(nestleFactory.sellSweet("jawbreakers").toString());
                System.out.println(m);
                break;
            default:
                System.out.println("Invalid product name.");
                System.exit(0);
        }
    }
}