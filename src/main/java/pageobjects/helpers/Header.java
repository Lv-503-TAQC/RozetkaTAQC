package pageobjects.helpers;

import locators.HeaderLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageobjects.ComparisonPO;

import java.util.List;


public interface Header {
    WebDriver getDriver();
    String getUrl();


    //наведення мишки на кнопку порівнянь в хедері. Вспливає вікно стану порівнянь
    default void comparisonButtonHover() {
        Actions builder = new Actions(this.getDriver());
        builder.moveToElement(getDriver().findElement(HeaderLocators.COMPARISON.getPath())).perform();
    }

    //перевірка, чи є продукти, готові до порівняння
    default boolean isComparisonEmpty() {
        List<WebElement> dummy = getDriver().findElements(HeaderLocators.HEADER_COMPARISON_DUMMY.getPath());
        System.out.println(dummy.size());
        return dummy.size() == 1;
    }

    //із списку можливих порівнянь вибір та перехід до конкретного
    default ComparisonPO getComparisonPO(int index) {
        comparisonButtonHover();
        List<WebElement> comparisonList = getDriver().findElements(HeaderLocators.HEADER_COMPARISON_LI.getPath());
        comparisonList.get(index).click();
        return new ComparisonPO(this.getDriver(), this.getUrl());
    }

    //перехід до першого(можливо єдиного) елементу списку порівнянь
    default ComparisonPO getComparisonPO() {
        return getComparisonPO(0);
    }



}
