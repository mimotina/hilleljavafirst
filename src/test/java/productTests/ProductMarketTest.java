package productTests;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;


public class ProductMarketTest {
    private  static ProductMarket productMarket;

    @BeforeSuite
    public static void setUp() {
        Product product1 = new Product("water", 10, LocalDate.of(2022,4,25));
        Product product2 = new Product("sugar", 15, LocalDate.of(2022,4,25));
        Product product3 = new Product("butter", 8, LocalDate.of(2022,4,25));
        Product product4 = new Product("milk", 12, LocalDate.of(2022,4,25));
        Product product5 = new Product("bread", 5,LocalDate.of(2022,4,25));

        productMarket = new ProductMarket(List.of(product1, product2, product3, product4, product5));
    }

    @Test(groups = {"smoke", "regression"})
    public void testProductName (){
        List<String> expectedResult  = List.of("water", "sugar", "butter", "milk", "bread");
        Assert.assertTrue(productMarket.productName().contains("water"), "Product list doesn't have water");
        assertNotNull(productMarket.productName());
        assertTrue(!productMarket.productName().isEmpty(), "Product List is Empty");
        assertEquals(expectedResult ,productMarket.productName());
            }

    @Test(groups = {"smoke", "regression"})
    public void testPricesAll (){
        ArrayList<Integer> expectedResult  = new ArrayList<>();
        expectedResult.add(10);
        expectedResult.add(15);
        expectedResult.add(8);
        expectedResult.add(12);
        expectedResult.add(5);

        System.out.println(expectedResult);
            assertNotNull(productMarket.pricesAll());
            assertTrue(!productMarket.pricesAll().isEmpty(), "Product List is Empty");
            assertEquals(expectedResult, productMarket.pricesAll());

    }

    @Test(groups = {"smoke", "regression"})
    public void testProductAbc (){
        List<String> expectedResult  = List.of("bread", "butter", "milk", "sugar", "water");
                assertTrue(productMarket.productAbc().contains("water"), "Product list doesn't have water");
                assertNotNull(productMarket.productAbc());
                assertTrue(!productMarket.productAbc().isEmpty(), "Product List is Empty");
                assertEquals(expectedResult ,productMarket.productAbc());

    }

   @Test(groups = {"smoke", "regression"})
    public void testPriceHigh(){
        Product product2 = new Product("sugar", 15, LocalDate.of(2022,4,25));
        Product product4 = new Product("milk", 12, LocalDate.of(2022,4,25));
        ArrayList<String> expectedResult  = new ArrayList<>();
        expectedResult.add(String.valueOf(product2));
        expectedResult.add(String.valueOf(product4));
        System.out.println(expectedResult);

        assertTrue(productMarket.priceHigh().toString().contains("sugar"), "Product list doesn't have sugar");
        assertNotNull(productMarket.priceHigh());
        assertTrue(!productMarket.priceHigh().isEmpty(), "Product List is Empty");
        assertEquals(expectedResult ,productMarket.priceHigh());

    }


}



