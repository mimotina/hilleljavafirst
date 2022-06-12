import ithillel.ua.driver.WebDriverCash;
import ithillel.ua.pages.BasPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestCoursePage {

        WebDriver webDriver = WebDriverCash.getDriver("chrome");
        BasPage basPage = new BasPage(webDriver);

        @Test
        public void clickCourse() {
            webDriver.get("https://ithillel.ua/");
            webDriver.manage().window().maximize();
            basPage.getCourse().click();

            String getUrl = webDriver.getCurrentUrl();
            Assert.assertEquals(getUrl, "https://ithillel.ua/courses/testing");

    }
}