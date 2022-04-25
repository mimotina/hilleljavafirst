package demo;

import java.util.List;
import java.util.stream.Collectors;



public  class ProductMarket {
    static Product product1 = new Product("water", 10);
    static Product product2 = new Product("sugar", 15);
    static Product product3 = new Product("butter", 8);
    static Product product4 = new Product("milk", 12);
    static Product product5 = new Product("bread", 5);

    static List<Product> products= List.of(product1,  product2, product3, product4, product5);

public static void productName() {
    List<String> productName = products.stream()
            .map(Product::getName).sorted()
            .collect(Collectors.toList());
     System.out.println("productName " + productName);
}


   public static void productAbc() {
        List<String> productAbc = products.stream()
                .map(productData -> productData.getName().stripLeading())
                .collect(Collectors.toList());
        System.out.println("products by abc " + productAbc); }

    public static void priceHigh() {
        List<Product> priceHigh = products.stream()
                .filter(productData -> productData.getPrice() > 10)
                .collect(Collectors.toList());
        System.out.println("priceHigh " + priceHigh); }

    public static void priceLow(){
        List<Product> priceLow = products.stream()
                .filter(productData -> productData.getPrice() < 0 )
                .collect(Collectors.toList());
        System.out.println("priceLow " + priceLow);}

    public static void pricesAll(){
        List<String> pricesAll = products.stream()
                .map(priceAll -> Integer.toString(priceAll.getPrice()))
                .collect(Collectors.toList());
        System.out.println("pricesAll " + pricesAll);}

  }
