package locators;

import org.openqa.selenium.By;

public enum ActionsWithProductsLocators implements Locator {
    PRODUCT_PRICE(By.cssSelector("[class*='product-prices__big']")),
    ADD_TO_CART_BTN(By.xpath("//*[@class='product__buy']//button")),
    ADDED_TO_CART_BTN(By.cssSelector("[class*='buy-button_state_in-cart']")),
    ADD_TO_COMPARE_LIST_BUTTON(By.xpath("//*[@class = 'product__compare']//button")),
    ADD_TO_WISH_LIST(By.xpath("//*[@class = 'product__favorites']//button")),
    CREDIT_INFO(By.xpath("//*[@class='product-credit__info']")),
    BUY_ON_CREDIT(By.xpath("//*[@class = 'product-credit']//button"));



    @Override
    public By getPath() {
        return path;
    }

    private By path;
    private ActionsWithProductsLocators(By path) {
        this.path = path;
    }

}
