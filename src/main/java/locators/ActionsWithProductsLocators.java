package locators;

import org.openqa.selenium.By;

public enum ActionsWithProductsLocators implements Locator {
    ADD_TO_CART_BUTTON(By.xpath("//*[@class='product__buy']//button")),
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
