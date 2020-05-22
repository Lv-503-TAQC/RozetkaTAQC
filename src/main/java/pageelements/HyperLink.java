package pageelements;

import locators.Locator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HyperLink extends BaseElement {
    public HyperLink(WebDriver driver, Locator locator) {
        super(driver, locator);
    }

    public HyperLink(WebElement elementToParse, Locator locator) {
        super(elementToParse, locator);
    }

    public HyperLink(WebElement element) {
        super(element);
    }


//    public HyperLink click() {
//        this.element.click();
//        driver.getPageSource();
//        return new HyperLink(driver, xpath);
//    }


}
