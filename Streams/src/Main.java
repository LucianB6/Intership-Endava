import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class Main {
    static List<Shop> shops = new ArrayList<>();
    public void Upper(){
        shops.stream().map(shops -> shops.getShop().toUpperCase()).forEach(System.out::println);
    }
    public void openYear() {
        System.out.printf("Shops open after 2005: \n");
        shops.stream()
                .filter(shops -> shops.getYear() > 2005)
                .forEach(shops -> System.out.printf(shops.getShop() + "\n"));
    }
    public void cheapestProduct(){
        System.out.printf("Cheapest item is: \n");

        Optional<Products> products = shops.stream()
                .flatMap(shops -> shops.getProducts().stream())
                .min(Comparator.comparingInt(Products::getPrice));

        System.out.println(products + "\n");
    }
    public void sum(){
        System.out.println("Sum of all products is: \n");

        int sumOfItems = shops.stream()
                .flatMap(shops -> shops.getProducts().stream())
                .mapToInt(Products::getPrice).sum();

        System.out.println(sumOfItems + "\n");
    }
    public void concateneted(){
        System.out.printf("Separated: \n");

        String names = shops.stream()
                .map(Shop::getShop)
                .collect(joining(" | "));

        System.out.println(names + "\n");
    }
    public void listOfString(){
        System.out.print("List of products: \n");

        List<Products> products = shops.stream()
                .flatMap(shops -> shops.getProducts().stream()).toList();

        System.out.println(products + "\n");
    }

    public static void main(String[] args) {

        Main main = new Main();

        shops.add(new Shop("H&M", List.of(new Products("tricou", 20),new Products("pantaloni", 80)),2003));
        shops.add(new Shop("Zara", List.of(new Products("tricou", 10),new Products("pantaloni", 30)), 2006));

        main.Upper();
        main.openYear();
        main.cheapestProduct();
        main.sum();
        main.concateneted();
        main.listOfString();

        for (Shop shop:
             shops) {
            System.out.printf("Products: " + shop + "\n");
        }
    }
}
