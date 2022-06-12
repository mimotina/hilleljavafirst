package ithillel.ua.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasPage extends AbstractPage{
    private static final By SIGN_IN_SIGN_UP_BUTTON = By.xpath("//a[@class='header-bar-link -icon']");
    private static final By CONSULTATION_BUTTON = By.xpath("//*[@id='btn-consultation-hero']");

    private static final By EMAIL_INPUT_AUTH = By.xpath("/html/body/app-root/div/app-access/div/div[1]/app-login/div/div/form/div[1]/div/input");
    private static final  By PASSWORD_INPUT = By.xpath("//input[@type='password']");
    private static final  By ENTER_BUTTON = By.xpath("//button[@type='submit']");
    private static final By KHARKIV_LOCALIZATION = By.xpath("//*[@id='body']/div[1]/div[1]/div[1]/div/nav/a[4]");
    private static final By TESTING_COURSE = By.xpath("//*[@id=\"body\"]/div[1]/main/section[2]/div/div/div[1]/div/ul/li[2]");
    public BasPage(WebDriver driver){
    super(driver);
}

public WebElement getSignInSignUpButton(){
        return driver.findElement(SIGN_IN_SIGN_UP_BUTTON);
    }

public  WebElement getConsultationButton(){
        return  driver.findElement(CONSULTATION_BUTTON );
}
    public  WebElement getEmailInput() {
        return driver.findElement(EMAIL_INPUT_AUTH);
    }
    public  WebElement getPasswordInput() {
        return driver.findElement(PASSWORD_INPUT);
    }
    public  WebElement getEnterButton() {
        return driver.findElement(ENTER_BUTTON);
    }
    public  WebElement getLocalization() {
        return driver.findElement(KHARKIV_LOCALIZATION);
    }
    public  WebElement getCourse() {
        return driver.findElement(TESTING_COURSE);
    }

}
