package definitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;
import pages.LoginPage;
import pages.MainPage;
import pages.ModelSPage;
import pages.Page;
import support.TestContext;
import java.awt.*;
import java.util.Map;


public class TeslaStepDefs extends Page {

    MainPage mainPage = new MainPage();
    Page page = new Page();
    LoginPage loginPage = new LoginPage();
    ModelSPage modelSPage = new ModelSPage();

    public TeslaStepDefs() throws AWTException {
    }

    @And("I Verifying title is {string}")
    public void iVerifyingTitleIs(String expectedTitle) {
        Assertions.assertThat(page.getTitle()).isEqualTo(expectedTitle);
        System.out.println("Title is - " + page.getTitle());
    }

    @Then("I verify elements visibility on main page")
    public void iVerifyElementsVisibilityOnMainPage() throws InterruptedException {

//      >>>>>>>>>>  Header <<<<<<<<<<
        mainPage.logoVerification();
        mainPage.bannerHeader1Verfication();
        mainPage.bannerHeader2Verfication();
        mainPage.bannerLinkVerfication();
        mainPage.vehicleSpanVerification();
        mainPage.energySpanVerification();
        mainPage.chargingSpanVerification();
        mainPage.discoverSpanVerification();
        mainPage.shopSpanVerification();
        mainPage.supportIconVerification();
        mainPage.localizationIconVerification();
        mainPage.accountIconVerification();

//      >>>>>>>>>> Model Y <<<<<<<<<<
        mainPage.modelYHeaderVerification();
        mainPage.modelYLeasingStartingVerification();
//        mainPage.modelYStartingPriceVerification();
//        mainPage.modelYAfterFederalVerification();
        mainPage.modelYOrderNowVerification();
        mainPage.modelYDemoDriveVerification();
//        mainPage.modelYPriceBeforeVerification();
//        mainPage.modelYLearnAboutVerification();
        mainPage.modelYExcludesTaxesAndFeesVerification();
        mainPage.modelYSeeDetailsVerification();

//      >>>>>>>>>> Scroll Down <<<<<<<<<<
        mainPage.scrollDownPageWhite();

//      >>>>>>>>>> Model 3 <<<<<<<<<<
        mainPage.model3HeaderVerification();
        mainPage.model3LeasingStartingVerification();
        mainPage.model3OrderNowVerification();
        mainPage.model3DemoDriveVerification();
        mainPage.model3ExcludesTaxesVerification();
        mainPage.model3SeeDetailsVerification();

//      >>>>>>>>>> Scroll Down <<<<<<<<<<
        mainPage.scrollDownPageWhite();

//      >>>>>>>>>> Model X <<<<<<<<<<
        mainPage.modelXHeaderVerification();
        mainPage.modelXStartingPriceVerification();
        mainPage.modelXAfterFederalVerification();
        mainPage.modelXOrderNowVerification();
        mainPage.modelXDemoDriveVerification();
        mainPage.modelXPriceBeforeVerification();
        mainPage.modelXLearnAboutVerification();

//      >>>>>>>>>> Scroll Down <<<<<<<<<<
        mainPage.scrollDownPageBlack();

//      >>>>>>>>>> Model S <<<<<<<<<<
        mainPage.modelSHeaderVerification();
        mainPage.modelSStartingPriceVerification();
        mainPage.modelSAfterEstGasSavingsVerification();
        mainPage.modelSOrderNowVerification();
        mainPage.modelSDemoDriveVerification();
        mainPage.modelSPriceBeforeSavingsVerification();
        mainPage.modelSLearnAboutVerification();

//      >>>>>>>>>> Scroll Down <<<<<<<<<<
        mainPage.scrollDownPageBlack();

//      >>>>>>>>>> Experience Tesla <<<<<<<<<<
        mainPage.expTeslaHeaderVerification();
        mainPage.scheduleADemoDriveVerification();
        mainPage.demoDriveExpTeslaVerification();

//      >>>>>>>>>> Scroll Down <<<<<<<<<<
        mainPage.scrollDownPageWhite();

//      >>>>>>>>>> Solar Panels <<<<<<<<<<
        mainPage.solarPanelsHeaderVerification();
        mainPage.scheduleAVirtualConsultationVerification();
        mainPage.orderNowSolarPanelsVerification();
        mainPage.learnMoreSolarPanelsVerification();

//      >>>>>>>>>> Scroll Down <<<<<<<<<<
        mainPage.scrollDownPageBlack();

//      >>>>>>>>>> Solar Roof <<<<<<<<<<
        mainPage.solarRoofHeaderVerification();
        mainPage.produceCleanEnergyVerification();
        mainPage.orderNowSolarRoofVerification();
        mainPage.learnMoreSolarRoofVerification();

//      >>>>>>>>>> Scroll Down <<<<<<<<<<
        mainPage.scrollDownPageBlack();

//      >>>>>>>>>> PowerWall <<<<<<<<<<
        mainPage.powerWallHeaderVerification();
        mainPage.orderNowPowerWallVerification();
        mainPage.learnMorePowerWallVerification();

//      >>>>>>>>>> Scroll Down <<<<<<<<<<
        mainPage.scrollDownPageBlack();

//      >>>>>>>>>> Accessories <<<<<<<<<<
        mainPage.accessoriesHeaderVerification();
        mainPage.shopNowAccessoriesVerification();

//      >>>>>>>>>> Scroll Down <<<<<<<<<<
        mainPage.scrollDownPageBlack();

//      >>>>>>>>>> Footer Elements <<<<<<<<<<
        mainPage.copyRightsVerification();
        mainPage.privacyAndLegalVerification();
        mainPage.vehiclesRecallVerification();
        mainPage.contactVerification();
        mainPage.newsVerification();
        mainPage.getUpdatesVerification();
        mainPage.locationsVerification();
    }

    @And("I Verifying presence of elements in modal panel")
    public void iVerifyingPresenceOfElementsInModalPanel() throws InterruptedException {

//      >>>>>>>>>> Vehicle Modal Panel <<<<<<<<<<
        mainPage.hoverOnVehicle();
        mainPage.hoverOnModelSImg();
        mainPage.modelSImgVerification();
        mainPage.modelSPanelHeaderVerification();
        mainPage.modelSPanelLearnVerification();
        mainPage.modelSPanelOrderVerification();
        mainPage.model3ImgVerification();
        mainPage.model3PanelHeaderVerification();
        mainPage.model3PanelLearnVerification();
        mainPage.model3PanelOrderVerification();
        mainPage.modelXImgVerification();
        mainPage.modelXPanelHeaderVerification();
        mainPage.modelXPanelLearnVerification();
        mainPage.modelXPanelOrderVerification();
        mainPage.modelYImgVerification();
        mainPage.modelYPanelHeaderVerification();
        mainPage.modelYPanelLearnVerification();
        mainPage.modelYPanelOrderVerification();
        mainPage.helpMeChooseImgVerification();
        mainPage.helpMeChooseHeaderVerification();
        mainPage.getStartedPanelVerification();
        mainPage.inventoryPanelVerification();
        mainPage.usedCarsPanelVerification();
        mainPage.demoDrivePanelVerification();
        mainPage.tradeInPanelVerification();
        mainPage.helpMeChoosePanelVerification();
        mainPage.comparePanelVerification();
        mainPage.fleetPanelVerification();
        mainPage.cyberTruckPanelVerification();
        mainPage.semiPanelVerification();
        mainPage.roadsterPanelVerification();

//      >>>>>>>>>> Energy Modal Panel <<<<<<<<<<
        mainPage.hoverOnEnergy();
        mainPage.hoverOnSolarPanelImg();
        mainPage.solarPanelImgVerification();
        mainPage.solarPanelHeaderModalVerification();
        mainPage.solarPanelLearnModalVerification();
        mainPage.solarPanelOrderModalVerification();
        mainPage.solarRoofImgModalVerification();
        mainPage.solarRoofHeaderModalVerification();
        mainPage.solarRoofLearnModalVerification();
        mainPage.solarRoofOrderModalVerification();
        mainPage.powerWallImgModalVerification();
        mainPage.powerWallHeaderModalVerification();
        mainPage.powerWallLearnModalVerification();
        mainPage.powerWallOrderModalVerification();
        mainPage.megaPackImgModalVerification();
        mainPage.megaPackHeaderModalVerification();
        mainPage.megaPackLearnModalVerification();
        mainPage.megaPackOrderModalVerification();
        mainPage.scheduleAConsultationModalVerification();
        mainPage.whySolarModalVerification();
        mainPage.incentivesModalVerification();
        mainPage.supportModalVerification();
        mainPage.partnerWithTeslaModalVerification();
        mainPage.commercialModalVerification();
        mainPage.utilitiesModalVerification();

//      >>>>>>>>>> Energy Modal Panel <<<<<<<<<<
        mainPage.hoverOnCharging();
        mainPage.hoverOnChargingImg();
        mainPage.chargingImgModalVerification();
        mainPage.chargingHeaderModalVerification();
        mainPage.chargingLearnModalVerification();
        mainPage.homeChargingImgModalVerification();
        mainPage.homeChargingHeaderModalVerification();
        mainPage.homeChargingLearnModalVerification();
        mainPage.homeChargingShopModalVerification();
        mainPage.superchargingImgModalVerification();
        mainPage.superchargingHeaderModalVerification();
        mainPage.superchargingLearnModalVerification();
        mainPage.superchargingFindModalVerification();
        mainPage.chargingCalculatorModalVerification();
        mainPage.tripPlannerModalVerification();
        mainPage.superchargerVotingModalVerification();
        mainPage.hostASuperchargerModalVerification();
        mainPage.commercialChargingModalVerification();
        mainPage.hostWallConnectorsModalVerification();

//      >>>>>>>>>> Discover Modal Panel <<<<<<<<<<
        mainPage.hoverOnDiscover();
        mainPage.hoverOnInsurance();
        mainPage.resourcesModalVerification();
        mainPage.locationServicesModalVerification();
        mainPage.companyModalVerification();
        mainPage.demoDriveDiscoverVerification();
        mainPage.insuranceDiscoverVerification();
        mainPage.videoGuideDiscoverVerification();
        mainPage.customersStoriesDiscoverVerification();
        mainPage.eventsDiscoverVerification();
        mainPage.findUsDiscoverVerification();
        mainPage.tripPlannerDiscoverVerification();
        mainPage.findACollisionCenterDiscoverVerification();
        mainPage.findACertifiedInstallerDiscoverVerification();
        mainPage.aboutDiscoverVerification();
        mainPage.careersDiscoverVerification();
        mainPage.investorRelationsDiscoverVerification();

//      >>>>>>>>>> Discover Modal Panel <<<<<<<<<<
        mainPage.hoverOnShop();
        mainPage.hoverOnChargingImgShop();
        mainPage.chargingImgShopVerification();
        mainPage.chargingHeaderShopVerification();
        mainPage.vehicleAccessoriesImgShopVerification();
        mainPage.vehicleAccessoriesHeaderShopVerification();
        mainPage.apparelImgShopVerification();
        mainPage.apparelHeaderShopVerification();
        mainPage.lifeStyleImgShopVerification();
        mainPage.lifeStyleHeaderShopVerification();
    }

    @And("I login with valid {string} credentials")
    public void iLoginWithAnd(String userData) throws InterruptedException {
        Map<String, String> data = TestContext.getDataFromFile(userData + ".yml");
        mainPage.clickAccount();
        loginPage.iFillOutEmail(data.get("valid email"));
        loginPage.clickOnRecaptchaCheckBox();
        loginPage.clickNextSignIn();
        loginPage.clickOnRecaptchaCheckBox2();
        loginPage.iFillOutPassword(data.get("valid password"));
        loginPage.clickNextSignIn();
        loginPage.iVerifyIMLogedInAndTitleIs("Tesla Account | Tesla");
        loginPage.iClickLogOutBTN();
    }

    @And("I verify I'm log in and title is {string}")
    public void iVerifyIMLogInAndTitleIs(String expectedTitle) {
        loginPage.iVerifyIMLogedInAndTitleIs(expectedTitle);
    }

    @Then("I login with invalid email and valid password {string}")
    public void iLoginWithInvalidEmailAndValidPassword(String userData) throws InterruptedException {
        Map<String, String> data = TestContext.getDataFromFile(userData + ".yml");
        mainPage.clickAccount();
        loginPage.iFillOutEmail(data.get("invalid email"));
        loginPage.clickNextSignIn();
        loginPage.iFillOutPassword(data.get("valid password"));
        loginPage.clickNextSignIn();
    }

    @Then("{string} message should be displayed")
    public void messageShouldBeDisplayed(String message) {
        loginPage.iVerifyAlertMessage(message);
        loginPage.goingBackToMainPage();
    }

    @Then("I login with valid email and invalid password {string}")
    public void iLoginWithValidEmailAndInvalidPassword(String userData) throws InterruptedException {
        Map<String, String> data = TestContext.getDataFromFile(userData + ".yml");
        mainPage.clickAccount();
        loginPage.iFillOutEmail(data.get("valid email"));
        loginPage.clickNextSignIn();
        loginPage.iFillOutPassword(data.get("invalid password"));
        loginPage.clickNextSignIn();
    }

    @Then("I login with invalid email and invalid password {string}")
    public void iLoginWithInvalidEmailAndInvalidPassword(String userData) throws InterruptedException {
        Map<String, String> data = TestContext.getDataFromFile(userData + ".yml");
        mainPage.clickAccount();
        loginPage.iFillOutEmail(data.get("invalid email"));
        loginPage.clickNextSignIn();
        loginPage.iFillOutPassword(data.get("invalid password"));
        loginPage.clickNextSignIn();
    }

    @Then("I navigate to ModelS page")
    public void iNavigateToModelSPage() throws InterruptedException {
        mainPage.hoverOnVehicle();
        mainPage.clickOnModelSImg();
    }

    @And("I click Order Now button")
    public void iClickOrderNowButton() throws InterruptedException {
        modelSPage.clickOrderNow();
    }

    @Then("I choose options")
    public void iChooseOptions() throws InterruptedException {
        modelSPage.chooseOptions();
    }

    @And("I click Continue")
    public void iClickContinue() throws InterruptedException {
        modelSPage.clickContinueBTN();
    }

    @Then("I select financing option")
    public void iSelectFinancingOption() throws InterruptedException {
        modelSPage.clickLease();
    }

    @And("I click Order with Card")
    public void iClickOrderWithCard() throws InterruptedException {
        modelSPage.clickOrderWithCard();
    }

    @Then("I fill out Account Details from {string}")
    public void iFillOutAccountDetailsFrom(String userData) throws InterruptedException {
        Map<String, String> data = TestContext.getDataFromFile(userData + ".yml");
        modelSPage.scrollDownPageFromEnterAccountDetails();
        modelSPage.enterFirstName(data.get("first name"));
        modelSPage.enterLastName(data.get("last name"));
        modelSPage.enterEmail(data.get("valid email"));
        modelSPage.confirmEmail(data.get("valid email"));
        modelSPage.enterPhoneNumber(data.get("phone"));
    }

    @Then("I fill out Shipping details from {string}")
    public void iFillOutShippingDetailsFrom(String userData) throws InterruptedException {
        Map<String, String> data = TestContext.getDataFromFile(userData + ".yml");
        modelSPage.scrollDownPageFromEnterAccountDetails();
        modelSPage.enterAddress(data.get("address"));
        Thread.sleep(2000);
    }

    @Then("I fill out Card details from {string}")
    public void iFillOutCardDetailsFrom(String userData) throws InterruptedException {
        Map<String, String> data = TestContext.getDataFromFile(userData + ".yml");
        modelSPage.scrollDownPageFromShipping();
        modelSPage.enterCardNumber(data.get("card number"));
        modelSPage.clickExpMonth(data.get("expiration month"));
        modelSPage.clickExpYear(String.valueOf(data.get("expiration year")));
        modelSPage.enterCVV(String.valueOf(data.get("cvv")));
        modelSPage.enterBillingZipCode(data.get("billing zip code"));
    }

    @And("I click Place Order")
    public void iClickPlaceOrder() throws InterruptedException {
        modelSPage.clickPlaceOrder();
    }
}


