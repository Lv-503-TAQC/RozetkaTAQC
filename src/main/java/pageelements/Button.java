package pageelements;

import locators.Locator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Button extends BaseElement {


    public Button(WebDriver driver, Locator locator) {
        super(driver, locator);
    }

    public Button(WebElement elementToParse, Locator locator) {
        super(elementToParse, locator);
    }

    public Button(WebElement element) {
        super(element);
    }

    public Button click() {
        this.element.click();

        return this;
    }

    public Button isDisplayed() {
        this.element.isDisplayed();

        return this;
    }

    public Button isEnable() {
        this.element.isEnabled();

        return this;
    }

    public Button isSelected() {
        this.element.isSelected();

        return this;
    }
}
