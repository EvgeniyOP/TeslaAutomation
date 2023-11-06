package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.TestContext;

import java.time.Duration;
import java.util.Map;

import static support.TestContext.getDriver;

public class ModelSPage extends Page {


    //    Constructor
    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(1));
    Actions action = new Actions(getDriver());

    //    Fields
    @FindBy(xpath = "//a[@title='Order Now']/ancestor::div[@class='tcl-badges__button tcl-animate tcl-animate--to-reveal tcl-animate--revealed']")
    public WebElement orderNowModelS;
    @FindBy(xpath = "//button[@id='purchase_price']")
    public WebElement purchasePrice;
    @FindBy(xpath = "//span[contains(text(),'Model S Plaid')]")
    public WebElement modelSPlaid;
//    @FindBy(xpath = "//input[@id='PAINT_$PN01']")
    @FindBy(xpath = "//label[@for='PAINT_$PN01']")
    public WebElement greyPaint;
    @FindBy(xpath = "//label[@for='WHEELS_$WS12']")
    public WebElement wheels21;
    @FindBy(xpath = "//label[@for='INTERIOR_PACKAGE_$ICC00']")
    public WebElement creamInterior;
    @FindBy(xpath = "//label[@for='STEERING_WHEEL_$ST0Y']")
    public WebElement squareSteeringWheel;
    @FindBy(xpath = "//button[@aria-label='Select Option - Full Self-Driving Capability - $12,000']")
    public WebElement fullSelfDriving;
    @FindBy(xpath = "//input[@id='ACCESSORY:1457768-99-G']")
    public WebElement wallConnector;
    @FindBy(xpath = "//input[@id='ACCESSORY:1763817-99-A']")
    public WebElement mobileConnector;
    @FindBy(xpath = "//button[@data-id='continue-button']")
    public WebElement continueButton;
    @FindBy(xpath = "//span[contains(text(),'Model S')]/ancestor::h1")
    public WebElement modelSHeader;
    @FindBy(xpath = "//span[contains(text(),'Plaid Upgrades')]/ancestor::h2")
    public WebElement plaidUpgrades;
    @FindBy(xpath = "//span[contains(text(),'Wheels')]/ancestor::h2")
    public WebElement wheels;
    @FindBy(xpath = "//span[contains(text(),'Steering Control')]/ancestor::h3")
    public WebElement steeringControl;
    @FindBy(xpath = "//span[contains(text(),'Full Self-Driving Capability')]/ancestor::h2")
    public WebElement fullSelfDrivingCapability;
    @FindBy(xpath = "//button[@id='finplat.AUTO_LEASE:OPERATIONAL_LEASE:CT_PRIVATE']")
    public WebElement leaseBTN;
    @FindBy(xpath = "//h2[contains(text(),'Your Model S')]")
    public WebElement yourModelS;
    @FindBy(xpath = "//h2[contains(text(),'Get a Vehicle Earlier')]")
    public WebElement getAVehicleEarlier;
    @FindBy(xpath = "//button[@data-id='review-your-order-button']")
    public WebElement reviewYourOrder;
    @FindBy(xpath = "//button[@title='Order with Card']")
    public WebElement orderWithCard;
    @FindBy(xpath = "//input[@id='FIRST_NAME']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@id='LAST_NAME']")
    public WebElement lastName;
    @FindBy(xpath = "//input[@id='EMAIL']")
    public WebElement emailAddress;
    @FindBy(xpath = "//input[@id='EMAIL_CONFIRM']")
    public WebElement confirmEmailAddress;
    @FindBy(xpath = "//input[@id='PHONE_NUMBER']")
    public WebElement phoneNumber;
    @FindBy(xpath = "//h4[contains(text(),'Enter Account Details')]")
    public WebElement enterAccountDetails;
    @FindBy(xpath = "//input[@id='accessories-shipping']")
    public WebElement address;
    @FindBy(xpath = "//li[contains(text(),'64 Orange Drive, Marlboro, NJ, USA')]")
    public WebElement addressConfirmation;
    @FindBy(xpath = "//h4[contains(text(),'Shipping')]")
    public WebElement shipping;

    @FindBy(xpath = "//input[@label='Name on Card']")
    public WebElement nameOnCard;
    @FindBy(xpath = "//input[@label='Card Number']")
    public WebElement cardNumber;
    @FindBy(xpath = "//select[@label='Expiration Month']")
    public WebElement expMonthList;
    @FindBy(xpath = "//option[@value='07']")
    public WebElement expMonth;
    @FindBy(xpath = "//select[@label='Expiration Year']")
    public WebElement expYearList;
    @FindBy(xpath = "//option[@value='2027']")
    public WebElement expYear;
    @FindBy(xpath = "//input[@label='CVV']")
    public WebElement cvv;
    @FindBy(xpath = "//input[@label='Billing Zip Code']")
    public WebElement billingZipCode;

    @FindBy(xpath = "//button[@id='order-button']")
    public WebElement placeOrder;





    //    Methods
    public void clickOrderNow() throws InterruptedException {
        orderNowModelS.click();
        Thread.sleep(1000);
    }
    public void chooseOptions() throws InterruptedException {
        purchasePrice.click();
        modelSPlaid.click();
        Thread.sleep(1000);
        scrollDownPageFromModelSHeader();
        greyPaint.click();
        Thread.sleep(1000);
        scrollDownPageFromPlaidUpgrades();
        wheels21.click();
        Thread.sleep(1000);
        creamInterior.click();
        Thread.sleep(1000);
        scrollDownPageFromWheels();
        squareSteeringWheel.click();
        Thread.sleep(1000);
        scrollDownPageFromSteeringControl();
        fullSelfDriving.click();
        Thread.sleep(1000);
        scrollDownPageFromFullSelfDrivingCapability();
        wallConnector.click();
        Thread.sleep(1000);
        mobileConnector.click();
        Thread.sleep(1000);
    }
    public void scrollDownPageFromModelSHeader() throws InterruptedException {

        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(modelSHeader);
        new Actions(getDriver())
                .scrollFromOrigin(scrollOrigin, 0, 820)
                .perform();
        Thread.sleep(500);
    }
    public void scrollDownPageFromPlaidUpgrades() throws InterruptedException {

        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(plaidUpgrades);
        new Actions(getDriver())
                .scrollFromOrigin(scrollOrigin, 0, 820)
                .perform();
        Thread.sleep(500);
    }
    public void scrollDownPageFromWheels() throws InterruptedException {

        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(wheels);
        new Actions(getDriver())
                .scrollFromOrigin(scrollOrigin, 0, 780)
                .perform();
        Thread.sleep(500);
    }
    public void scrollDownPageFromSteeringControl() throws InterruptedException {

        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(steeringControl);
        new Actions(getDriver())
                .scrollFromOrigin(scrollOrigin, 0, 800)
                .perform();
        Thread.sleep(500);
    }
    public void scrollDownPageFromFullSelfDrivingCapability() throws InterruptedException {

        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(fullSelfDrivingCapability);
        new Actions(getDriver())
                .scrollFromOrigin(scrollOrigin, 0, 800)
                .perform();
        Thread.sleep(500);
    }
    public void clickContinueBTN() throws InterruptedException {
        continueButton.click();
        Thread.sleep(2000);
    }
    public void clickLease() throws InterruptedException {
        if (getAVehicleEarlier.isDisplayed()) {
            scrollDownPageFromGetAVehicleEarlier();
            reviewYourOrder.click(); }
        Thread.sleep(1000);
        leaseBTN.click();
        Thread.sleep(1000);
        scrollDownPageFromYourModelS();
        Thread.sleep(1000);
        }

    public void scrollDownPageFromYourModelS() throws InterruptedException {

        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(yourModelS);
        new Actions(getDriver())
                .scrollFromOrigin(scrollOrigin, 0, 800)
                .perform();
        Thread.sleep(500);
    }
    public void scrollDownPageFromGetAVehicleEarlier() throws InterruptedException {

        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(getAVehicleEarlier);
        new Actions(getDriver())
                .scrollFromOrigin(scrollOrigin, 0, 800)
                .perform();
        Thread.sleep(500);
    }
    public void clickOrderWithCard() throws InterruptedException {
        orderWithCard.click();
        Thread.sleep(2000);
    }
    public void scrollDownPageFromEnterAccountDetails() throws InterruptedException {

        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(enterAccountDetails);
        new Actions(getDriver())
                .scrollFromOrigin(scrollOrigin, 0, 400)
                .perform();
        Thread.sleep(500);
    }
    public void enterFirstName(String text) {
        firstName.click();
        firstName.sendKeys(text);
    }
    public void enterLastName(String text) {
        lastName.click();
        lastName.sendKeys(text);
    }
    public void enterEmail(String text) {
        emailAddress.click();
        emailAddress.sendKeys(text);
    }
    public void confirmEmail(String text) {
        confirmEmailAddress.click();
        confirmEmailAddress.sendKeys(text);
    }
    public void enterPhoneNumber(String text) {
        phoneNumber.click();
        phoneNumber.sendKeys(text);
    }
    public void enterAddress(String text) throws InterruptedException {
        address.click();
        address.sendKeys(text);
        Thread.sleep(1000);
        action.moveToElement(addressConfirmation).click().perform();
    }
    public void scrollDownPageFromShipping() throws InterruptedException {

        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(shipping);
        new Actions(getDriver())
                .scrollFromOrigin(scrollOrigin, 0, 800)
                .perform();
        Thread.sleep(500);
    }
//    public void enterNameOnCard(String text) throws InterruptedException {
//        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@class='payment-website ']")));
//        nameOnCard.click();
//        Thread.sleep(2000);
//        nameOnCard.clear();
//        Thread.sleep(2000);
//        nameOnCard.sendKeys(text);
//        Thread.sleep(2000);
//    }
    public void enterCardNumber(String text) throws InterruptedException {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@class='payment-website ']")));
        wait.until(ExpectedConditions.elementToBeClickable(cardNumber)).click();
        cardNumber.sendKeys(text);
    }
    public void clickExpMonth(String data) throws InterruptedException {

        wait.until(ExpectedConditions.elementToBeClickable(expMonthList)).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[@value='" + data + "']"))).click();
        Thread.sleep(2000);
    }
    public void clickExpYear(String data) throws  InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(expYearList)).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[@value='" + data + "']"))).click();
        Thread.sleep(4000);
    }
    public void enterCVV(String text) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(cvv)).click();
        cvv.sendKeys(text);
    }
    public void enterBillingZipCode(String text) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(billingZipCode)).click();
        billingZipCode.sendKeys(text);
        getDriver().switchTo().defaultContent();
    }
    public void clickPlaceOrder() throws InterruptedException {
        placeOrder.click();
        Thread.sleep(2000);
    }
}
