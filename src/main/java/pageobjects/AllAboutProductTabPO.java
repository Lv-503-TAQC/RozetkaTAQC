package pageobjects;

import locators.AllAboutProductLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageelements.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static locators.ProductServicesLocators.ADDITIONAL_SERVICE_PRICE;


public class AllAboutProductTabPO extends BasePageObject {


    private List<WebElement> prodOptionList;
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

    public ActionsWithProductsBlockPO getProducActionsBlock() {

        return new ActionsWithProductsBlockPO(driver);
    }


    /**
     * @return list of all the available options to the product
     */
    public List<WebElement> createListOfProductOptions() {
        prodOptionList = driver.findElements(AllAboutProductLocators.PRODUCT_OPTIONS.getPath());
        return prodOptionList;
    }

    /**
     * @return ProductServicesBlockPO  - page object, which contains list of all product services
     */
    public ProductServicesBlockPO getProductServicesBlock() {

        return new ProductServicesBlockPO(driver);
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
        bonusPicktos = driver.findElements(AllAboutProductLocators.BONUS_PICTOGRAMS_LIST.getPath());
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
        productPicktos = driver.findElements(AllAboutProductLocators.PRODUCT_PICTOGRAMS_LIST.getPath());
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

