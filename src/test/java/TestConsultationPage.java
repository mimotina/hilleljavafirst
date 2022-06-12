import ithillel.ua.driver.WebDriverCash;
import ithillel.ua.pages.BasPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestConsultationPage extends DataTest{
    WebDriver webDriver = WebDriverCash.getDriver("chrome");
    BasPage basPage = new BasPage(webDriver);
    DataTest getData = new DataTest();
    private By NAME_INPUT = By.xpath("//input[@id='input-name-consultation']");
    private By EMAIL_INPUT = By.xpath("//input[@id='input-email-consultation']");
    private  By TEL_INPUT = By.xpath("//*[@id='input-tel-consultation']");
    private  By COURSE_LIST  = By.xpath("//button[@id='listbox-btn-input-course-consultation']");
    private By COURSE_NAME = By.xpath("//*[@data-entry-id='17065']");
    private By CHECKBOX = By.xpath("//*[@id='form-consultation']/div/footer/div[1]/label/span");
    private By MODAL_BUTTON = By.xpath("//*[@id='form-consultation']/div/footer/div[2]/button");

    @Test
    public void clickConsultationButton() throws InterruptedException {
        webDriver.get("https://ithillel.ua/");
        webDriver.manage().window().maximize();
        basPage.getConsultationButton().click();
        webDriver.findElement(NAME_INPUT).sendKeys(getData.firstName);
        webDriver.findElement(EMAIL_INPUT).sendKeys(getData.email);
        webDriver.findElement(TEL_INPUT).sendKeys(getData.phone);
        webDriver.findElement(COURSE_LIST).click();
        webDriver.findElement(COURSE_NAME).click();
        webDriver.findElement(CHECKBOX).click();
        webDriver.findElement(MODAL_BUTTON).click();

        webDriver.quit();

    }
}
