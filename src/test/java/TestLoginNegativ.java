import ithillel.ua.driver.WebDriverCash;
import ithillel.ua.pages.BasPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestLoginNegativ extends DataTest{
    WebDriver webDriver = WebDriverCash.getDriver("chrome");
    BasPage basPage = new BasPage(webDriver);
    DataTest getData = new DataTest();

    @Test
    public void clickEnter() {
        webDriver.get("https://lms.ithillel.ua/auth");
        webDriver.manage().window().maximize();
        basPage.getEmailInput().sendKeys(getData.email);
        basPage.getPasswordInput().sendKeys(getData.password);
        basPage.getEnterButton().click();

        webDriver.quit();
    }
}
