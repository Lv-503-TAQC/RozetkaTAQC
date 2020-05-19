package pageobjects;

import locators.AllAboutProductLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageelements.*;

import java.util.List;

public class AllAboutProductTabPO extends BasePageObject {

    private List<WebElement> prodOptionList;
    private List<WebElement> serviceList;
    private WebElement serviceDropdown;
    private String sellerName;
    private String sellerFeedback;
    private List<WebElement> bonusPicktos;
    private TextField chooseCity;
    private Button premiumDelivery;
    private List<WebElement> productPicktos;
    private String productBrief;
    private String confirmInStock;
    private String confirmOutOfStock;
    private Button notifyWhenInStock;
    private TextField detailedInfoLink;

    public AllAboutProductTabPO(WebDriver driver) {
        super(driver);
    }

    /**
     * @return list of all the available options to the product
     */
    public List<WebElement> createListOfProductOptions() {
        prodOptionList = driver.findElements(By.xpath(AllAboutProductLocators.PRODUCT_OPTIONS));
        return prodOptionList;
    }

    /**
     * @return list of all the available additional services to the product
     */
    public List<WebElement> createListOfCervices() {
        serviceList = driver.findElements(By.xpath(AllAboutProductLocators.ADDITIONAL_SERVICES_LIST));
        return serviceList;
    }

    public String getSellerName() {
        sellerName = new TextField(driver, AllAboutProductLocators.SELLER_NAME).getText();
        return sellerName;

    }

    public String getSellerFeedback() {
        sellerFeedback = new TextField(driver, AllAboutProductLocators.SELLER_FEEDBACK).getText();
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
     *
     * @return AllAboutProductTabPageObject
     * work in progress!
     */
    public AllAboutProductTabPO setDeliveryCity() {
        chooseCity = new LinkedText(driver, AllAboutProductLocators.DELIVERY_CITY_MODAL).click();
        return this;
    }

    /**
     * go to the page with all the details about Premium delivery
     *
     * @return AllAboutProductTabPageObject
     */
    public AllAboutProductTabPO goToPremiumDeliveryDetails() {
        premiumDelivery = new LinkedButton(driver, AllAboutProductLocators.PREMIUM_DELIVERY_LINK).click();
        return this;

    }

    /**
     * @return list of all the picktograms which inform user about bonuses
     */
    private List<WebElement> createListOfProductPicto() {
        productPicktos = driver.findElements(By.xpath(AllAboutProductLocators.PRODUCT_PICTOGRAMS_LIST));
        return productPicktos;
    }

    public String getProductBriefInfo() {
        productBrief = new TextField(driver, AllAboutProductLocators.PRODUCT_INFO_BRIEF).getText();
        return productBrief;

    }

    public AllAboutProductTabPO goToDetailedInfo() {
        detailedInfoLink = new LinkedText(driver, AllAboutProductLocators.DETAILED_PRODUCT_INFO_LINK).click();
        return this;

    }

}

