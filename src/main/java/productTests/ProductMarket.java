package productTests;
import java.util.List;
import java.util.stream.Collectors;


public  class ProductMarket {

    private  List<Product> products;

    public ProductMarket(List<Product> products) {
        this.products = products;
    }

    public static void add(int i) {
    }

    public List<String> productAbc() {
        return products
                .stream()
                .map(Product::getName).sorted()
                .collect(Collectors.toList());
    }

    public List<String> productName() {
        return products
                .stream()
                .map(productData -> productData.getName().stripLeading())
                .collect(Collectors.toList());
    }

    public List<Product> priceHigh() {
        return products
                .stream()
                .filter(priceHigh -> priceHigh.getPrice() > 10)
                .collect(Collectors.toList());
    }

    public List<Product> priceLow() {
        return products
                .stream()
                .filter(productData -> productData.getPrice() < 0)
                .collect(Collectors.toList());
    }

    public List<Integer> pricesAll() {
        return products.stream()
                .map(priceAll -> priceAll.getPrice())
                .collect(Collectors.toList());
    }
}

