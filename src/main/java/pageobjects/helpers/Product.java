package pageobjects.helpers;

import locators.ProductLocators;
import org.openqa.selenium.WebDriver;
import pageobjects.ComparisonPO;

public interface Product {
    WebDriver getDriver();
    String getUrl();

    //клік на кнопку додати до порівнянь
    default void addToCompareList() {
        WebDriver driver = getDriver();
        if(driver.findElements(ProductLocators.BUTTON_COMPARE.getPath()).size() > 0) {
            driver.findElement(ProductLocators.BUTTON_COMPARE.getPath()).click();
        } else {
            System.err.println(Hacks.sms("this product is already added to comparing list"));
        }
    }

    //другий клік по кнопці порівнянь продукта, який переведе на сторінку ComparisonPO
    default ComparisonPO moveToComparison() {
        addToCompareList();
        getDriver().findElement(ProductLocators.BUTTON_COMPARE_ACTIVE.getPath()).click();
        return new ComparisonPO(getDriver(), getUrl());
    }
}
