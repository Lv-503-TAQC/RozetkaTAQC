package pageobjects;

import locators.ActionsWithProductsLocators;
import org.openqa.selenium.WebDriver;
import pageelements.Button;
import pageelements.TextField;

public class ActionsWithProductsBlockPageObject extends BasePageObject{

    private Button addToCart;
    private Button addToCompareList;
    private Button addToWishList;
    private String creditInfo;
    private Button buyOnCredit;

    public ActionsWithProductsBlockPageObject(WebDriver driver) {
        super(driver);
    }

    public ActionsWithProductsBlockPageObject addToCart() {
        addToCart = new Button(driver, ActionsWithProductsLocators.ADD_TO_CART_BUTTON).click();
        return this;
    }

    public ActionsWithProductsBlockPageObject addToCompareList() {
        addToCompareList = new Button(driver, ActionsWithProductsLocators.ADD_TO_COMPARE_LIST_BUTTON).click();
        return this;
    }

    public ActionsWithProductsBlockPageObject addToWishList() {
        addToWishList = new Button(driver, ActionsWithProductsLocators.ADD_TO_WISH_LIST).click();
        return this;

    }

    public String getCreditInfo(){
        creditInfo = new TextField(driver,ActionsWithProductsLocators.CREDIT_INFO).getText();
        return creditInfo;

    }

    public ActionsWithProductsBlockPageObject setDeliveryCity() {
        buyOnCredit = new Button(driver, ActionsWithProductsLocators.BUY_ON_CREDIT).click();
        return this;
    }
}

