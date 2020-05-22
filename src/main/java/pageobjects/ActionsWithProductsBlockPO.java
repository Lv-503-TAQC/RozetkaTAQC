package pageobjects;

import org.openqa.selenium.WebDriver;
import pageelements.Button;
import pageelements.TextField;

import static locators.ActionsWithProductsLocators.*;

public class ActionsWithProductsBlockPO extends BasePageObject{

    private Button addToCart;
    private Button addToCompareList;
    private Button addToWishList;
    private String creditInfo;
    private Button buyOnCredit;

    public ActionsWithProductsBlockPO(WebDriver driver) {
        super(driver);
    }

    public ActionsWithProductsBlockPO addToCart() {
        addToCart = new Button(driver, ADD_TO_CART_BUTTON).click();
        return this;
    }

    public ActionsWithProductsBlockPO addToCompareList() {
        addToCompareList = new Button(driver, ADD_TO_COMPARE_LIST_BUTTON).click();
        return this;
    }

    public ActionsWithProductsBlockPO addToWishList() {
        addToWishList = new Button(driver, ADD_TO_WISH_LIST).click();
        return this;

    }

    public String getCreditInfo(){
        creditInfo = new TextField(driver, CREDIT_INFO).getText();
        return creditInfo;

    }

    public ActionsWithProductsBlockPO setDeliveryCity() {
        buyOnCredit = new Button(driver, BUY_ON_CREDIT).click();
        return this;
    }
}

