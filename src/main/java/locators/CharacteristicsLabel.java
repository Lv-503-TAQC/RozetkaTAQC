package locators;

import org.openqa.selenium.By;

public enum CharacteristicsLabel implements Locator {
    SCREEN_SIZE_LABEL(By.xpath("//dt[@class='product-characteristics__label'][1]")),
    PROCESSOR_VALUE_LABEL(By.xpath("//dt[@class='product-characteristics__label'][2]")),
    SCREEN_REFRESHING_RATE_LABEL(By.xpath("//dt[@class='product-characteristics__label'][3]")),
    RAM_SIZE_LABEL(By.xpath("//dt[@class='product-characteristics__label'][4]")),
    SHORT_CHARACTERISTICS_LABEL(By.xpath("//dt[@class='product-characteristics__label'][5]")),
    OS_TYPE_LABEL(By.xpath("//dt[@class='product-characteristics__label'][6]")),
    COLOR_LABEL(By.xpath("//dt[@class='product-characteristics__label'][7]")),
    PROCESSOR_GENERATION_LABEL(By.xpath("//dt[@class='product-characteristics__label'][8]")),
    KEYBOARD_LABEL(By.xpath("//dt[@class='product-characteristics__label'][9]")),
    HDD_SIZE_LABEL(By.xpath("//dt[@class='product-characteristics__label'][10]")),
    CD_ROM_LABEL(By.xpath("//dt[@class='product-characteristics__label'][11]")),
    BATTERY_LABEL(By.xpath("//dt[@class='product-characteristics__label'][12]")),
    EXTRA_RAM_SLOTS_LABEL(By.xpath("//dt[@class='product-characteristics__label'][13]")),
    WEIGHT_LABEL(By.xpath("//dt[@class='product-characteristics__label'][14]")),
    RAM_TYPE_LABEL(By.xpath("//dt[@class='product-characteristics__label'][15]")),
    ADDITIONAL_FEATURES_LABEL(By.xpath("//dt[@class='product-characteristics__label'][16]")),
    GRAPHIC_ADAPTER_LABEL(By.xpath("//dt[@class='product-characteristics__label'][17]")),
    NETWORK_ADAPTER_LABEL(By.xpath("//dt[@class='product-characteristics__label'][18]")),
    CONNECTORS_PORTS_LABEL(By.xpath("//dt[@class='product-characteristics__label'][19]")),
    BATTERY_CHARACTERISTICS_LABEL(By.xpath("//dt[@class='product-characteristics__label'][20]")),
    DIMENSIONS_LABEL(By.xpath("//dt[@class='product-characteristics__label'][21]")),
    PRODUCING_COUNTRY_LABEL(By.xpath("//dt[@class='product-characteristics__label'][22]")),
    CONTENTS_OF_DELIVERY_LABEL(By.xpath("//dt[@class='product-characteristics__label'][23]")),
    BRAND_COUNTRY_LABEL(By.xpath("//dt[@class='product-characteristics__label'][24]")),
    GUARANTEE_LABEL(By.xpath("//dt[@class='product-characteristics__label'][25]"));


    @Override
    public By getPath() {
        return path;
    }

    private By path;
    private CharacteristicsLabel(By path) {
        this.path = path;
    }

}
