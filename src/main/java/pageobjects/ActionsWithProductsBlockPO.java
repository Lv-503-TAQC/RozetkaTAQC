package pageobjects;

import locators.ActionsWithProductsLocators;
import org.openqa.selenium.WebDriver;
import pageelements.Button;
import pageelements.TextField;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class ActionsWithProductsBlockPO extends BasePageObject{

    private int prodPrice;
    private Button addToCart;
    private Button addToCompareList;
    private Button addToWishList;
    private String creditInfo;
    private Button buyOnCredit;
    private Button isAddedToCart;

    public ActionsWithProductsBlockPO(WebDriver driver) {
        super(driver);
    }

    public CartModalWindowPO getCartModal(){
        return new CartModalWindowPO(driver);
    }

    public int getProdPrice(){
            String priceString = new TextField(driver, ActionsWithProductsLocators.PRODUCT_PRICE).getText();
            Pattern p = Pattern.compile("[0-9]+");
            Matcher m = p.matcher(priceString);

            if (m.find()) {
                prodPrice = Integer.parseInt(priceString);
            }
            return prodPrice;
    }

    public ActionsWithProductsBlockPO addToCart() {
        addToCart = new Button(driver, ActionsWithProductsLocators.ADD_TO_CART_BTN).click();
        return this;
    }

    public ActionsWithProductsBlockPO addToCompareList() {
        addToCompareList = new Button(driver, ActionsWithProductsLocators.ADD_TO_COMPARE_LIST_BUTTON).click();
        return this;
    }

    public ActionsWithProductsBlockPO addToWishList() {
        addToWishList = new Button(driver, ActionsWithProductsLocators.ADD_TO_WISH_LIST).click();
        return this;

    }

    public String getCreditInfo(){
        creditInfo = new TextField(driver, ActionsWithProductsLocators.CREDIT_INFO).getText();
        return creditInfo;

    }

    public ActionsWithProductsBlockPO setDeliveryCity() {
        buyOnCredit = new Button(driver, ActionsWithProductsLocators.BUY_ON_CREDIT).click();
        return this;
    }
    public ActionsWithProductsBlockPO isAddedToCart(){
        isAddedToCart = new Button(driver, ActionsWithProductsLocators.ADDED_TO_CART_BTN).isDisplayed();
        return this;
    }
}

