package locators;

import org.openqa.selenium.By;

public enum CharacteristicsLocators implements Locator {
    SCREEN_SIZE_VALUE(By.xpath("//dd[@class='product-characteristics__value'][1]")),
    PROCESSOR_VALUE(By.xpath("//dd[@class='product-characteristics__value'][2]")),
    SCREEN_REFRESHING_RATE_VALUE(By.xpath("//dd[@class='product-characteristics__value'][3]")),
    RAM_SIZE_VALUE(By.xpath("//dd[@class='product-characteristics__value'][4]")),
    OS_TYPE_VALUE(By.xpath("//dd[@class='product-characteristics__value'][6]")),
    COLOR_VALUE(By.xpath("//dd[@class='product-characteristics__value'][7]")),
    PROCESSOR_GENERATION_VALUE(By.xpath("//dd[@class='product-characteristics__value'][8]")),
    KEYBOARD_VALUE(By.xpath("//dd[@class='product-characteristics__value'][9]")),
    HDD_SIZE_VALUE(By.xpath("//dd[@class='product-characteristics__value'][10]")),
    CD_ROM_VALUE(By.xpath("//dd[@class='product-characteristics__value'][11]")),
    BATTERY_VALUE(By.xpath("//dd[@class='product-characteristics__value'][12]")),
    EXTRA_RAM_SLOTS(By.xpath("//dd[@class='product-characteristics__value'][13]")),
    PRODUCING_COUNTRY_VALUE(By.xpath("//dd[@class='product-characteristics__value'][22]")),
    BRAND_COUNTRY_VALUE(By.xpath("//dd[@class='product-characteristics__value'][24]")),
    GUARANTEE(By.xpath("//dd[@class='product-characteristics__value'][25]"));

    @Override
    public By getPath() {
        return path;
    }

    private By path;
    private CharacteristicsLocators(By path) {
        this.path = path;
    }

}
