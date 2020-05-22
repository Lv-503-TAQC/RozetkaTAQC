package pageelements;

import locators.Locator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Label extends BaseElement {


    public Label(WebDriver driver, Locator locator) {
        super(driver, locator);
    }

    public Label(WebElement elementToParse, Locator locator) {
        super(elementToParse, locator);
    }

    public Label(WebElement element) {
        super(element);
    }

    public String getText() {
        return this.element.getText();
    }

    public String getAttribute(String attribute) {
        return this.element.getAttribute(attribute);
    }
}