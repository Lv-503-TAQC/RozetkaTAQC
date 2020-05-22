package locators;

import org.openqa.selenium.By;

public enum CharacteristicsList implements Locator {
    CHARACTERISTIC_LINK(By.xpath("//a[@class='product-tabs__link product-tabs__link_state_active']")),
    CHARACTERISTICS_BODY(By.xpath("//*[@class='product-tabs__body']")),
    CHARACTERISTICS_ELEMENTS_SECTION(By.xpath("//section[@class='product-characteristics__group']")),
    PRODUCT_CHARACTERISTICS_DATA_LIST(By.xpath("//dl[@class='product-characteristics__list']"));

    @Override
    public By getPath() {
        return path;
    }

    private By path;
    private CharacteristicsList(By path) {
        this.path = path;
    }

}
