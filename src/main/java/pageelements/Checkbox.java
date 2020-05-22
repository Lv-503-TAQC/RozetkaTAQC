package pageelements;

import locators.Locator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkbox extends BaseElement {


    public Checkbox(WebDriver driver, Locator locator) {
        super(driver, locator);
    }

    public Checkbox(WebElement elementToParse, Locator locator) {
        super(elementToParse, locator);
    }

    public Checkbox(WebElement element) {
        super(element);
    }

    public Checkbox click(){
        this.element.click();
        return this;
    }
}
