package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Checkbox extends BaseElement {


    public Checkbox(WebDriver driver, String xpath) {
        super(driver, xpath);
    }

    public Checkbox(WebElement elementToParse, String xpath) {
        super(elementToParse, xpath);

    }
}
