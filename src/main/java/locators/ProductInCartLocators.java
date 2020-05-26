package locators;

import org.openqa.selenium.By;

public enum ProductInCartLocators implements Locator{

    PRODUCT_PRICE_MODAL(By.xpath(".//*[@class='cart-modal__sum']//span[@class='cart-modal__coast-digits']"));

    @Override
    public By getPath() {
        return path;
    }

    private By path;
    private ProductInCartLocators(By path) {
        this.path = path;
    }

}
