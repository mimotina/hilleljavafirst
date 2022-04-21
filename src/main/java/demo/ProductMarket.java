package demo;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMarket {
    public static void main(String[] args) {
        Product product1 = new Product("water", 10);
        Product product2 = new Product("sugar", 15);
        Product product3 = new Product("butter", 8);
        Product product4 = new Product("milk", 12);
        Product product5 = new Product("bread", 5);

        List<Product> products= List.of(product1,  product2, product3, product4, product5);


        List<String> productName = products.stream()
                .map(productData -> productData.getName())
                .collect(Collectors.toList());
        System.out.println("productName " + productName);

        List<String> productAbc = products.stream()
                .map(productData -> productData.getName()).sorted()
                .collect(Collectors.toList());
        System.out.println("products by abc " + productAbc);

        List<Product> priceHigh = products.stream()
                .filter(productData -> productData.getPrice() > 10 )
                .collect(Collectors.toList());
        System.out.println("priceHigh " + priceHigh);

        List<Product> priceLow = products.stream()
                .filter(productData -> productData.getPrice() < 0 )
                .collect(Collectors.toList());
        System.out.println("priceLow " + priceLow);

        List<String> pricesAll = products.stream()
                .map(priceAll -> Integer.toString(priceAll.getPrice()))
                .collect(Collectors.toList());
        System.out.println("pricesAll " + pricesAll);

    }
}
