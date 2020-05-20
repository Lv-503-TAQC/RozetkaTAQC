package pageelements;

import org.openqa.selenium.WebDriver;

public class HyperLink extends BaseElement {
    public HyperLink(WebDriver driver, String xpath) {
        super(driver, xpath);
    }

    public HyperLink click() {
        this.element.click();
        driver.getPageSource();
        return new HyperLink(driver, xpath);
    }


}
