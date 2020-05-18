package pageobjects;

import locators.AllAboutProductLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageelements.Button;
import pageelements.TextField;
import java.util.List;

public class AllAboutItemTabPageObject extends BasePageObject{

    private List<WebElement> optionList;
    private List<WebElement> serviceList;
    private String sellerName;
    private String sellerInfo;
    private List<WebElement> bonusPicktos;
    private Button chooseCity;
    private Button premiumDelivery;
    private List<WebElement> productPicktos;
    private String productBrief;

    public AllAboutItemTabPageObject(WebDriver driver) {
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

    public String getSellername(){
        sellerName = new TextField (driver,AllAboutProductLocators.SELLER_INFO).getText();
        return sellerName;

    }

    public String getSellerInfo(){
        sellerInfo = new TextField (driver,AllAboutProductLocators.SELLER_INFO).getText();
        return sellerInfo;

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
     * @return AllAboutItemTab
     * work in progress!
     */
    public AllAboutItemTabPageObject setDeliveryCity() {
        chooseCity = new Button(driver, AllAboutProductLocators.DELIVERY_CITY_MODAL).click();
        return this;
    }

    /**
     * go to the page with all the details about Premium delivery
     * @return AllAboutItemTab
     */
    public AllAboutItemTabPageObject goToPremiumDeliveryDetails(){
        premiumDelivery = new Button(driver,AllAboutProductLocators.PREMIUM_DELIVERY_LINK).click();
        return new AllAboutItemTabPageObject(driver);

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

}

