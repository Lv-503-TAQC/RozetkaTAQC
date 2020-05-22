package pageelements;

import locators.Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BaseElement {
    protected WebDriver driver;
    public WebElement element;
    protected By path;

    public BaseElement(WebDriver driver, Locator locator) {
        this.driver = driver;
        this.path = locator.getPath();
        element = driver.findElement(path);
    }

    public BaseElement(WebElement elementToParse, Locator locator) {
        path = locator.getPath();
        element = elementToParse.findElement(path);
    }

    public BaseElement(WebElement element) {

        this.element = element;
    }

}