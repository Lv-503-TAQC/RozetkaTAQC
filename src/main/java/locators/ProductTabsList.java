package locators;

import org.openqa.selenium.By;

public enum ProductTabsList implements Locator {
    ALL_ABOUT_PRODUCT_TAB(By.xpath("//*[@class = 'product-tabs__list']/li[1]")),
    PRODUCT_REVIEW_TAB(By.xpath("//*[@class = 'product-tabs__list']/li[3]"));


    @Override
    public By getPath() {
        return path;
    }

    private By path;
    private ProductTabsList(By path) {
        this.path = path;
    }

}
