package locators;

import org.openqa.selenium.By;

public enum CartModalWindowLocators implements Locator {
    CART_TOTAL_MODAL(By.cssSelector(".cart-modal__check-digits")),
    PRODUCT_IN_CART(By.xpath("//li[@class='cart-modal__item']"));


    @Override
    public By getPath() {
        return path;
    }

    private By path;
    private CartModalWindowLocators(By path) {
        this.path = path;
    }

}
