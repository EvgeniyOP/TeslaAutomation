package pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

import static support.TestContext.getDriver;

public class LoginPage extends Page {
//    Constructor

    ModelSPage modelSPage = new ModelSPage();

    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(1));


//    Fields
    @FindBy(xpath = "//input[@id='form-input-identity']")
    public WebElement emailField;
    @FindBy(xpath = "//button[@id='form-submit-continue']")
    public WebElement nextButtonSignIn;
    @FindBy(xpath = "//input[@id='form-input-credential']")
    public WebElement passwordField;
    @FindBy(xpath = "//div[@class='recaptcha-checkbox-borderAnimation']")
    public WebElement recaptchaCheckBox;
    @FindBy(xpath = "//input[@id='robot-checkbox']/ancestor::div[@class='sec-container']")
    public WebElement robotCheckBox;
    @FindBy(xpath = "//div[@id='progress-button']")
    public WebElement proceed;
    @FindBy(xpath = "//div[contains(text(),'Dashboard')]")
    public WebElement dashboard;

    @FindBy(xpath = "//div[contains(text(),'recognize this sign in combination')]")
    public WebElement alertMessage;
    @FindBy(xpath = "//a[@aria-label='Tesla Logo']")
    public WebElement logo;
    @FindBy(id = "dx-nav-item--account")
    public WebElement accountIcon;







    //----------------------------------------Dashboard----------------------------------------

    @FindBy(xpath = "//a[@href='/teslaaccount/owner-xp/auth/logout?redirect=true&locale=en_US']")
    public WebElement logOutBTN;

    public LoginPage() throws AWTException {
    }


    //    Methods
    public void iFillOutEmail(String text) throws InterruptedException {
        emailField.click();
        emailField.sendKeys(text);
        wait.until(ExpectedConditions.elementToBeClickable(nextButtonSignIn));

    }
    public void clickOnRecaptchaCheckBox() throws InterruptedException {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@title='reCAPTCHA']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='recaptcha-anchor']"))).click();
        getDriver().switchTo().defaultContent();

        Thread.sleep(2000);
    }
    public void clickNextSignIn() throws InterruptedException {
        nextButtonSignIn.click();
        wait.until(ExpectedConditions.elementToBeClickable(passwordField));
    }
    public void clickOnRecaptchaCheckBox2() throws InterruptedException {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@id='sec-cpt-if']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='robot-checkbox']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='progress-button']"))).click();
        getDriver().switchTo().defaultContent();
        Thread.sleep(40000);
    }
    public void iFillOutPassword(String text) throws InterruptedException {
        passwordField.click();
        passwordField.sendKeys(text);
        wait.until(ExpectedConditions.visibilityOf(dashboard));
    }
    public void iVerifyIMLogedInAndTitleIs(String expectedTitle) {
        Assertions.assertThat(getDriver().getTitle()).isEqualTo(expectedTitle);
        System.out.println("Title is - " + getDriver().getTitle().toString() + ">>> True");
    }
    public void iClickLogOutBTN() {
        logOutBTN.click();
    }
    public void iVerifyAlertMessage(String message) {
        String alert = alertMessage.getText();
        if (alert.equals(message)) {
            System.out.println("Alert message is: We don't recognize this sign in combination >>> True");
        } else {
            System.out.println("Alert message is NOT: We don't recognize this sign in combination >>>>>>>>>>>>>>> False");
        }
    }
    public void goingBackToMainPage() {
        logo.click();
        wait.until(ExpectedConditions.elementToBeClickable(accountIcon));
    }



}
