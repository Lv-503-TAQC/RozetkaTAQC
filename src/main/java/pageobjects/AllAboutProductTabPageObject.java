package pageobjects;

import locators.AllAboutProductLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageelements.*;

import java.util.List;

public class AllAboutProductTabPageObject extends BasePageObject{

    private List<WebElement> optionList;
    private List<WebElement> serviceList;
    private String sellerName;
    private String sellerFeedback;
    private List<WebElement> bonusPicktos;
    private Button chooseCity;
    private Button premiumDelivery;
    private List<WebElement> productPicktos;
    private String productBrief;
    private String confirmInStock;
    private String confirmOutOfStock;
    private Button notifyWhenInStock;
    private Label detailedInfoLink;

    public AllAboutProductTabPageObject(WebDriver driver) {
        super(driver);
    }

    /**
     * @return list of all the available options to the product
     */
    private List<WebElement> createListOfProductOptions() {
        optionList = driver.findElements(By.xpath(AllAboutProductLocators.PRODUCT_OPTIONS));
        return optionList;
    }

    /**
     * @return list of all the available additional services to the product
     */
    private List<WebElement> createListOfCervices() {
        serviceList = driver.findElements(By.xpath(AllAboutProductLocators.ADDITIONAL_SERVICES_LIST));
        return serviceList;
    }

    public String getSellerName(){
        sellerName = new TextField (driver,AllAboutProductLocators.SELLER_NAME).getText();
        return sellerName;

    }

    public String getSellerFeedback(){
        sellerFeedback = new TextField (driver,AllAboutProductLocators.SELLER_FEEDBACK).getText();
        return sellerFeedback;

    }

    /**
     * @return list of all the picktograms which inform user about bonuses
     */
    private List<WebElement> createListOfBonusPicto() {
        bonusPicktos = driver.findElements(By.xpath(AllAboutProductLocators.BONUS_PICTOGRAMS_LIST));
        return bonusPicktos;
    }

    /**
     * select delivery city in modal window
     * @return AllAboutProductTabPageObject
     * work in progress!
     */
    public AllAboutProductTabPageObject setDeliveryCity() {
        chooseCity = new Button(driver, AllAboutProductLocators.DELIVERY_CITY_MODAL).click();
        return this;
    }

    /**
     * go to the page with all the details about Premium delivery
     * @return AllAboutProductTabPageObject
     */
    public AllAboutProductTabPageObject goToPremiumDeliveryDetails(){
        premiumDelivery = new LinkedButton(driver,AllAboutProductLocators.PREMIUM_DELIVERY_LINK).click();
        return this;

    }

    /**
     * @return list of all the picktograms which inform user about bonuses
     */
    private List<WebElement> createListOfProductPicto() {
        productPicktos = driver.findElements(By.xpath(AllAboutProductLocators.PRODUCT_PICTOGRAMS_LIST));
        return productPicktos;
    }

    public String getProductBriefInfo(){
        productBrief = new TextField (driver,AllAboutProductLocators.PRODUCT_INFO_BRIEF).getText();
        return productBrief;

    }

    public String confirmInStock(){
        confirmInStock = new TextField (driver,AllAboutProductLocators.PRODUCT_IN_STOCK).getText();
        return confirmInStock;

    }

    public String confirmOutOfStock(){
        confirmOutOfStock = new TextField (driver,AllAboutProductLocators.PRODUCT_OUT_OF_STOCK).getText();
        return confirmOutOfStock;

    }

    public AllAboutProductTabPageObject notifyWhenInStock() {
        notifyWhenInStock = new Button(driver, AllAboutProductLocators.NOTIF_WHEN_IN_STOCK_BTN).click();
        return this;
    }

    public AllAboutProductTabPageObject goToDetailedInfo(){
        detailedInfoLink = new LinkedLabel(driver,AllAboutProductLocators. DETAILED_PRODUCT_INFO_LINK).click();
        return this;

    }

}

