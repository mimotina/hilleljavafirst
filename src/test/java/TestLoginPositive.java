import ithillel.ua.driver.WebDriverCash;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class TestLoginPositive  {

    WebDriver webDriver = WebDriverCash.getDriver("chrome");


    @Test
    public void clickSignIn() {
        webDriver.get("https://lms.ithillel.ua/");
        webDriver.manage().window().maximize();
        Cookie getCookie = new Cookie("token", "s%3APqgVKGhd-lmQlNLD5-07o6QECr7BMkZp.et%2Bf7P3t5EfCuj%2BvIIDx7MWZTzDWSfIzNRyRaNkGE8I");
        webDriver.manage().addCookie(getCookie);
        webDriver.quit();

    }
}