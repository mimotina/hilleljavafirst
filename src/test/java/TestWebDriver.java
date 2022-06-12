import ithillel.ua.driver.WebDriverCash;
import org.junit.jupiter.api.Test;

public class TestWebDriver {
     @Test
    public  void getDriver() {
         WebDriverCash.getDriver("chrome").get("https://ithillel.ua/");
         WebDriverCash.getDriver("edge").get("https://ithillel.ua/");

    }
}
