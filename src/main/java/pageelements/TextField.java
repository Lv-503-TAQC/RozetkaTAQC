package pageelements;

import locators.Locator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextField extends BaseElement {


    public TextField(WebDriver driver, Locator locator) {
        super(driver, locator);
    }

    public TextField(WebElement elementToParse, Locator locator) {
        super(elementToParse, locator);
    }

    public TextField(WebElement element) {
        super(element);
    }

    public String getText(){
        return this.element.getText();
    }

}
