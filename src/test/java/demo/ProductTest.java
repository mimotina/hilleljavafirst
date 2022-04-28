package demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ProductTest {
    private static Product product;

    @BeforeAll
    public static void setUp() {
        product = new Product("milk", 10, LocalDate.of(2022, 4, 30));
    }

@Test
    public void testIsFreshPositive(){
    Assertions.assertTrue(product.isFresh(), "Product is not fresh " + product.getDueDate());
}

    @Test
    public void testName() {
        String expectedResult = "milk";
        String actualResult = product.getName();
        Assertions.assertEquals(expectedResult, actualResult, "Fail: Actual name is 'milk' ");
    }

    @Test
    public void testPrice() {
        Integer expectedResult = 10;
        int actualResult = product.getPrice();
        Assertions.assertEquals(expectedResult, actualResult, "Fail: Actual name is 10 ");

    }
}