package productTests;
import java.time.LocalDate;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("water", 10, LocalDate.of(2022,4,25));
        Product product2 = new Product("sugar", 15, LocalDate.of(2022,4,25));
        Product product3 = new Product("butter", 8, LocalDate.of(2022,4,25));
        Product product4 = new Product("milk", 12, LocalDate.of(2022,4,25));
        Product product5 = new Product("bread", 5,LocalDate.of(2022,4,25));

        ProductMarket productMarket = new ProductMarket(List.of(product1, product2, product3, product4, product5));
        System.out.println(productMarket.productAbc());
        System.out.println(productMarket.productName ());
        System.out.println(productMarket.priceHigh());
        System.out.println(productMarket.priceLow());
        System.out.println(productMarket.pricesAll());

    }

}