package locators;

import org.openqa.selenium.By;

public enum CartModalWindowLocators implements Locator {
    PRODUCT_PRICE_MODAL(By.xpath("//li[@class='cart-modal__item']//*[@class='cart-modal__sum']//span[@class='cart-modal__coast-digits']")),
    CART_TOTAL_MODAL(By.cssSelector(".cart-modal__check-digits"));


    @Override
    public By getPath() {
        return path;
    }

    private By path;
    private CartModalWindowLocators(By path) {
        this.path = path;
    }

}
