package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.*;
import java.time.Duration;
import static support.TestContext.getDriver;

public class MainPage extends Page {
    Page page = new Page();
    LoginPage loginPage = new LoginPage();
    ModelSPage modelSPage = new ModelSPage();
    Actions action = new Actions(getDriver());
    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(1));


//    Constructor


//    Fields
    @FindBy(xpath = "//div[@class='tds-text--h5 tds--no_padding tcl-text--header']")
    public WebElement bannerHeader1;
    @FindBy(xpath = "//p[@class='tds-text--body tds--no_padding tcl-text--body']")
    public WebElement bannerHeader2;
    @FindBy(xpath = "//a[contains(text(),'Eligibility Details')]/ancestor::p")
    public WebElement bannerLink;

    @FindBy(xpath = "//a[@aria-label='Tesla Logo']")
    public WebElement logo;
    @FindBy(id = "dx-nav-item--vehicles")
    public WebElement vehicleSpan;
    @FindBy(id = "dx-nav-item--energy")
    public WebElement energySpan;
    @FindBy(id = "dx-nav-item--charging")
    public WebElement chargingSpan;
    @FindBy(id = "dx-nav-item--discover")
    public WebElement discoverSpan;
    @FindBy(id = "dx-nav-item--shop")
    public WebElement shopSpan;
    @FindBy(id = "dx-nav-item--support")
    public WebElement supportIcon;
    @FindBy(id = "dx-nav-item--locale-selector")
    public WebElement localizationIcon;
    @FindBy(id = "dx-nav-item--account")
    public WebElement accountIcon;

    //  >>>>>>>>>> Header <<<<<<<<<<
    @FindBy(xpath = "//h1[@class='tcl-homepage-hero__heading tds-colorscheme--dark']")
    public WebElement headerWhite;
    @FindBy(xpath = "//h1[@class='tcl-homepage-hero__heading tds-colorscheme--light']")
    public WebElement headerBlack;

    //  >>>>>>>>>> Model Y <<<<<<<<<<
    @FindBy(xpath = "//h1[contains(text(),'Model Y')][1]")
    public WebElement modelYHeader;
    @FindBy(xpath = "//p[contains(text(),'Lease starting at $399/mo*')][1]")
    public WebElement modelYLeasingStarting;
    @FindBy(xpath = "//strong[contains(text(),'$32,890')][1]")
    public WebElement modelYStartingPrice;
    @FindBy(xpath = "//body[1]/div[5]/main[1]/div[1]/div[2]/div[1]/section[1]/div[1]/p[1]/sub[1]/small[1]")
    public WebElement afterFederalModelYText;
    @FindBy(xpath = "//body[1]/div[5]/main[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/section[1]/a[1]/span[1]")
    public WebElement orderNowModelY;
    @FindBy(xpath = "//body[1]/div[5]/main[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/section[1]/a[2]/span[1]")
    public WebElement demoDriveModelY;
    @FindBy(xpath = "//p[contains(text(),'*Excludes taxes and fees with price')][1]")
    public WebElement modelYExcludesTaxesAndFees;
    @FindBy(xpath = "//a[@href='/modely/design?financeModalTab=finance_options#overview'][1]")
    public WebElement modelYSeeDetails;
    @FindBy(xpath = "//p[contains(text(),'$43,990')][1]")
    public WebElement priceBeforeIncentivesModelY;
    @FindBy(xpath = "//body/div[5]/main[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[3]/p[1]/a[1]")
    public WebElement learnAboutEstModelY;

    //  >>>>>>>>>> Model 3 <<<<<<<<<<
    @FindBy(xpath = "//h1[contains(text(),'Model 3')][1]")
    public WebElement model3Header;
    @FindBy(xpath = "//strong[contains(text(),'$28,490')][1]")
    public WebElement model3StartingPrice;
    @FindBy(xpath = "//p[contains(text(),'Lease starting at $329/mo*')][1]")
    public WebElement model3LeasingStarting;
    @FindBy(xpath = "//body[1]/div[5]/main[1]/div[1]/div[2]/div[1]/section[1]/div[1]/p[2]/sub[1]/small[1]")
    public WebElement afterFederalModel3Text;
    @FindBy(xpath = "//a[@href='/model3/design#overview' and @title='Order Now']")
    public WebElement orderNowModel3;
    @FindBy(xpath = "//a[@href='/drive?selectedModel=model3' and @title='Demo Drive']")
    public WebElement demoDriveModel3;
    @FindBy(xpath = "//p[contains(text(),'$38,990')][1]")
    public WebElement priceBeforeIncentivesModel3;
    @FindBy(xpath = "//body[1]/div[5]/main[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[3]/p[1]/a[1]")
    public WebElement learnAboutEstModel3;
    @FindBy(xpath = "//p[contains(text(),'*Excludes taxes and fees with price subject to change. Available in select states.')]")
    public WebElement excludeTaxesModel3;
    @FindBy(xpath = "//a[@href='/model3/design?financeModalTab=finance_options#overview']")
    public WebElement seeDetailsModel3;

    //  >>>>>>>>>>  Model X <<<<<<<<<<
    @FindBy(xpath = "//h1[contains(text(),'Model X')][1]")
    public WebElement modelXHeader;
    @FindBy(xpath = "//strong[contains(text(),'$68,590')][1]")
    public WebElement modelXStartingPrice;
    @FindBy(xpath = "//small[contains(text(),'After Federal Tax Credit & Est. Gas Savings')]")
    public WebElement afterFederalModelX;
    @FindBy(xpath = "//a[@href='/modelx/design#overview' and @title='Order Now']")
    public WebElement orderNowModelX;
    @FindBy(xpath = "//a[@href='/drive?selectedModel=modelx' and @title='Demo Drive']")
    public WebElement demoDriveModelX;
    @FindBy(xpath = "//p[contains(text(),'$79,990')][1]")
    public WebElement priceBeforeIncentivesModelX;
    @FindBy(xpath = "//a[@href='/modelx/design?financeModalTab=gas_savings#overview']")
    public WebElement learnAboutEstModelX;

    //  >>>>>>>>>> Model S <<<<<<<<<<
    @FindBy(xpath = "//h1[contains(text(),'Model S')][1]")
    public WebElement modelSHeader;
    @FindBy(xpath = "//strong[contains(text(),'$71,090')][1]")
    public WebElement modelSStartingPrice;
    @FindBy(xpath = "//small[contains(text(),'After Est. Gas Savings')]")
    public WebElement afterEstGasSavingsModelS;
    @FindBy(xpath = "//a[@href='/models/design#overview' and @title='Order Now']")
    public WebElement orderNowModelS;
    @FindBy(xpath = "//a[@href='/drive?selectedModel=models' and @title='Demo Drive']")
    public WebElement demoDriveModelS;
    @FindBy(xpath = "//p[contains(text(),'$74,990')][1]")
    public WebElement priceBeforeSavingsModelS;
    @FindBy(xpath = "//a[@href='/models/design?financeModalTab=gas_savings#overview']")
    public WebElement learnAboutEstModelS;

    //  >>>>>>>>>>> Experience Tesla <<<<<<<<<<
    @FindBy(xpath = "//h1[contains(text(),'Experience Tesla')][1]")
    public WebElement experienceTeslaHeader;
    @FindBy(xpath = "//p[contains(text(),'Schedule a Demo Drive Today')][1]")
    public WebElement scheduleADemoDriveToday;
    @FindBy(xpath = "//a[@href='/drive' and @title='Demo Drive']")
    public WebElement demoDriveExperienceTesla;

    //  >>>>>>>>>> Solar Panels <<<<<<<<<<<
    @FindBy(xpath = "//h1[contains(text(),'Solar Panels')][1]")
    public WebElement solarPanelsHeader;
    @FindBy(xpath = "//a[contains(text(),'Schedule a Virtual Consultation')][1]")
    public WebElement scheduleAVirtualConsultation;
    @FindBy(xpath = "//a[@href='/energy/design' and @title='Order Now']")
    public WebElement orderNowSolarPanel;
    @FindBy(xpath = "//a[@href='/solarpanels' and @title='Learn More']")
    public WebElement learnMoreSolarPanel;

    //  >>>>>>>>>>> Solar Roofs <<<<<<<<<<<
    @FindBy(xpath = "//h1[contains(text(),'Solar Roof')][1]")
    public WebElement solarRoofHeader;
    @FindBy(xpath = "//p[contains(text(),'Produce Clean Energy From Your Roof')][1]")
    public WebElement produceCleanEnergyFromYourRoof;
    @FindBy(xpath = "//a[@href='/solarroof/design' and @title='Order Now']")
    public WebElement orderNowSolarRoof;
    @FindBy(xpath = "//a[@href='/solarroof' and @title='Learn More']")
    public WebElement learnMoreSolarRoof;

    //  >>>>>>>>>> Powerwall <<<<<<<<<<
    @FindBy(xpath = "//h1[contains(text(),'Powerwall')][1]")
    public WebElement powerWallHeader;
    @FindBy(xpath = "//body[1]/div[5]/main[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/section[1]/a[1]/span[1]")
    public WebElement orderNowPowerwall;
    @FindBy(xpath = "//a[@href='/powerwall' and @title='Learn More']")
    public WebElement learnMorePowerwall;

    //  >>>>>>>>>> Accesories <<<<<<<<<<
    @FindBy(xpath = "//h1[contains(text(),'Accessories')][1]")
    public WebElement accessoriesHeader;
    @FindBy(xpath = "//a[@title='Shop Now']")
    public WebElement shopNowAccessories;

    //  >>>>>>>>>> Footer elements <<<<<<<<<<
    @FindBy(xpath = "//a[@href='/about' and @title='Copyright 2023 Tesla Motors']")
    public WebElement copyright2023TeslaMotors;
    @FindBy(xpath = "//a[@href='/legal']")
    public WebElement privacyAndLegal;
    @FindBy(xpath = "//a[@href='https://www.tesla.com/vin-recall-search']")
    public WebElement vehicleRecalls;
    @FindBy(xpath = "//a[@href='/contact']")
    public WebElement contact;
    @FindBy(xpath = "//a[@href='/blog']")
    public WebElement news;
    @FindBy(xpath = "//a[@href='/updates']")
    public WebElement getUpdates;
    @FindBy(xpath = "//a[@href='/findus/list']")
    public WebElement locations;

    //  >>>>>>>>>> Vehicle Panel <<<<<<<<<<
    @FindBy(xpath = "//img[@alt='Model S']")
    public WebElement modelSImg;
    @FindBy(xpath = "//h3[contains(text(),'Model S')]")
    public WebElement modelSPanelHeader;
    @FindBy(xpath = "//a[@aria-label='Learn' and @href='/models']")
    public WebElement modelSPanelLearn;
    @FindBy(xpath = "//a[@aria-label='Order' and @href='/models/design']")
    public WebElement modelSPanelOrder;

    @FindBy(xpath = "//img[@alt='Model 3']")
    public WebElement model3Img;
    @FindBy(xpath = "//h3[contains(text(),'Model 3')]")
    public WebElement model3PanelHeader;
    @FindBy(xpath = "//a[@aria-label='Learn' and @href='/model3']")
    public WebElement model3PanelLearn;
    @FindBy(xpath = "//a[@aria-label='Order' and @href='/model3/design']")
    public WebElement model3PanelOrder;

    @FindBy(xpath = "//img[@alt='Model X']")
    public WebElement modelXImg;
    @FindBy(xpath = "//h3[contains(text(),'Model X')]")
    public WebElement modelXPanelHeader;
    @FindBy(xpath = "//a[@aria-label='Learn' and @href='/modelx']")
    public WebElement modelXPanelLearn;
    @FindBy(xpath = "//a[@aria-label='Order' and @href='/modelx/design']")
    public WebElement modelXPanelOrder;

    @FindBy(xpath = "//img[@alt='Model Y']")
    public WebElement modelYImg;
    @FindBy(xpath = "//h3[contains(text(),'Model Y')]")
    public WebElement modelYPanelHeader;
    @FindBy(xpath = "//a[@aria-label='Learn' and @href='/modely']")
    public WebElement modelYPanelLearn;
    @FindBy(xpath = "//a[@aria-label='Order' and @href='/modely/design']")
    public WebElement modelYPanelOrder;

    @FindBy(xpath = "//img[@alt='Help Me Choose']")
    public WebElement helpMeChooseImg;
    @FindBy(xpath = "//h3[contains(text(),'Help Me Choose')]")
    public WebElement helpMeChoosePanelHeader;
    @FindBy(xpath = "//a[@aria-label='Get Started' and @href='/choose']")
    public WebElement getStartedPanel;

    @FindBy(xpath = "//a[@href='/new']")
    public WebElement inventory;
    @FindBy(xpath = "//a[@href='/used']")
    public WebElement usedCars;
    @FindBy(xpath = "//a[@href='/drive']")
    public WebElement demoDrive;
    @FindBy(xpath = "//a[@href='/tradein']")
    public WebElement tradeIn;
    @FindBy(xpath = "//a[@href='/choose']")
    public WebElement helpMeChoose;
    @FindBy(xpath = "//a[@href='/compare']")
    public WebElement compare;
    @FindBy(xpath = "//a[@href='/fleet']")
    public WebElement fleet;
    @FindBy(xpath = "//a[@href='/cybertruck']")
    public WebElement cyberTruck;
    @FindBy(xpath = "//a[@href='/semi']")
    public WebElement semi;
    @FindBy(xpath = "//a[@href='/roadster']")
    public WebElement roadster;

    //  >>>>>>>>>> Energy Modal Panel  <<<<<<<<<<
    @FindBy(xpath = "//img[@alt='Solar Panels']")
    public WebElement solarPanelImg;
    @FindBy(xpath = "//h3[contains(text(),'Solar Panels')]")
    public WebElement solarPanelHeaderModal;
    @FindBy(xpath = "//a[@aria-label='Learn' and @href='/solarpanels']")
    public WebElement solarPanelLearnModal;
    @FindBy(xpath = "//a[@aria-label='Order' and @href='/energy/design']")
    public WebElement solarPanelOrderModal;


    @FindBy(xpath = "//img[@alt='Solar Roof']")
    public WebElement solarRoofImg;
    @FindBy(xpath = "//h3[contains(text(),'Solar Roof')]")
    public WebElement solarRoofHeaderModal;
    @FindBy(xpath = "//a[@aria-label='Learn' and @href='/solarroof']")
    public WebElement solarRoofLearnModal;
    @FindBy(xpath = "//a[@aria-label='Order' and @href='/solarroof/design']")
    public WebElement solarRoofOrderModal;


    @FindBy(xpath = "//img[@alt='Powerwall']")
    public WebElement powerWallPanelImg;
    @FindBy(xpath = "//h3[contains(text(),'Powerwall')]")
    public WebElement powerWallHeaderModal;
    @FindBy(xpath = "//a[@aria-label='Learn' and @href='/powerwall']")
    public WebElement powerWallLearnModal;
    @FindBy(xpath = "//a[@aria-label='Order' and @href='/powerwall/design']")
    public WebElement powerWallOrderModal;

    @FindBy(xpath = "//img[@alt='Megapack']")
    public WebElement megaPackPanelImg;
    @FindBy(xpath = "//h3[contains(text(),'Megapack')]")
    public WebElement megaPackHeaderModal;
    @FindBy(xpath = "//a[@aria-label='Learn' and @href='/megapack']")
    public WebElement megaPackLearnModal;
    @FindBy(xpath = "//a[@aria-label='Order' and @href='/megapack/design']")
    public WebElement megaPackOrderModal;

    @FindBy(xpath = "//a[@href='/solar-virtual-consultations']")
    public WebElement scheduleAConsultation;
    @FindBy(xpath = "//a[@href='/why-solar']")
    public WebElement whySolar;
    @FindBy(xpath = "//a[@href='/support/energy/powerwall/learn/incentives']")
    public WebElement incentives;
    @FindBy(xpath = "//a[@href='/support/energy']")
    public WebElement support;
    @FindBy(xpath = "//a[@href='/support/energy/powerwall/installer-resources/partner-with-tesla']")
    public WebElement partnerWithTesla;
    @FindBy(xpath = "//a[@href='/commercial']")
    public WebElement commercial;
    @FindBy(xpath = "//a[@href='/utilities']")
    public WebElement utilities;

    //  >>>>>>>>>> Energy Modal Panel <<<<<<<<<<
    @FindBy(xpath = "//img[@alt='Charging']")
    public WebElement chargingImg;
    @FindBy(xpath = "//h3[text()='Charging']")
    public WebElement chargingHeader;
    @FindBy(xpath = "//a[@href='/charging' and @aria-label='Learn']")
    public WebElement chargingLearn;

    @FindBy(xpath = "//img[@alt='Home Charging']")
    public WebElement homeCharging;
    @FindBy(xpath = "//h3[text()='Home Charging']")
    public WebElement homeChargingHeader;
    @FindBy(xpath = "//a[@aria-label='Learn' and @href='/home-charging']")
    public WebElement homeChargingLearn;
    @FindBy(xpath = "//a[@aria-label='Shop' and @href='https://shop.tesla.com/category/charging#charging.at-home']")
    public WebElement homeChargingShop;


    @FindBy(xpath = "//img[@alt='Supercharging']")
    public WebElement superchargingImg;
    @FindBy(xpath = "//h3[text()='Supercharging']")
    public WebElement superchargingHeader;
    @FindBy(xpath = "//a[@aria-label='Learn' and @href='/supercharger']")
    public WebElement superchargingLearn;
    @FindBy(xpath = "//a[@href='/findus']")
    public WebElement superchargingFind;

    @FindBy(xpath = "//a[@href='/charging-calculator']")
    public WebElement chargingCalculator;
    @FindBy(xpath = "//a[@href='/trips']")
    public WebElement tripPlanner;
    @FindBy(xpath = "//a[@href='/supercharger-voting/overview']")
    public WebElement superchargerVoting;
    @FindBy(xpath = "//a[@href='/host-a-supercharger']")
    public WebElement hostASupercharger;
    @FindBy(xpath = "//a[@href='/commercial-charging']")
    public WebElement commercialCharging;
    @FindBy(xpath = "//a[@href='/charging-partners']")
    public WebElement hostWallConnectors;

    //  >>>>>>>>>> Discover Modal Panel <<<<<<<<<<

    @FindBy(xpath = "//h3[text()='Resources']")
    public WebElement resources;
    @FindBy(xpath = "//h3[text()='Location Services']")
    public WebElement locationServices;
    @FindBy(xpath = "//h3[text()='Company']")
    public WebElement company;


    @FindBy(xpath = "//a[@href='/drive']/ancestor::div[@class='dx-mega-menu-link-group']")
    public WebElement demoDriveDiscover;
    @FindBy(xpath = "//a[@href='/insurance']")
    public WebElement insuranceDiscover;
    @FindBy(xpath = "//a[@href='/support/videos']")
    public WebElement videoGuidesDiscover;
    @FindBy(xpath = "//a[@href='/customer-stories']")
    public WebElement customerStoriesDiscover;
    @FindBy(xpath = "//a[@href='/events']")
    public WebElement eventsDiscover;
    @FindBy(xpath = "//a[@href='/findus']/ancestor::li")
    public WebElement findUsDiscover;
    @FindBy(xpath = "//a[@href='/trips']/ancestor::div[@class='dx-mega-menu-link-group']")
    public WebElement tripPlannerDiscover;
    @FindBy(xpath = "//a[@href='/support/collision-support']")
    public WebElement findACollisionCenterDiscover;
    @FindBy(xpath = "//a[@href='/support/certified-installers']")
    public WebElement findACertifiedInstallerDiscover;
    @FindBy(xpath = "//a[@href='/about']/ancestor::li")
    public WebElement aboutDiscover;
    @FindBy(xpath = "//a[@href='/careers']/ancestor::li")
    public WebElement careersDiscover;
    @FindBy(xpath = "//a[@href='https://ir.tesla.com']/ancestor::li")
    public WebElement investorRelationsDiscover;

    //  >>>>>>>>>> Shop Modal Panel <<<<<<<<<<

    @FindBy(xpath = "//img[@src='https://digitalassets.tesla.com/tesla-contents/image/upload/f_auto,q_auto/Mega-Menu-Shop-Charging.png'] ")
    public WebElement chargingImgShop;
    @FindBy(xpath = "//h3[contains(text(),'Charging')]/ancestor::div[@class='dx-mega-menu-products']")
    public WebElement chargingHeaderShop;
    @FindBy(xpath = "//img[@src='https://digitalassets.tesla.com/tesla-contents/image/upload/f_auto,q_auto/Mega-Menu-Shop-Vehicle-Accessories.png']")
    public WebElement vehicleAccessoriesImgShop;
    @FindBy(xpath = "//h3[text()='Vehicle Accessories']")
    public WebElement vehicleAccessoriesHeaderShop;
    @FindBy(xpath = "//img[@src='https://digitalassets.tesla.com/tesla-contents/image/upload/f_auto,q_auto/Mega-Menu-Shop-Apparel.png']")
    public WebElement apparelImgShop;
    @FindBy(xpath = "//h3[text()='Apparel']")
    public WebElement apparelHeaderShop;
    @FindBy(xpath = "//img[@src='https://digitalassets.tesla.com/tesla-contents/image/upload/f_auto,q_auto/Mega-Menu-Shop-Lifestyle.png'] ")
    public WebElement lifeStyleImgShop;
    @FindBy(xpath = "//h3[text()='Apparel']")
    public WebElement lifeStyleHeaderShop;

    public MainPage() throws AWTException {
    }

//    Methods

//----------------------------------------HEADER----------------------------------------


    public void bannerHeader1Verfication() {
        boolean bannerHeader1Ver = bannerHeader1.isDisplayed();
        if (bannerHeader1Ver) {
            System.out.println("Banner header1 is displayed! >>> PASS");
        } else {
            System.out.println("Banner header1 is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void bannerHeader2Verfication() {
        boolean bannerHeader2Ver = bannerHeader2.isDisplayed();
        if (bannerHeader2Ver) {
            System.out.println("Banner header2 is displayed! >>> PASS");
        } else {
            System.out.println("Banner header2 is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void bannerLinkVerfication() {
        boolean bannerLinkVer = bannerLink.isDisplayed();
        if (bannerLinkVer) {
            System.out.println("Banner Link is displayed! >>> PASS");
        } else {
            System.out.println("Banner Link is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void logoVerification() {
        boolean logoVer = logo.isDisplayed();
        if (logoVer) {
            System.out.println("Logo is displayed! >>> PASS");
        } else {
            System.out.println("Logo is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void vehicleSpanVerification() {
        boolean vehicleSpanVer = vehicleSpan.isDisplayed();
        if (vehicleSpanVer) {
            System.out.println("Vehicle button is displayed! >>> PASS");
        } else {
            System.out.println("Vehicle button is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void energySpanVerification() {
        boolean energySpanVer = energySpan.isDisplayed();
        if (energySpanVer) {
            System.out.println("Energy button is displayed! >>> PASS");
        } else {
            System.out.println("Energy button is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void chargingSpanVerification() {
        boolean chargingSpanVer = chargingSpan.isDisplayed();
        if (chargingSpanVer) {
            System.out.println("Charging button is displayed! >>> PASS");
        } else {
            System.out.println("Charging button is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void discoverSpanVerification() {
        boolean discoverSpanVer = discoverSpan.isDisplayed();
        if (discoverSpanVer) {
            System.out.println("Discover button is displayed! >>> PASS");
        } else {
            System.out.println("Discover button is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void shopSpanVerification() {
        boolean shopSpanVer = shopSpan.isDisplayed();
        if (shopSpanVer) {
            System.out.println("Shop button is displayed! >>> PASS");
        } else {
            System.out.println("Shop button is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void supportIconVerification() {
        boolean supportIconVer = supportIcon.isDisplayed();
        if (supportIconVer) {
            System.out.println("Support icon is displayed! >>> PASS");
        } else {
            System.out.println("Support icon is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void localizationIconVerification() {
        boolean localizationIconVer = localizationIcon.isDisplayed();
        if (localizationIconVer) {
            System.out.println("Localization icon is displayed! >>> PASS");
        } else {
            System.out.println("Localization icon is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void accountIconVerification() {
        boolean accountIconVer = accountIcon.isDisplayed();
        if (accountIconVer) {
            System.out.println("Charging button is displayed! >>> PASS");
        } else {
            System.out.println("Charging button is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }

//----------------------------------------MODEL Y----------------------------------------
    public void modelYHeaderVerification() {
        boolean modelYHeaderVer = modelYHeader.isDisplayed();
        if (modelYHeaderVer) {
            System.out.println("Model Y header is displayed! >>> PASS");
        } else {
            System.out.println("Model Y header is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void modelYLeasingStartingVerification() {
        boolean modelYLeasingStartingVer = modelYLeasingStarting.isDisplayed();
        if (modelYLeasingStartingVer) {
            System.out.println("Model Y Leasing Starting... is displayed! >>> PASS");
        } else {
            System.out.println("Model Y Leasing Starting... is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void modelYStartingPriceVerification() {
        boolean modelYStartingPriceVer = modelYStartingPrice.isDisplayed();
        if (modelYStartingPriceVer) {
            System.out.println("Model Y Starting Price is displayed! >>> PASS");
        } else {
            System.out.println("Model Y Starting Price is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void modelYAfterFederalVerification() {
        boolean modelYAfterFederalVer = afterFederalModelYText.isDisplayed();
        if (modelYAfterFederalVer) {
            System.out.println("Model Y After Federal... is displayed! >>> PASS");
        } else {
            System.out.println("Model Y After Federal... is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void modelYOrderNowVerification() {
        boolean modelYOrderNowVer = orderNowModelY.isDisplayed();
        if (modelYOrderNowVer) {
            System.out.println("Model Y Order Now button is displayed! >>> PASS");
        } else {
            System.out.println("Model Y Order Now button is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void modelYDemoDriveVerification() {
        boolean modelYDemoDriveVer = demoDriveModelY.isDisplayed();
        if (modelYDemoDriveVer) {
            System.out.println("Model Y Demo Drive button is displayed! >>> PASS");
        } else {
            System.out.println("Model Y Demo Drive button is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void modelYPriceBeforeVerification() {
        boolean modelYPriceBeforeVer = priceBeforeIncentivesModelY.isDisplayed();
        if (modelYPriceBeforeVer) {
            System.out.println("Model Y Price Before is displayed! >>> PASS");
        } else {
            System.out.println("Model Y Price Before is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void modelYLearnAboutVerification() {
        boolean modelYLearnAboutVer = learnAboutEstModelY.isDisplayed();
        if (modelYLearnAboutVer) {
            System.out.println("Model Y Learn about... link is displayed! >>> PASS");
        } else {
            System.out.println("Model Y Learn about... link is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void modelYExcludesTaxesAndFeesVerification() {
        boolean modelYExcludesTaxesAndFeesVer = modelYExcludesTaxesAndFees.isDisplayed();
        if (modelYExcludesTaxesAndFeesVer) {
            System.out.println("Model Y Excludes Taxes and Fees... is displayed! >>> PASS");
        } else {
            System.out.println("Model Y Excludes Taxes and Fees... link is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void modelYSeeDetailsVerification() {
        boolean modelYSeeDetailsVer = modelYSeeDetails.isDisplayed();
        if (modelYSeeDetailsVer) {
            System.out.println("Model Y Learn about... link is displayed! >>> PASS");
        } else {
            System.out.println("Model Y Learn about... link is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }

//----------------------------------------SCROLL DOWN----------------------------------------
public void scrollDownPageWhite() throws InterruptedException {

    WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(headerWhite);
    new Actions(getDriver())
            .scrollFromOrigin(scrollOrigin, 0, 400)
            .perform();
    Thread.sleep(500);
}
    public void scrollDownPageBlack() throws InterruptedException {

        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(headerBlack);
        new Actions(getDriver())
                .scrollFromOrigin(scrollOrigin, 0, 400)
                .perform();
        Thread.sleep(500);
    }

//----------------------------------------MODEL 3----------------------------------------
    public void model3HeaderVerification() {
        boolean model3HeaderVer = model3Header.isDisplayed();
        if (model3HeaderVer) {
            System.out.println("Model 3 header is displayed! >>> PASS");
        } else {
            System.out.println("Model 3 header is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void model3LeasingStartingVerification() {
        boolean model3LeasingVer = model3LeasingStarting.isDisplayed();
        if (model3LeasingVer) {
            System.out.println("Model 3 Leasing Starting is displayed! >>> PASS");
        } else {
            System.out.println("Model 3 Leasing Starting is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void model3OrderNowVerification() {
        boolean model3OrderNowVer = orderNowModel3.isDisplayed();
        if (model3OrderNowVer) {
            System.out.println("Model 3 Leasing Starting is displayed! >>> PASS");
        } else {
            System.out.println("Model 3 Leasing Starting is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void model3DemoDriveVerification() {
        boolean model3DemoDriveVer = demoDriveModel3.isDisplayed();
        if (model3DemoDriveVer) {
            System.out.println("Model 3 Leasing Starting is displayed! >>> PASS");
        } else {
            System.out.println("Model 3 Leasing Starting is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void model3ExcludesTaxesVerification() {
        boolean model3ExcludesTaxesVer = excludeTaxesModel3.isDisplayed();
        if (model3ExcludesTaxesVer) {
            System.out.println("Model 3 Excludes Taxes is displayed! >>> PASS");
        } else {
            System.out.println("Model 3 Excludes Taxes is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void model3SeeDetailsVerification() {
        boolean model3SeeDetailsVer = seeDetailsModel3.isDisplayed();
        if (model3SeeDetailsVer) {
            System.out.println("Model 3 See Details is displayed! >>> PASS");
        } else {
            System.out.println("Model 3 See Details is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
//----------------------------------------MODEL X----------------------------------------
    public void modelXHeaderVerification() {
        boolean modelXHeaderVer = modelXHeader.isDisplayed();
        if (modelXHeaderVer) {
            System.out.println("Model X header is displayed! >>> PASS");
        } else {
            System.out.println("Model X header is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void modelXStartingPriceVerification() {
        boolean modelXStartingPriceVer = modelXStartingPrice.isDisplayed();
        if (modelXStartingPriceVer) {
            System.out.println("Model X Starting Price is displayed! >>> PASS");
        } else {
            System.out.println("Model X Starting Price is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void modelXAfterFederalVerification() {
        boolean modelXAfterFederalVer = afterFederalModelX.isDisplayed();
        if (modelXAfterFederalVer) {
            System.out.println("Model X After Federal... is displayed! >>> PASS");
        } else {
            System.out.println("Model X After Federal... is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void modelXOrderNowVerification() {
        boolean modelXOrderNowVer = orderNowModelX.isDisplayed();
        if (modelXOrderNowVer) {
            System.out.println("Model X Order Now is displayed! >>> PASS");
        } else {
            System.out.println("Model X Order Now is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void modelXDemoDriveVerification() {
        boolean modelXDemoDriveVer = demoDriveModelX.isDisplayed();
        if (modelXDemoDriveVer) {
            System.out.println("Model X Demo Drive is displayed! >>> PASS");
        } else {
            System.out.println("Model X Demo Drive is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void modelXPriceBeforeVerification() {
        boolean modelXPriceBeforeVer = priceBeforeIncentivesModelX.isDisplayed();
        if (modelXPriceBeforeVer) {
            System.out.println("Model X Price Before is displayed! >>> PASS");
        } else {
            System.out.println("Model X Price Before is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void modelXLearnAboutVerification() {
        boolean modelXLearnAboutVer = learnAboutEstModelX.isDisplayed();
        if (modelXLearnAboutVer) {
            System.out.println("Model X Learn about... link is displayed! >>> PASS");
        } else {
            System.out.println("Model X Learn about... link is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
//----------------------------------------MODEL S----------------------------------------
public void modelSHeaderVerification() {
    boolean modelSHeaderVer = modelSHeader.isDisplayed();
    if (modelSHeaderVer) {
        System.out.println("Model S header is displayed! >>> PASS");
    } else {
        System.out.println("Model S header is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
    }
}
    public void modelSStartingPriceVerification() {
        boolean modelSStartingPriceVer = modelSStartingPrice.isDisplayed();
        if (modelSStartingPriceVer) {
            System.out.println("Model S Starting Price is displayed! >>> PASS");
        } else {
            System.out.println("Model S Starting Price is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void modelSAfterEstGasSavingsVerification() {
        boolean modelSAfterEstGasSavingsVer = afterEstGasSavingsModelS.isDisplayed();
        if (modelSAfterEstGasSavingsVer) {
            System.out.println("Model S After Est... is displayed! >>> PASS");
        } else {
            System.out.println("Model S After Est... is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void modelSOrderNowVerification() {
        boolean modelSOrderNowVer = orderNowModelS.isDisplayed();
        if (modelSOrderNowVer) {
            System.out.println("Model S Order Now is displayed! >>> PASS");
        } else {
            System.out.println("Model S Order Now is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void modelSDemoDriveVerification() {
        boolean modelSDemoDriveVer = demoDriveModelS.isDisplayed();
        if (modelSDemoDriveVer) {
            System.out.println("Model S Demo Drive is displayed! >>> PASS");
        } else {
            System.out.println("Model S Demo Drive is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void modelSPriceBeforeSavingsVerification() {
        boolean modelXPriceBeforeVer = priceBeforeSavingsModelS.isDisplayed();
        if (modelXPriceBeforeVer) {
            System.out.println("Model S Price Before Savings is displayed! >>> PASS");
        } else {
            System.out.println("Model S Price Before Savings is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void modelSLearnAboutVerification() {
        boolean modelSLearnAboutVer = learnAboutEstModelS.isDisplayed();
        if (modelSLearnAboutVer) {
            System.out.println("Model S Learn about... link is displayed! >>> PASS");
        } else {
            System.out.println("Model S Learn about... link is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
//----------------------------------------Experience Tesla----------------------------------------
    public void expTeslaHeaderVerification() {
        boolean expTeslaHeaderVer = experienceTeslaHeader.isDisplayed();
        if (expTeslaHeaderVer) {
            System.out.println("Exp Tesla header is displayed! >>> PASS");
        } else {
            System.out.println("Exp Tesla header is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void scheduleADemoDriveVerification() {
        boolean scheduleADemoDriveTodayVer = scheduleADemoDriveToday.isDisplayed();
        if (scheduleADemoDriveTodayVer) {
            System.out.println("Schedule a Demo Drive Today is displayed! >>> PASS");
        } else {
            System.out.println("Schedule a Demo Drive Today is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void demoDriveExpTeslaVerification() {
        boolean demoDriveExpTeslaVer = demoDriveExperienceTesla.isDisplayed();
        if (demoDriveExpTeslaVer) {
            System.out.println("Demo Drive in Exp Tesla is displayed! >>> PASS");
        } else {
            System.out.println("Demo Drive in Exp Tesla is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
//----------------------------------------Solar Panels----------------------------------------
    public void solarPanelsHeaderVerification() {
        boolean solarPanelsHeaderVer = solarPanelsHeader.isDisplayed();
        if (solarPanelsHeaderVer) {
            System.out.println("Solar Panels header is displayed! >>> PASS");
        } else {
            System.out.println("Solar Panels header is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void scheduleAVirtualConsultationVerification() {
        boolean scheduleAVirtualConsultationVer = scheduleAVirtualConsultation.isDisplayed();
        if (scheduleAVirtualConsultationVer) {
            System.out.println("Schedule a Virtual Consultation is displayed! >>> PASS");
        } else {
            System.out.println("Schedule a Virtual Consultation is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void orderNowSolarPanelsVerification() {
        boolean orderNowSolarPanelsVer = orderNowSolarPanel.isDisplayed();
        if (orderNowSolarPanelsVer) {
            System.out.println("Order Now on Solar Panels is displayed! >>> PASS");
        } else {
            System.out.println("Order Now on Solar Panels is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void learnMoreSolarPanelsVerification() {
        boolean learnMoreSolarPanelsVer = learnMoreSolarPanel.isDisplayed();
        if (learnMoreSolarPanelsVer) {
            System.out.println("Learn More on Solar Panels is displayed! >>> PASS");
        } else {
            System.out.println("Learn More on Solar Panels is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }

//----------------------------------------Solar Roof----------------------------------------
    public void solarRoofHeaderVerification() {
        boolean solarRoofHeaderVer = solarRoofHeader.isDisplayed();
        if (solarRoofHeaderVer) {
            System.out.println("Solar Roof header is displayed! >>> PASS");
        } else {
            System.out.println("Solar Roof header is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void produceCleanEnergyVerification() {
        boolean produceCleanEnergyVer = produceCleanEnergyFromYourRoof.isDisplayed();
        if (produceCleanEnergyVer) {
            System.out.println("Produce Clean Energy... is displayed! >>> PASS");
        } else {
            System.out.println("Produce Clean Energy... is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void orderNowSolarRoofVerification() {
        boolean orderNowSolarRoofVer = orderNowSolarRoof.isDisplayed();
        if (orderNowSolarRoofVer) {
            System.out.println("Order Now on Solar Roof is displayed! >>> PASS");
        } else {
            System.out.println("Order Now on Solar Roof is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void learnMoreSolarRoofVerification() {
        boolean learnMoreSolarRoofVer = learnMoreSolarRoof.isDisplayed();
        if (learnMoreSolarRoofVer) {
            System.out.println("Learn More on Solar Roof is displayed! >>> PASS");
        } else {
            System.out.println("Learn More on Solar Roof is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
//----------------------------------------Powerwall----------------------------------------
    public void powerWallHeaderVerification() {
        boolean powerWallHeaderVer = powerWallHeader.isDisplayed();
        if (powerWallHeaderVer) {
            System.out.println("Powerwall header is displayed! >>> PASS");
        } else {
            System.out.println("Powerwall header is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void orderNowPowerWallVerification() {
        boolean orderNowPowerWallVer = orderNowPowerwall.isDisplayed();
        if (orderNowPowerWallVer) {
            System.out.println("Order Now on Powerwall is displayed! >>> PASS");
        } else {
            System.out.println("Order Now on Powerwall is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void learnMorePowerWallVerification() {
        boolean learnMorePowerWallVer = learnMorePowerwall.isDisplayed();
        if (learnMorePowerWallVer) {
            System.out.println("Learn More on Powerwall is displayed! >>> PASS");
        } else {
            System.out.println("Learn More on Powerwall is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
//----------------------------------------Accessories----------------------------------------
    public void accessoriesHeaderVerification() {
        boolean accessoriesHeaderVer = accessoriesHeader.isDisplayed();
        if (accessoriesHeaderVer) {
            System.out.println("Accessories header is displayed! >>> PASS");
        } else {
            System.out.println("Accessories header is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void shopNowAccessoriesVerification() {
        boolean shopNowAccessoriesVer = shopNowAccessories.isDisplayed();
        if (shopNowAccessoriesVer) {
            System.out.println("Shop Now on Accessories is displayed! >>> PASS");
        } else {
            System.out.println("Shop Now on Accessories is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
//----------------------------------------Footer Elements----------------------------------------
    public void copyRightsVerification() {
        boolean copyRightsVer = copyright2023TeslaMotors.isDisplayed();
        if (copyRightsVer) {
            System.out.println("Tesla c 2023 is displayed! >>> PASS");
        } else {
            System.out.println("Tesla c 2023 is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void privacyAndLegalVerification() {
        boolean privacyAndLegalVer = privacyAndLegal.isDisplayed();
        if (privacyAndLegalVer) {
            System.out.println("Privacy & Legal is displayed! >>> PASS");
        } else {
            System.out.println("Privacy & Legal is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void vehiclesRecallVerification() {
        boolean vehicleRecallsVer = vehicleRecalls.isDisplayed();
        if (vehicleRecallsVer) {
            System.out.println("Vehicle Recalls is displayed! >>> PASS");
        } else {
            System.out.println("Vehicle Recalls is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void contactVerification() {
        boolean contactVer = contact.isDisplayed();
        if (contactVer) {
            System.out.println("Contact is displayed! >>> PASS");
        } else {
            System.out.println("Contact Recalls is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void newsVerification() {
        boolean newsVer = news.isDisplayed();
        if (newsVer) {
            System.out.println("News is displayed! >>> PASS");
        } else {
            System.out.println("News Recalls is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void getUpdatesVerification() {
        boolean getUpdatesVer = getUpdates.isDisplayed();
        if (getUpdatesVer) {
            System.out.println("Get Updates is displayed! >>> PASS");
        } else {
            System.out.println("Get Updates is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void locationsVerification() {
        boolean locationsVer = locations.isDisplayed();
        if (locationsVer) {
            System.out.println("Locations is displayed! >>> PASS");
        } else {
            System.out.println("Locations is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
//----------------------------------------Vehicle Modal Panel----------------------------------------
    public void hoverOnVehicle() throws InterruptedException {
        action.moveToElement(vehicleSpan).perform();
        Thread.sleep(1000);
    }
    public void hoverOnModelSImg() {
        action.moveToElement(modelSImg).perform();
    }
    public void modelSImgVerification() {
        boolean modelSImgVer = modelSImg.isDisplayed();
        if (modelSImgVer) {
            System.out.println("Modes S Img is displayed! >>> PASS");
        } else {
            System.out.println("Modes S Img is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }

    public void modelSPanelHeaderVerification() {
        boolean modelSPanelHeaderVer = modelSPanelHeader.isDisplayed();
        if (modelSPanelHeaderVer) {
            System.out.println("Modes S Panel Header is displayed! >>> PASS");
        } else {
            System.out.println("Modes S Panel Header is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }

    public void modelSPanelLearnVerification() {
        boolean modelSPanelLearnVer = modelSPanelLearn.isDisplayed();
        if (modelSPanelLearnVer) {
            System.out.println("Modes S Panel Learn is displayed! >>> PASS");
        } else {
            System.out.println("Modes S Panel Learn is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }

    public void modelSPanelOrderVerification() {
        boolean modelSPanelOrderVer = modelSPanelOrder.isDisplayed();
        if (modelSPanelOrderVer) {
            System.out.println("Modes S Panel Order is displayed! >>> PASS");
        } else {
            System.out.println("Modes S Panel Order is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }

    public void model3ImgVerification() {
        boolean model3ImgVer = model3Img.isDisplayed();
        if (model3ImgVer) {
            System.out.println("Modes 3 Img is displayed! >>> PASS");
        } else {
            System.out.println("Modes 3 Img is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }

    public void model3PanelHeaderVerification() {
        boolean model3PanelHeaderVer = model3PanelHeader.isDisplayed();
        if (model3PanelHeaderVer) {
            System.out.println("Modes 3 Panel Header is displayed! >>> PASS");
        } else {
            System.out.println("Modes 3 Panel Header is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }

    public void model3PanelLearnVerification() {
        boolean model3PanelLearnVer = model3PanelLearn.isDisplayed();
        if (model3PanelLearnVer) {
            System.out.println("Modes 3 Panel Learn is displayed! >>> PASS");
        } else {
            System.out.println("Modes 3 Panel Learn is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }

    public void model3PanelOrderVerification() {
        boolean model3PanelOrderVer = model3PanelOrder.isDisplayed();
        if (model3PanelOrderVer) {
            System.out.println("Modes 3 Panel Order is displayed! >>> PASS");
        } else {
            System.out.println("Modes 3 Panel Order is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }

    public void modelXImgVerification() {
        boolean modelXImgVer = modelXImg.isDisplayed();
        if (modelXImgVer) {
            System.out.println("Modes X Img is displayed! >>> PASS");
        } else {
            System.out.println("Modes X Img is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void modelXPanelHeaderVerification() {
        boolean modelXPanelHeaderVer = modelXPanelHeader.isDisplayed();
        if (modelXPanelHeaderVer) {
            System.out.println("Modes X Panel Header is displayed! >>> PASS");
        } else {
            System.out.println("Modes X Panel Header is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void modelXPanelLearnVerification() {
        boolean modelXPanelLearnVer = modelXPanelLearn.isDisplayed();
        if (modelXPanelLearnVer) {
            System.out.println("Modes X Panel Learn is displayed! >>> PASS");
        } else {
            System.out.println("Modes X Panel Learn is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void modelXPanelOrderVerification() {
        boolean modelXPanelOrderVer = modelXPanelOrder.isDisplayed();
        if (modelXPanelOrderVer) {
            System.out.println("Modes X Panel Order is displayed! >>> PASS");
        } else {
            System.out.println("Modes X Panel Order is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void modelYImgVerification() {
        boolean modelYImgVer = modelYImg.isDisplayed();
        if (modelYImgVer) {
            System.out.println("Modes Y Img is displayed! >>> PASS");
        } else {
            System.out.println("Modes Y Img is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void modelYPanelHeaderVerification() {
        boolean modelYPanelHeaderVer = modelYPanelHeader.isDisplayed();
        if (modelYPanelHeaderVer) {
            System.out.println("Modes Y Panel Header is displayed! >>> PASS");
        } else {
            System.out.println("Modes Y Panel Header is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void modelYPanelLearnVerification() {
        boolean modelYPanelLearnVer = modelYPanelLearn.isDisplayed();
        if (modelYPanelLearnVer) {
            System.out.println("Modes Y Panel Learn is displayed! >>> PASS");
        } else {
            System.out.println("Modes Y Panel Learn is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void modelYPanelOrderVerification() {
        boolean modelYPanelOrderVer = modelYPanelOrder.isDisplayed();
        if (modelYPanelOrderVer) {
            System.out.println("Modes Y Panel Order is displayed! >>> PASS");
        } else {
            System.out.println("Modes Y Panel Order is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void helpMeChooseImgVerification() {
        boolean helpMeChooseImgVer = helpMeChooseImg.isDisplayed();
        if (helpMeChooseImgVer) {
            System.out.println("Help Me Choose Img is displayed! >>> PASS");
        } else {
            System.out.println("Help Me Choose Img is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void helpMeChooseHeaderVerification() {
        boolean helpMeChoosePanelHeaderVer = helpMeChoosePanelHeader.isDisplayed();
        if (helpMeChoosePanelHeaderVer) {
            System.out.println("Help Me Choose Header is displayed! >>> PASS");
        } else {
            System.out.println("Help Me Choose Header is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void getStartedPanelVerification() {
        boolean getStartedPanelVer = getStartedPanel.isDisplayed();
        if (getStartedPanelVer) {
            System.out.println("Get Started is displayed! >>> PASS");
        } else {
            System.out.println("Get Started Learn is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void inventoryPanelVerification() {
        boolean inventoryPanelVer = inventory.isDisplayed();
        if (inventoryPanelVer) {
            System.out.println("Inventory is displayed! >>> PASS");
        } else {
            System.out.println("Inventory Learn is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void usedCarsPanelVerification() {
        boolean usedCarsPanelVer = usedCars.isDisplayed();
        if (usedCarsPanelVer) {
            System.out.println("Used Cars is displayed! >>> PASS");
        } else {
            System.out.println("Used Cars Learn is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void demoDrivePanelVerification() {
        boolean demoDrivePanelVer = demoDrive.isDisplayed();
        if (demoDrivePanelVer) {
            System.out.println("Demo Drive is displayed! >>> PASS");
        } else {
            System.out.println("Demo Drive is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void tradeInPanelVerification() {
        boolean tradeInPanelVer = tradeIn.isDisplayed();
        if (tradeInPanelVer) {
            System.out.println("Trade-in is displayed! >>> PASS");
        } else {
            System.out.println("Trade-in is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void helpMeChoosePanelVerification() {
        boolean helpMeChooseVer = helpMeChoose.isDisplayed();
        if (helpMeChooseVer) {
            System.out.println("Help Me Choose is displayed! >>> PASS");
        } else {
            System.out.println("Help Me Choose is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void comparePanelVerification() {
        boolean compareVer = compare.isDisplayed();
        if (compareVer) {
            System.out.println("Compare is displayed! >>> PASS");
        } else {
            System.out.println("Compare is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void fleetPanelVerification() {
        boolean fleetVer = fleet.isDisplayed();
        if (fleetVer) {
            System.out.println("Fleet is displayed! >>> PASS");
        } else {
            System.out.println("Fleet is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void cyberTruckPanelVerification() {
        boolean cyberTruckVer = cyberTruck.isDisplayed();
        if (cyberTruckVer) {
            System.out.println("Cybertruck is displayed! >>> PASS");
        } else {
            System.out.println("Cybertruck is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void semiPanelVerification() {
        boolean semiVer = semi.isDisplayed();
        if (semiVer) {
            System.out.println("Semi is displayed! >>> PASS");
        } else {
            System.out.println("Semi is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void roadsterPanelVerification() {
        boolean roadsterVer = roadster.isDisplayed();
        if (roadsterVer) {
            System.out.println("Roadster is displayed! >>> PASS");
        } else {
            System.out.println("Roadster is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
//----------------------------------------Energy Modal Panel----------------------------------------
    public void hoverOnEnergy() throws InterruptedException {
        action.moveToElement(energySpan).perform();
        Thread.sleep(1000);
    }
    public void hoverOnSolarPanelImg() {
        action.moveToElement(solarPanelImg).perform();
    }
    public void solarPanelImgVerification() {
        boolean solarPanelImgVer = solarPanelImg.isDisplayed();
        if (solarPanelImgVer) {
            System.out.println("Solar Panel Img is displayed! >>> PASS");
        } else {
            System.out.println("Solar Panel Img is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void solarPanelHeaderModalVerification() {
        boolean solarPanelHeaderModalImgVer = solarPanelHeaderModal.isDisplayed();
        if (solarPanelHeaderModalImgVer) {
            System.out.println("Solar Panel Header is displayed! >>> PASS");
        } else {
            System.out.println("Solar Panel Header is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void solarPanelLearnModalVerification() {
        boolean solarPanelLearnModalImgVer = solarPanelLearnModal.isDisplayed();
        if (solarPanelLearnModalImgVer) {
            System.out.println("Solar Panel Learn is displayed! >>> PASS");
        } else {
            System.out.println("Solar Panel Learn is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void solarPanelOrderModalVerification() {
        boolean solarPanelOrderModalImgVer = solarPanelOrderModal.isDisplayed();
        if (solarPanelOrderModalImgVer) {
            System.out.println("Solar Panel Order is displayed! >>> PASS");
        } else {
            System.out.println("Solar Panel Order is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void solarRoofImgModalVerification() {
        boolean solarRoofImgVer = solarRoofImg.isDisplayed();
        if (solarRoofImgVer) {
            System.out.println("Solar Roof Img is displayed! >>> PASS");
        } else {
            System.out.println("Solar Roof Img is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void solarRoofHeaderModalVerification() {
        boolean solarRoofHeaderModalImgVer = solarRoofHeaderModal.isDisplayed();
        if (solarRoofHeaderModalImgVer) {
            System.out.println("Solar Roof Header is displayed! >>> PASS");
        } else {
            System.out.println("Solar Roof Header is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void solarRoofLearnModalVerification() {
        boolean solarRoofLearnModalImgVer = solarRoofLearnModal.isDisplayed();
        if (solarRoofLearnModalImgVer) {
            System.out.println("Solar Roof Learn is displayed! >>> PASS");
        } else {
            System.out.println("Solar Roof Learn is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void solarRoofOrderModalVerification() {
        boolean solarRoofOrderPanelImgVer = solarRoofOrderModal.isDisplayed();
        if (solarRoofOrderPanelImgVer) {
            System.out.println("Solar Roof Order is displayed! >>> PASS");
        } else {
            System.out.println("Solar Roof Order is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void powerWallImgModalVerification() {
        boolean powerWallImgMPanelVer = powerWallPanelImg.isDisplayed();
        if (powerWallImgMPanelVer) {
            System.out.println("Powerwall Img is displayed! >>> PASS");
        } else {
            System.out.println("Powerwall Img is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void powerWallHeaderModalVerification() {
        boolean powerWallPanelHeaderVer = powerWallHeaderModal.isDisplayed();
        if (powerWallPanelHeaderVer) {
            System.out.println("Powerwall Header is displayed! >>> PASS");
        } else {
            System.out.println("Powerwall Header is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void powerWallLearnModalVerification() {
        boolean powerWallLearnPanelVer = powerWallLearnModal.isDisplayed();
        if (powerWallLearnPanelVer) {
            System.out.println("Powerwall Learn is displayed! >>> PASS");
        } else {
            System.out.println("Powerwall Learn is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void powerWallOrderModalVerification() {
        boolean solarRoofOrderPanelImgVer = powerWallOrderModal.isDisplayed();
        if (solarRoofOrderPanelImgVer) {
            System.out.println("Powerwall Order is displayed! >>> PASS");
        } else {
            System.out.println("Powerwall Order is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void megaPackImgModalVerification() {
        boolean megaPackImgMPanelVer = megaPackPanelImg.isDisplayed();
        if (megaPackImgMPanelVer) {
            System.out.println("Megapack Img is displayed! >>> PASS");
        } else {
            System.out.println("Megapack Img is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void megaPackHeaderModalVerification() {
        boolean megaPackPanelHeaderVer = megaPackHeaderModal.isDisplayed();
        if (megaPackPanelHeaderVer) {
            System.out.println("Megapack Header is displayed! >>> PASS");
        } else {
            System.out.println("Megapack Header is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void megaPackLearnModalVerification() {
        boolean megaPackLearnPanelVer = megaPackLearnModal.isDisplayed();
        if (megaPackLearnPanelVer) {
            System.out.println("Megapack Learn is displayed! >>> PASS");
        } else {
            System.out.println("Megapack Learn is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void megaPackOrderModalVerification() {
        boolean megaPackOrderPanelImgVer = megaPackOrderModal.isDisplayed();
        if (megaPackOrderPanelImgVer) {
            System.out.println("Megapack Order is displayed! >>> PASS");
        } else {
            System.out.println("Megapack Order is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void scheduleAConsultationModalVerification() {
        boolean schedulaAConsultationPanelVer = scheduleAConsultation.isDisplayed();
        if (schedulaAConsultationPanelVer) {
            System.out.println("Schedule A Consultation is displayed! >>> PASS");
        } else {
            System.out.println("Schedule A Consultation is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void whySolarModalVerification() {
        boolean whySolarPanelVer = whySolar.isDisplayed();
        if (whySolarPanelVer) {
            System.out.println("Why Solar is displayed! >>> PASS");
        } else {
            System.out.println("Why Solar is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void incentivesModalVerification() {
        boolean incentivesPanelVer = incentives.isDisplayed();
        if (incentivesPanelVer) {
            System.out.println("Incentives is displayed! >>> PASS");
        } else {
            System.out.println("Incentives is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void supportModalVerification() {
        boolean supportPanelVer = support.isDisplayed();
        if (supportPanelVer) {
            System.out.println("Support is displayed! >>> PASS");
        } else {
            System.out.println("Support is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void partnerWithTeslaModalVerification() {
        boolean partnerWithTeslaPanelVer = partnerWithTesla.isDisplayed();
        if (partnerWithTeslaPanelVer) {
            System.out.println("Partner With Tesla is displayed! >>> PASS");
        } else {
            System.out.println("Partner With Tesla is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void commercialModalVerification() {
        boolean commercialPanelVer = commercial.isDisplayed();
        if (commercialPanelVer) {
            System.out.println("Commercial is displayed! >>> PASS");
        } else {
            System.out.println("Commercial is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void utilitiesModalVerification() {
        boolean utilitiesPanelVer = utilities.isDisplayed();
        if (utilitiesPanelVer) {
            System.out.println("Utilities is displayed! >>> PASS");
        } else {
            System.out.println("Utilities is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }

    //----------------------------------------Charging Modal Panel----------------------------------------
    public void hoverOnCharging() throws InterruptedException {
        action.moveToElement(chargingSpan).perform();
        Thread.sleep(1000);
    }
    public void hoverOnChargingImg() {
        action.moveToElement(chargingImg).perform();
    }
    public void chargingImgModalVerification() {
        boolean chargingImgMPanelVer = chargingImg.isDisplayed();
        if (chargingImgMPanelVer) {
            System.out.println("Charging Img is displayed! >>> PASS");
        } else {
            System.out.println("Charging Img is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void chargingHeaderModalVerification() {
        boolean chargingHeaderPanelHeaderVer = chargingHeader.isDisplayed();
        if (chargingHeaderPanelHeaderVer) {
            System.out.println("Charging Header is displayed! >>> PASS");
        } else {
            System.out.println("Charging Header is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void chargingLearnModalVerification() {
        boolean chargingLearnPanelVer = chargingLearn.isDisplayed();
        if (chargingLearnPanelVer) {
            System.out.println("Charging Learn is displayed! >>> PASS");
        } else {
            System.out.println("Charging Learn is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void homeChargingImgModalVerification() {
        boolean homeChargingImgVer = homeCharging.isDisplayed();
        if (homeChargingImgVer) {
            System.out.println("Home Charging Img is displayed! >>> PASS");
        } else {
            System.out.println("Home Charging Img is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void homeChargingHeaderModalVerification() {
        boolean homeChargingHeaderVer = homeChargingHeader.isDisplayed();
        if (homeChargingHeaderVer) {
            System.out.println("Home Charging Header is displayed! >>> PASS");
        } else {
            System.out.println("Home Charging Header is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void homeChargingLearnModalVerification() {
        boolean homeChargingLearnVer = homeChargingLearn.isDisplayed();
        if (homeChargingLearnVer) {
            System.out.println("Home Charging Learn is displayed! >>> PASS");
        } else {
            System.out.println("Home Charging Learn is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void homeChargingShopModalVerification() {
        boolean homeChargingShopVer = homeChargingShop.isDisplayed();
        if (homeChargingShopVer) {
            System.out.println("Home Charging Shop is displayed! >>> PASS");
        } else {
            System.out.println("Home Charging Shop is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void superchargingImgModalVerification() {
        boolean superchargingImgVer = superchargingImg.isDisplayed();
        if (superchargingImgVer) {
            System.out.println("Supercharging Img is displayed! >>> PASS");
        } else {
            System.out.println("Supercharging Img is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void superchargingHeaderModalVerification() {
        boolean superchargingHeaderVer = superchargingHeader.isDisplayed();
        if (superchargingHeaderVer) {
            System.out.println("Supercharging Header is displayed! >>> PASS");
        } else {
            System.out.println("Supercharging Header is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void superchargingLearnModalVerification() {
        boolean superchargingLearnVer = superchargingLearn.isDisplayed();
        if (superchargingLearnVer) {
            System.out.println("Supercharging Learn is displayed! >>> PASS");
        } else {
            System.out.println("Supercharging Learn is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void superchargingFindModalVerification() {
        boolean superchargingFindVer = superchargingFind.isDisplayed();
        if (superchargingFindVer) {
            System.out.println("Supercharging Find is displayed! >>> PASS");
        } else {
            System.out.println("Supercharging Find is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void chargingCalculatorModalVerification() {
        boolean chargingCalculatorVer = chargingCalculator.isDisplayed();
        if (chargingCalculatorVer) {
            System.out.println("Charging Calculator is displayed! >>> PASS");
        } else {
            System.out.println("Charging Calculator is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void tripPlannerModalVerification() {
        boolean tripPlannerVer = tripPlanner.isDisplayed();
        if (tripPlannerVer) {
            System.out.println("Trip Planer is displayed! >>> PASS");
        } else {
            System.out.println("Trip Planer is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void superchargerVotingModalVerification() {
        boolean superchargerVotingVer = superchargerVoting.isDisplayed();
        if (superchargerVotingVer) {
            System.out.println("Supercharger Voting is displayed! >>> PASS");
        } else {
            System.out.println("Supercharger Voting is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void hostASuperchargerModalVerification() {
        boolean hostASuperchargerVer = hostASupercharger.isDisplayed();
        if (hostASuperchargerVer) {
            System.out.println("Host A Supercharger is displayed! >>> PASS");
        } else {
            System.out.println("Host A Supercharger is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void commercialChargingModalVerification() {
        boolean commercialChargingVer = commercialCharging.isDisplayed();
        if (commercialChargingVer) {
            System.out.println("Commercial Charging is displayed! >>> PASS");
        } else {
            System.out.println("Commercial Charging is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void hostWallConnectorsModalVerification() {
        boolean hostWallConnectorsVer = hostWallConnectors.isDisplayed();
        if (hostWallConnectorsVer) {
            System.out.println("Host Wall Connectors is displayed! >>> PASS");
        } else {
            System.out.println("Host Wall Connectors is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }

    //----------------------------------------Discover Modal Panel----------------------------------------

    public void hoverOnDiscover() throws InterruptedException {
        action.moveToElement(discoverSpan).perform();
        Thread.sleep(1000);
    }
    public void hoverOnInsurance() {
        action.moveToElement(insuranceDiscover).perform();
    }

    public void resourcesModalVerification() {
        boolean resourcesVer = resources.isDisplayed();
        if (resourcesVer) {
            System.out.println("Resources is displayed! >>> PASS");
        } else {
            System.out.println("Resources is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void locationServicesModalVerification() {
        boolean locationServicesVer = locationServices.isDisplayed();
        if (locationServicesVer) {
            System.out.println("Location Services is displayed! >>> PASS");
        } else {
            System.out.println("Location Services is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void companyModalVerification() {
        boolean companyVer = company.isDisplayed();
        if (companyVer) {
            System.out.println("Company is displayed! >>> PASS");
        } else {
            System.out.println("Company is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }

    public void demoDriveDiscoverVerification() {
        boolean demoDriveDiscoverVer = demoDriveDiscover.isDisplayed();
        if (demoDriveDiscoverVer) {
            System.out.println("Demo Drive in Discover is displayed! >>> PASS");
        } else {
            System.out.println("Demo Drive in Discover is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void insuranceDiscoverVerification() {
        boolean insuranceDiscoverVer = insuranceDiscover.isDisplayed();
        if (insuranceDiscoverVer) {
            System.out.println("Insurance in Discover is displayed! >>> PASS");
        } else {
            System.out.println("Insurance in Discover is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void videoGuideDiscoverVerification() {
        boolean videoGuidesDiscoverVer = videoGuidesDiscover.isDisplayed();
        if (videoGuidesDiscoverVer) {
            System.out.println("Video Guides in Discover is displayed! >>> PASS");
        } else {
            System.out.println("Video Guides in Discover is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void customersStoriesDiscoverVerification() {
        boolean customersStoriesVer = customerStoriesDiscover.isDisplayed();
        if (customersStoriesVer) {
            System.out.println("Customer Stories in Discover is displayed! >>> PASS");
        } else {
            System.out.println("Customer Stories in Discover is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void eventsDiscoverVerification() {
        boolean eventsDiscoverVer = eventsDiscover.isDisplayed();
        if (eventsDiscoverVer) {
            System.out.println("Events in Discover is displayed! >>> PASS");
        } else {
            System.out.println("Events in Discover is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void findUsDiscoverVerification() {
        boolean findUsDiscoverVer = findUsDiscover.isDisplayed();
        if (findUsDiscoverVer) {
            System.out.println("Find Us in Discover is displayed! >>> PASS");
        } else {
            System.out.println("Find Us in Discover is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void tripPlannerDiscoverVerification() {
        boolean tripPlannerDiscoverVer = tripPlannerDiscover.isDisplayed();
        if (tripPlannerDiscoverVer) {
            System.out.println("Trip Planner in Discover is displayed! >>> PASS");
        } else {
            System.out.println("Trip Planner in Discover is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void findACollisionCenterDiscoverVerification() {
        boolean findACollisionCenterDiscoverVer = findACollisionCenterDiscover.isDisplayed();
        if (findACollisionCenterDiscoverVer) {
            System.out.println("Find a Collision Center in Discover is displayed! >>> PASS");
        } else {
            System.out.println("Find a Collision Center in Discover is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void findACertifiedInstallerDiscoverVerification() {
        boolean findACertifiedInstallerDiscoverVer = findACertifiedInstallerDiscover.isDisplayed();
        if (findACertifiedInstallerDiscoverVer) {
            System.out.println("Find a Certified Installer is displayed! >>> PASS");
        } else {
            System.out.println("Find a Certified Installer is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void aboutDiscoverVerification() {
        boolean aboutDiscoverVer = aboutDiscover.isDisplayed();
        if (aboutDiscoverVer) {
            System.out.println("About in Discover is displayed! >>> PASS");
        } else {
            System.out.println("About in Discover is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void careersDiscoverVerification() {
        boolean careersDiscoverVer = careersDiscover.isDisplayed();
        if (careersDiscoverVer) {
            System.out.println("Careers in Discover is displayed! >>> PASS");
        } else {
            System.out.println("Careers in Discover is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void investorRelationsDiscoverVerification() {
        boolean investorRelationsDiscoverVer = investorRelationsDiscover.isDisplayed();
        if (investorRelationsDiscoverVer) {
            System.out.println("Investor Relations in Discover is displayed! >>> PASS");
        } else {
            System.out.println("Investor Relations in Discover is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }

    //----------------------------------------Discover Modal Panel----------------------------------------
    public void hoverOnShop() throws InterruptedException {
        action.moveToElement(shopSpan).perform();
        Thread.sleep(1000);
    }
    public void hoverOnChargingImgShop() {
        action.moveToElement(chargingImgShop).perform();
    }
    public void chargingImgShopVerification() {
        boolean chargingImgShopVer = chargingImgShop.isDisplayed();
        if (chargingImgShopVer) {
            System.out.println("Charging Img in Shop is displayed! >>> PASS");
        } else {
            System.out.println("Charging Img in Shop is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void chargingHeaderShopVerification() {
        boolean chargingHeaderShopVer = chargingHeaderShop.isDisplayed();
        if (chargingHeaderShopVer) {
            System.out.println("Charging Header in Shop is displayed! >>> PASS");
        } else {
            System.out.println("Charging Header in Shop is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void vehicleAccessoriesImgShopVerification() {
        boolean vehicleAccessoriesImgShopVer = vehicleAccessoriesImgShop.isDisplayed();
        if (vehicleAccessoriesImgShopVer) {
            System.out.println("Vehicle Accessories Img in Shop is displayed! >>> PASS");
        } else {
            System.out.println("Vehicle Accessories Img in Shop is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void vehicleAccessoriesHeaderShopVerification() {
        boolean vehicleAccessoriesHeaderShopVer = vehicleAccessoriesHeaderShop.isDisplayed();
        if (vehicleAccessoriesHeaderShopVer) {
            System.out.println("Vehicle Accessories Header in Shop is displayed! >>> PASS");
        } else {
            System.out.println("Vehicle Accessories Header in Shop is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void apparelImgShopVerification() {
        boolean apparelImgShopVer = apparelImgShop.isDisplayed();
        if (apparelImgShopVer) {
            System.out.println("Apparel Img in Shop is displayed! >>> PASS");
        } else {
            System.out.println("Apparel Img in Shop is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void apparelHeaderShopVerification() {
        boolean apparelHeaderShopVer = apparelHeaderShop.isDisplayed();
        if (apparelHeaderShopVer) {
            System.out.println("Apparel Header in Shop is displayed! >>> PASS");
        } else {
            System.out.println("Apparel Header in Shop is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void lifeStyleImgShopVerification() {
        boolean lifeStyleImgShopVer = lifeStyleImgShop.isDisplayed();
        if (lifeStyleImgShopVer) {
            System.out.println("Lifestyle Img in Shop is displayed! >>> PASS");
        } else {
            System.out.println("Lifestyle Img in Shop is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void lifeStyleHeaderShopVerification() {
        boolean lifeStyleHeaderShopVer = lifeStyleHeaderShop.isDisplayed();
        if (lifeStyleHeaderShopVer) {
            System.out.println("Lifestyle Header in Shop is displayed! >>> PASS");
        } else {
            System.out.println("Lifestyle Header in Shop is NOT displayed! >>>>>>>>>>>>>>>>>>>>>>>>> FAIL " );
        }
    }
    public void clickAccount() {
        accountIcon.click();
        wait.until(ExpectedConditions.elementToBeClickable(loginPage.emailField));
    }
    public void clickOnModelSImg() {
        modelSImg.click();

    }
}

