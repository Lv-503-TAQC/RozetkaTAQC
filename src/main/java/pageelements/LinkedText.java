package pageelements;

import locators.Locator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkedText extends TextField {


    public LinkedText(WebDriver driver, Locator locator) {
        super(driver, locator);
    }

    public LinkedText(WebElement elementToParse, Locator locator) {
        super(elementToParse, locator);
    }

    public LinkedText(WebElement element) {
        super(element);
    }

    public TextField click() {
        this.element.click();
        return this;
    }

    public String getAttribute(String attribute) {
        return this.element.getAttribute(attribute);
    }
}