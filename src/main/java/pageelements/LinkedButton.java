package pageelements;

import locators.Locator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkedButton extends Button {


    public LinkedButton(WebDriver driver, Locator locator) {
        super(driver, locator);
    }

    public LinkedButton(WebElement elementToParse, Locator locator) {
        super(elementToParse, locator);
    }

    public LinkedButton(WebElement element) {
        super(element);
    }

    public Button click() {
        this.element.click();
        return this;
    }
}
