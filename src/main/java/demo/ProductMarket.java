package demo;
import java.util.List;
import java.util.stream.Collectors;


public  class ProductMarket {

    private List<Product> products;
    ProductMarket(List<Product> products) {this.products = products ; }


      public List<String> productAbc() {
          return products
                  .stream()
                  .map(Product::getName).sorted()
                  .collect(Collectors.toList());
    }


    public List<String> productName () {
        return products
                .stream()
                .map(productData -> productData.getName().stripLeading())
                .collect(Collectors.toList());
       }

    public List<Product> priceHigh() {
        return products
                .stream()
                .filter(productData -> productData.getPrice() > 10)
                .collect(Collectors.toList());
       }

    public List<Product> priceLow(){
        return products
                .stream()
                .filter(productData -> productData.getPrice() < 0 )
                .collect(Collectors.toList());
        }

    public List<String> pricesAll(){
        return products.stream()
                .map(priceAll -> Integer.toString(priceAll.getPrice()))
                .collect(Collectors.toList());
        }

  }
