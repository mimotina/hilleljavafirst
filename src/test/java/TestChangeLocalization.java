import ithillel.ua.driver.WebDriverCash;
import ithillel.ua.pages.BasPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestChangeLocalization {
    WebDriver webDriver = WebDriverCash.getDriver("chrome");
    BasPage basPage = new BasPage(webDriver);

    @Test
    public void clickLocalization(){
        webDriver.get("https://ithillel.ua/");
        webDriver.manage().window().maximize();
        basPage.getLocalization().click();
        String getUrl = webDriver.getCurrentUrl();
        Assert.assertEquals(getUrl, "https://kharkiv.ithillel.ua/");

    }

}
