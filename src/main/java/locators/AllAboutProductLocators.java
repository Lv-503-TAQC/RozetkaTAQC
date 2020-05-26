package locators;

import org.openqa.selenium.By;

public enum AllAboutProductLocators implements Locator {
    PRODUCT_OPTIONS(By.xpath("//*[@class = 'product-main__parameters']//li")),
    IN_STOCK_STRING(By.xpath("//*[contains (@class,'product__status')]")),
    NOTIF_WHEN_IN_STOCK_BTN(By.xpath("//*[@class = 'product-statuses']//button")),
    //This_will_diet to find the list of all the additional cervices
    ADDITIONAL_SERVICES_LIST(By.xpath("//*[@class = 'additional-services']//li")),
    SELLER_NAME(By.xpath("//*[@class = 'product-seller__title']")),
    SELLER_FEEDBACK(By.xpath("//*[@class = 'product-seller__feedback']")),
    SELLER_LOGO(By.xpath("//*[@class = 'product-seller__logo']//img")),
    //This_will_diet to find the list of all the pictograms
    BONUS_PICTOGRAMS_LIST(By.xpath("//*[@class = 'product-about__right']//li//img")),
    DELIVERY_CITY_MODAL(By.xpath("//*[@class = 'product-about__block-heading']//button")),
    //Locators for delivery city modal window should be added here
    PREMIUM_DELIVERY_LINK(By.xpath("//*[contains (@class, 'product-premium__button')]")),
    PRODUCT_PICTOGRAMS_LIST(By.xpath("//*[@class = 'product-about__sticky']//app-product-pictogram-list//li//img")),
    PRODUCT_INFO_BRIEF(By.xpath("//*[@class = 'product-about__brief']")),
    DETAILED_PRODUCT_INFO_LINK(By.xpath("//a[@class = 'product-about__description-anchor']"));

    @Override
    public By getPath() {
        return path;
    }

    private By path;
    private AllAboutProductLocators(By path) {

        this.path = path;
    }

}
