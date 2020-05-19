package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkedText extends TextField {


    public LinkedText(WebDriver driver, String xpath) {
        super(driver, xpath);
    }

    public TextField click() {
        this.element.click();
        return this;
    }

    public String getAttribute(String attribute) {
        return this.element.getAttribute(attribute);
    }
}