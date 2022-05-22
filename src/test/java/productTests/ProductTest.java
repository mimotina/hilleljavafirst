package productTests;
import org.testng.Assert;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.LocalDate;

public class ProductTest {
   private Product product;

    @BeforeTest(alwaysRun = true)
    public  void setUp() {
        product = new Product("milk", 10, LocalDate.of(2022, 5, 28));
    }


    @Test(groups = {"smoke", "regression"})
    public  void testIsFreshPositive(){
    Assert.assertTrue(product.isFresh(), "Product is not fresh " + product.getDueDate());
}

    @Test(groups = {"smoke", "regression"})
    public void testName() {
        String expectedResult = "milk";
        String actualResult = product.getName();
        Assert.assertEquals(expectedResult, actualResult, "Fail: Actual name is 'milk' ");
    }

    @Test(groups = {"smoke", "regression"})
    public void testPrice() {
        Assert.assertEquals(product.getPrice(), 10);

    }
}