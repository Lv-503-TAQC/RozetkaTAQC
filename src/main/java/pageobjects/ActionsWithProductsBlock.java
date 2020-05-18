package pageobjects;

import locators.ActionsWithProductsLocators;
import locators.AllAboutProductLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageelements.Button;
import pageelements.TextField;

import java.util.List;

public class ActionsWithProductsBlock extends BasePageObject{

    private Button addToCart;
    private Button addToCompareList;
    private Button addToWishList;
    private String creditInfo;
    private Button buyOnCredit;

    public ActionsWithProductsBlock(WebDriver driver) {
        super(driver);
    }

    public ActionsWithProductsBlock addToCart() {
        addToCart = new Button(driver, ActionsWithProductsLocators.ADD_TO_CART_BUTTON).click();
        return this;
    }

    public ActionsWithProductsBlock addToCompareList() {
        addToCompareList = new Button(driver, ActionsWithProductsLocators.ADD_TO_COMPARE_LIST_BUTTON).click();
        return this;
    }

    public ActionsWithProductsBlock addToWishList() {
        addToWishList = new Button(driver, ActionsWithProductsLocators.ADD_TO_WISH_LIST).click();
        return this;

    }

    public String getCreditInfo(){
        creditInfo = new TextField(driver,ActionsWithProductsLocators.CREDIT_INFO).getText();
        return creditInfo;

    }

    public ActionsWithProductsBlock setDeliveryCity() {
        buyOnCredit = new Button(driver, ActionsWithProductsLocators.BUY_ON_CREDIT).click();
        return this;
    }
}

